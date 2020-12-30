package com.examples;


import jdk.nashorn.internal.objects.Global;
import jdk.nashorn.internal.parser.JSONParser;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.net.HttpURLConnection;
import java.net.URL;
import java.util.stream.Stream;

public class RestAPI {

    public static int getNumDraws(int year) throws IOException {
        int maxGoals = 11;
        int sum = 0;
        for (int i = 0; i < maxGoals; i++) {
            int goal = i;
            String GET_URL = "https://jsonmock.hackerrank.com/api/football_matches?year="
                    +year+"&team1goals="+goal+"&team2goals="+goal+"&page=1";
            URL obj = new URL(GET_URL);
            HttpURLConnection con = (HttpURLConnection) obj.openConnection();
            con.setRequestMethod("GET");
            BufferedReader in = new BufferedReader(new InputStreamReader(con.getInputStream()));
            String inputLine = in.readLine();
            int total = Integer.parseInt(inputLine.split(",")[2].split(":")[1]);
            sum += total;
            if(total == 0) break;
        }
        return sum;
    }

    public static void main(String[] args) throws IOException {
        int uefa_champions_league = getWinnerTotalGoals("UEFA Champions League", 2014);
        System.out.println(uefa_champions_league);

    }

    public static int getWinnerTotalGoals(String competition, int year) throws IOException {
        String name = "";
        competition = competition.replaceAll(" ", "%20");
        String GET_URL_WINNER = "https://jsonmock.hackerrank.com/api/football_competitions?name="+competition+"&year="+year;
        String winner_response = getResponse(GET_URL_WINNER);
        name = winner_response.split(",")[7].split(":")[1].replaceAll("\"", "");
        String GET_URL_TEAM1 = "https://jsonmock.hackerrank.com/api/football_matches?competition="+competition+"&year="+year+"&team1="+name+"&page=1";
        String team1_response = getResponse(GET_URL_TEAM1);
        int team1goals = getGoals(team1_response, "team1goals");
        String GET_URL_TEAM2 = "https://jsonmock.hackerrank.com/api/football_matches?competition="+competition+"&year="+year+"&team2="+name+"&page=1";
        String team2_response = getResponse(GET_URL_TEAM2);
        int team2goals = getGoals(team2_response, "team2goals");
        return team1goals + team2goals ;
    }

    public static int getGoals(String teamResponse, String whichTeam) {
        return Stream.of(teamResponse.replaceAll("\"", "").split(","))
                .filter(goals -> goals.startsWith(whichTeam))
                .mapToInt(goals -> Integer.parseInt(goals
                        .replaceAll(whichTeam+":", "")
                        .replaceAll("}","")
                        .replaceAll("]","")
                        )).sum();
    }

    public static String getResponse(String url) throws IOException {
        URL obj = new URL(url);
        HttpURLConnection con = (HttpURLConnection) obj.openConnection();
        con.setRequestMethod("GET");
        BufferedReader in = new BufferedReader(new InputStreamReader(con.getInputStream()));
        return in.readLine();
    }
}
