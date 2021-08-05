package com.dovalle.challenge.basic;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;
import java.util.StringTokenizer;
import java.util.stream.Collectors;

public class BasicTrial03 {
    public void basicTrial03(){
        /*
        Challenge
Create a program that reads 6 values. You may receive negative and/or positive values input, but null values be disregarded. Then present the number of positive values entered.

Input
You will receive six values, negative and/or positive.

Exit
Display a message saying how many positive values were read as shown below in the output example. Don't forget the "positive values" message at the end.


Input example
7
-5
6
-3.4
4.6
12
Output sample
4 valores positivos
         */
        List<Double> numbersList = new ArrayList<>();
        int qtdPositiveNumbers = 0;
        int QTD_READING = 6;
        Scanner myScanner = new Scanner(System.in);

        for (var count = 0; count < QTD_READING; count++){
            try{
                //Scanner the value that  user typed in console
                String typeValue = myScanner.next().trim();
                //grants that typed has a value
                if (!typeValue.isBlank()){
                    Double value = Double.parseDouble(typeValue);
                    numbersList.add(value);
                }
            }
            catch (Exception e){
                //do nothing
            }
        }
        qtdPositiveNumbers = numbersList.stream().filter(num -> num > 0).collect(Collectors.toList()).size();
        System.out.println(String.format("%s valores positivos", qtdPositiveNumbers));
    }

    public static void runTrial03Simple(){
        /*
        Challenge
Create a program that reads 6 values. You may receive negative and/or positive values input, but null values be disregarded. Then present the number of positive values entered.

Input
You will receive six values, negative and/or positive.

Exit
Display a message saying how many positive values were read as shown below in the output example. Don't forget the "positive values" message at the end.


Input example
7
-5
6
-3.4
4.6
12
Output sample
4 valores positivos
         */
        int qtdPositiveNumbers = 0;
        int QTD_READING = 6;
        try {
            BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

            for (var count = 0; count < QTD_READING; count++) {
                StringTokenizer st = new StringTokenizer(br.readLine());
                int qtdTokens = st.countTokens();
                qtdPositiveNumbers = readConsoleValue(st.nextToken()) > 0 ? qtdPositiveNumbers + 1 : qtdPositiveNumbers + 0;
            }
        }
        catch (Exception e){
            //
        }
        finally {
            System.out.println(String.format("%s valores positivos", qtdPositiveNumbers));
        }
    }

    private static Double readConsoleValue(String typeValue){
        Double value = 0.0;
        try{
            if (!typeValue.isBlank()){
                value = Double.parseDouble(typeValue);
            }
        }
        catch (Exception e){
            //do nothing
        }
        return value;
    }
}
