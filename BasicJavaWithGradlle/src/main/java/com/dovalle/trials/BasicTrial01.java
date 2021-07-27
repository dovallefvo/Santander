package com.dovalle.trials;
import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class BasicTrial01 {

    public void runTrial01(){
        BufferedReader br;
        StringTokenizer st;
        int a;
        int b;
        int total = 0; // Altere o valor da variável com o cálculo esperado

        try{
            br = new BufferedReader(new InputStreamReader(System.in));
            st = new StringTokenizer(br.readLine());
            a = Integer.parseInt(st.nextToken());
            b = Integer.parseInt(st.nextToken());
            total = a + b;
        }
        catch (Exception e){
            //TODO
        }
        finally{
            System.out.println("X = " + total);
        }
    }


}
