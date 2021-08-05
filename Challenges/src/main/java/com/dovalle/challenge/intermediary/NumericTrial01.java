package com.dovalle.challenge.intermediary;

import java.util.Scanner;
import java.util.StringTokenizer;

public class NumericTrial01 {
    public static void run(){
        /*
        Challenge
You must read 5 integer values. Then show how many reported values are even, how many reported values are odd, how many reported values are positive, and how many reported values are negative.

Input
You will receive 5 integer values.

Exit
Display the message as shown in the output example below, one message per line and not forgetting the end of the line after each one.


Input Example
-5
0
-3
-4
12
Output Example
3 valor(es) par(es)
2 valor(es) ímpar(es)
1 valor(es) positivo(s)
3 valor(es) negativos(s)
        * */
        Scanner myScanner;
        StringTokenizer st;
        //declaring my variables
        int qtdPositives = 0;
        int qtdNegatives = 0;
        int qtdEvens = 0;
        int qtdOdds = 0;
        int QTD_READING = 5;
        //solution
        try {
            myScanner = new Scanner(System.in);

            for (int cont = 0; cont < QTD_READING; cont++) {
                //reading the entry and put into tokenizer.
                st = new StringTokenizer(myScanner.next());

                int typedValue = Integer.parseInt(st.nextToken());
                //verify if the typed value is POSITIVE or NEGATIVE, the increment the specified variable
                if (typedValue > 0) qtdPositives++;//positive
                else if (typedValue < 0) qtdNegatives++;//negative

                //verify if the typed value is ODD or EVEN, the increment the specified variable
                if (typedValue % 2 == 0) qtdEvens++;//even
                else qtdOdds++;//odd
            }
        }
        catch (Exception e){
            //TODO
        }
        finally {
            //writing the output properly as expected
            System.out.println(qtdEvens + " valor(es) par(es)");
            System.out.println(qtdOdds + " valor(es) impar(es)");
            System.out.println(qtdPositives + " valor(es) positivo(s)");
            System.out.println(qtdNegatives + " valor(es) negativo(s)");
        }
    }

}
