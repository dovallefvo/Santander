package com.dovalle.challenge.superior;

import java.util.Scanner;

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
        Scanner myScanner = null;

        int qntTexts = 0;
        String firstText = "";
        String secondText = "";
        String shuffledWords = "";

        try {
            myScanner = new Scanner(System.in);
            qntTexts = Integer.parseInt(myScanner.next());

            for (int index = 0; index < qntTexts; index++) {
                myScanner = new Scanner(System.in);//comment this line just for tests in Server.
                firstText = myScanner.next();
                secondText = myScanner.next();
                shuffledWords = shuffleWords(firstText, secondText);
                System.out.println(shuffledWords);
            }
        }
        catch (Exception e){
            //shuffle.append(String.format("Error to shuffle words. \nCause: %s \nMessage: %s", e.getCause(), e.getMessage()));
            System.out.println(String.format("Error to read the text. QntTexts: %s \nFirst Text: %s \nSecond Text: %s", qntTexts, firstText, secondText));
        }
        finally {
            if (myScanner != null){
                myScanner.close();
            }
        }
    }

    private static String shuffleWords(String fistText, String secondText){
        StringBuilder shuffle = new StringBuilder("");
        try {
            //String splittedText[] = fullText.split(" ");
            String firstTxt = fistText;
            String secondTxt = secondText;
            int restLength = Math.abs(firstTxt.length() - secondTxt.length());
            //declare and set by default fist and second text as small and big texts - respectively
            String smallTxt = fistText;
            String bigTxt = secondText;
            //verify whether the first is bigger than second, then change the initial value for small and big text.
            if(firstTxt.length() >  secondTxt.length()){
                smallTxt = secondTxt;
                bigTxt = firstTxt;
            }

            //starts the shuffle word by word, always with the first text with second text
            for (int index = 0; index < smallTxt.length(); index++) {
                shuffle.append(firstTxt.substring(index, index+1));
                shuffle.append(secondTxt.substring(index, index+1));
            }

            //verify if exists any rest, then appends its.
            if (restLength > 0) {
                shuffle.append(bigTxt.substring(smallTxt.length(), bigTxt.length()));
            }
        }
        catch (Exception e){
            shuffle.append(String.format("Error to shuffle words. \nCause: %s \nMessage: %s", e.getCause(), e.getMessage()));
        }

        return shuffle.toString();
    }
}
