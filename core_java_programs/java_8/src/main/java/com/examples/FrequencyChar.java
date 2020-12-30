package com.examples;

public class FrequencyChar {

    public static void main(String[] args) {
        String s = "a";
        int alpha[] = new int[26];
        int ascii = 97;
        for (int i = 0; i < s.length(); i++) {
            char ch = s.charAt(i);
            int index = (int)ch - ascii;
            if(alpha[index] == 0) {
                alpha[index] = 1;
            } else {
                alpha[index] = alpha[index]+1;
            }
        }

        for (int i = 0; i < alpha.length; i++) {
            if(alpha[i] > 0) {
                char ch = (char) (ascii + i);
                System.out.print(ch+""+alpha[i]);
            }
        }

    }
}
