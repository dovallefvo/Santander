package com.dovalle.challenge.basic;

import java.util.Scanner;

public class BasicTrial02 {
    public static void run(){
        /*
Read an integer value X. Then present the 6 consecutive odd values from X, one value per line, including X if applicable.

Input
Input will be a positive integer value.

Exit
The output will be a sequence of six odd numbers.


Input example
8
Output example
9
11
13
15
17
19
        */
        Scanner myScanner = new Scanner(System.in);
        int x = myScanner.nextInt();
        int cont = 0;
        int qtdEven = 6;

        //x++;//adds +1, because it should be the next value about typed.
        while (cont < qtdEven ) {
            if ( x % 2  == 1) {
                System.out.println(x);
                cont++;
            }
            x++;
        }
    }
}
