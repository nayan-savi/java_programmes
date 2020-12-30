package com.examples.functionalinterface;

import java.math.BigInteger;
import java.util.Scanner;

public class StringOccurrence {
    public static void main(String[] args) {
       /* String s = "kmretasscityylpdhuwjirnqimlkcgxubxmsxpypgzxtenweirknjtasxtvxemtwxuarabssvqdnktqadhyktagjxoanknhgilnm";
        BigInteger n = new BigInteger("736778906400");

        //System.out.println(n.intValue());

        BigInteger occurrence = getOccurrence(s, n);
        System.out.println(occurrence);

        BigInteger stringOccurrence = getStringOccurrence(s);
        System.out.println(stringOccurrence);
        System.out.println(n.divide(BigInteger.valueOf(100)).multiply(BigInteger.valueOf(7)));
        System.out.println("51574523448");*/
        Scanner scan = new Scanner(System.in);
        String s = scan.nextLine();
        String n = scan.nextLine();
        BigInteger output = getOccurrence(s, new BigInteger(n));
        System.out.println(output);

    }

    private static BigInteger getOccurrence(String s, BigInteger n) {
        int size = s.length();
        if(size == 1) {
            return n;
        } else {
            BigInteger firstTimeOccurrence = getStringOccurrence(s);
            if(n.compareTo(BigInteger.valueOf(size)) == -1) {
                return getStringOccurrence(s);
            } else {
                int stringOccurrence = 0;
                BigInteger result = n.divide(BigInteger.valueOf(size)).multiply(firstTimeOccurrence);
                BigInteger remaining = n.mod(BigInteger.valueOf(size));
                if(remaining.compareTo(BigInteger.valueOf(0)) == 1) {
                    stringOccurrence = getStringOccurrence(s.substring(0, remaining.intValue())).intValue();
                }
                return BigInteger.valueOf(stringOccurrence).add(result);
            }
        }
    }

    private static BigInteger getStringOccurrence(String s) {
        int count = 0;
        for (int i = 0; i < s.length(); i++) {
            if(s.charAt(i) == 'a')
                count++;
        }
        return BigInteger.valueOf(count);
    }
}
