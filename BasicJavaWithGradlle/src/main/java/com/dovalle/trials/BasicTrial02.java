package com.dovalle.trials;

import java.util.Scanner;

public class BasicTrial02 {
    public static void runTrial02(){
        /*
Leia um valor inteiro X. Em seguida apresente os 6 valores ímpares consecutivos a partir de X, um valor por linha, inclusive o X se for o caso.

Entrada
A entrada será um valor inteiro positivo.

Saída
A saída será uma sequência de seis números ímpares.


Exemplo de Entrada
8
Exemplo de Saída
9
11
13
15
17
19
        */
        Scanner leitor = new Scanner(System.in);
        int x = leitor.nextInt();
        int cont = 0;
        int qtdImpar = 6;

        //x++;//acrescenta +1, pois deve ser subsequente ao valor inicial informado
        while (cont < qtdImpar ) {
            if ( x % 2  == 1) {
                System.out.println(x);
                cont++;
            }
            x++;
        }
    }
}
