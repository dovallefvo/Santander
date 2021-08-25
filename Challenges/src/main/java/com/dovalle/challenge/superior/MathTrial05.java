package com.dovalle.challenge.superior;

import java.util.Scanner;

public class MathTrial05 {

    public static void run(){
        /*
        Paulinho has a new problem in his hands. Now your teacher has asked you to build a program to check, from two very large values ​​A and B, whether B corresponds to the last digits of A.

        Input
        Input consists of several test cases. The first line of input contains an integer N that indicates the number of test cases. Each test case consists of two values ​​A and B greater than zero, each of which can be up to 1000 digits long.

        Exit
        For each input case, print a message indicating whether the second value fits the first value, as shown in the example below.

        Input example                               Output example
        4
        56234523485723854755454545478690 78690		encaixa
        5434554 543									nao encaixa
        1243 1243									encaixa
        54 64545454545454545454545454545454554		nao encaixa
        */
        Scanner myScanner = null;
        int qntTexts = 0;
        String firstText = "";
        String secondText = "";

        try {
            myScanner = new Scanner(System.in);
            qntTexts = Integer.parseInt(myScanner.next());

            for (int index = 0; index < qntTexts; index++) {
                myScanner = new Scanner(System.in);//comment this line just for tests in Server.
                firstText = myScanner.next();
                secondText = myScanner.next();
                String result = firstText.endsWith(secondText) ? "encaixa" : "nao encaixa";
                System.out.println(result);
            }
        }
        catch (Exception e){
            System.out.println(String.format("Error to test the String sequence. \nCause: %s \nMessage: %s", e.getCause(), e.getMessage()));
        }
        finally {
            if (myScanner != null){
                myScanner.close();
            }
        }
    }
}
