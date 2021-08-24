package com.dovalle.challenge.superior;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;
import java.util.StringTokenizer;

public class MathTrial04 {

    public static void run(){
        /*
        Challenge
        Create an algorithm that takes two inputs that are strings and combines them by alternating the letters in each string.

        It should start with the first letter of the first string, followed by the first letter of the second string, then the second letter of the first string and continue like this successively.

        The remaining letters from the longest string must be added to the end of the resulting string and returned.

        Input
        The input contains several test cases. The first line contains an integer N that indicates the number of test cases that comes next. Each test case consists of a line containing two strings of characters, each string containing between 1 and 50 characters inclusive.

        Exit
        Combine the two input strings as shown in the example below and display the resulting string.

        Input Example           Output Example
        2                       aBAb
        aA Bb                   abab
        aa bb
        */
        Scanner myScanner;
        StringTokenizer st;

        int qntTexts = 0;
        Map<Integer, String> mapTexts = new HashMap<>();

        try {
            myScanner = new Scanner(System.in);
            qntTexts = Integer.parseInt(myScanner.next());

            st = new StringTokenizer(myScanner.next());

            for (int index = 0; index < qntTexts; index++) {
                shuffleWords(st.nextToken());
            }
        }
        catch (Exception e){
            //TODO
        }
        finally {

        }
    }

    private static String shuffleWords(String fullText){
        StringBuilder shuffle = new StringBuilder();
        String splittedText[] = fullText.split(" ");
        String firstText = splittedText[0];
        String secondText = splittedText[1];

        int smallLength = (splittedText[0].length() >  splittedText[1].length()) ? splittedText[1].length() : splittedText[0].length();

        for (int index = 0; index < smallLength; index++) {
            shuffle.append(firstText.substring(index, index+1));
            shuffle.append(secondText.substring(index, index+1));
        }
        return shuffle.toString();
    }
}
