package com.dovalle.challenge.intermediary;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Scanner;
import java.util.StringTokenizer;

public class NumericTrial03 {
    public static void run(){
        /*
        Challenge
Read an integer value. Then calculate the smallest possible number of notes (ballots) where the value can be decomposed. The grades you should consider are 100, 50, 20, 10, 5, 2 and 1. Then show the value read and the ratio of grades required.

Input
You will receive an integer value N (0 < N < 1000000).

Output
Display the value read and the maximum amount of notes of each type required, following the example output below. The end of the line must be printed after each line.

Input example	    Output example
576                 576
                    5 nota(s) de R$ 100,00
                    1 nota(s) de R$ 50,00
                    1 nota(s) de R$ 20,00
                    0 nota(s) de R$ 10,00
                    1 nota(s) de R$ 5,00
                    0 nota(s) de R$ 2,00
                    1 nota(s) de R$ 1,00
---------------------------------------------
11257               11257
                    112 nota(s) de R$ 100,00
                    1 nota(s) de R$ 50,00
                    0 nota(s) de R$ 20,00
                    0 nota(s) de R$ 10,00
                    1 nota(s) de R$ 5,00
                    1 nota(s) de R$ 2,00
                    0 nota(s) de R$ 1,00
---------------------------------------------
503                 503
                    5 nota(s) de R$ 100,00
                    0 nota(s) de R$ 50,00
                    0 nota(s) de R$ 20,00
                    0 nota(s) de R$ 10,00
                    0 nota(s) de R$ 5,00
                    1 nota(s) de R$ 2,00
                    1 nota(s) de R$ 1,00
        * */
        Scanner myScanner;
        StringTokenizer st;
        StringBuilder msgMaxNotes = new StringBuilder();
        try {
            Integer[] bankNotes = {100, 50, 20, 10, 5, 2, 1};
            myScanner = new Scanner(System.in);
            st = new StringTokenizer(myScanner.next());

            int noteTyped = Integer.parseInt(st.nextToken());
            msgMaxNotes.append(String.format("\n%s", noteTyped));
            //initialize the note modulus with own note typed.
            int modulusNotes = noteTyped;
            //start the note's decomposition
            for (int index = 0; index < bankNotes.length; index++) {
                //calculate the quantity of notes
                int qtdNoteAux = modulusNotes / bankNotes[index];
                String msgTemp = String.format("\n%s nota(s) nota(s) de R$ %s,00", qtdNoteAux, bankNotes[index]);
                msgMaxNotes.append(msgTemp);
                //update the modulus basing at the current bankNote
                modulusNotes = modulusNotes % bankNotes[index];
            }
        }
        catch (Exception e){
            //TODO
        }
        finally {
            System.out.println(msgMaxNotes.toString());
        }
    }

    /**
     * This method was necessary, because at DIO did'nt accepted the static method: run
     *
     * @throws IOException
     */
    private void bugDIO() throws IOException {
        String valorpagar;

        int apagar;

        int[] notas = new int[]{100, 50, 20, 10, 5, 2, 1};

        int[] totalNotas = new int[7];



        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        valorpagar = br.readLine();

        if (valorpagar != null && !"".equalsIgnoreCase(valorpagar) && !"0".equalsIgnoreCase(valorpagar)) {

            apagar = Integer.parseInt(valorpagar);

            for (int i = 0; i < 7; i++) {

                if (apagar >= notas[i]) {

                    totalNotas[i] = apagar / notas[i];

                    apagar = apagar - totalNotas[i] * notas[i];

                }
            }
            System.out.println("" + Integer.parseInt(valorpagar));

            for (int i = 0; i < 7; i++) {
                System.out.println(totalNotas[i] + " nota(s) de R$ " + notas[i] +",00");
            }
        }
    }
}
