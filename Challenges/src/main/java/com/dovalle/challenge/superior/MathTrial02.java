package com.dovalle.challenge.superior;

import java.util.Locale;
import java.util.Scanner;

public class MathTrial02 {

    public static void run(){
        /*
            Read four numbers (N1, N2, N3, N4), each with one decimal place, corresponding to a student's four grades. Calculate the average with weights 2, 3, 4 and 1, respectively, for each of these grades and display this average accompanied by the message "Media: ". If this average is greater than or equal to 7.0, print the message "Student Approved.". If the calculated average is less than 5.0, print the message "Student Failed.". If the calculated average is a value between 5.0 and 6.9, including these, the program must print the message "Student in examination.".

            In case the student is taking an exam, read a value corresponding to the exam grade obtained by the student. Then print the message "Exam Grade: " accompanied by the grade entered. Recalculate the average (add the exam score to the previously calculated average and divide by 2). and print the message "Student Approved." (if the final grade is 5.0 or more) or "Student Failed.", (if the grade is 4.9 or less). For these two cases (pass or fail after taking the exam) present in the last line a message "Final average: " followed by the final average for that student.

            Input
            The input contains four floating point numbers corresponding to the student grades.

            Exit
            All answers must be presented to one decimal place. Messages should be printed as per the problem description. Don't forget to print the enter after the end of each line, otherwise you will get "Presentation Error".

            Input example               Output example
            2.0 4.0 7.5 8.0 6.4         Media: 5.4
                                        Aluno em exame.
                                        Nota do exame: 6.4
                                        Aluno aprovado.
                                        Media final: 5.9

            2.0 6.5 4.0 9.0             Media: 4.8
                                        Aluno reprovado.

            9.0 4.0 8.5 9.0             Media: 7.3
                                        Aluno aprovado.


        */
        Scanner myScanner = null;

        float noteValue = 0;
        float notesMean = 0;
        int notesWeight[] = {2, 3, 4, 1};
        int totalWeight = 0;
        int NOTE_APPROVED = 7;
        int NOTE_REPPROVED = 5;
        int EXAM_APROVED = 5;

        try {
            myScanner = new Scanner(System.in);
            myScanner.useLocale(Locale.ENGLISH);
            Locale.setDefault(new Locale("en", "US"));

            for (int index = 0; index < notesWeight.length; index++) {
                noteValue = myScanner.nextFloat();
                notesMean = (notesMean + (noteValue * notesWeight[index]));
                totalWeight += notesWeight[index];
            }
            notesMean = notesMean / totalWeight;
            System.out.printf("Media: %.1f\n", notesMean);

            if (notesMean >= NOTE_APPROVED){
                System.out.println("Aluno aprovado.");
            }
            else if (notesMean < NOTE_REPPROVED){
                System.out.println("Aluno reprovado.");
            }
            else {
                System.out.println("Aluno em exame.");
                noteValue = myScanner.nextFloat();
                System.out.printf("Nota do exame: %.1f\n", noteValue);

                notesMean = (notesMean + noteValue) / 2;

                String statusExam = (notesMean >= EXAM_APROVED) ? "Aluno aprovado.\n" : "Aluno reprovado.\n" ;
                System.out.println(statusExam);
                System.out.printf("Media final: %.1f\n", notesMean);
            }
        }
        catch (Exception e){
            //TODO
        }
        finally {
            if (myScanner != null){
                myScanner.close();
            }
        }
    }

    private static void bugDIO (){
        Scanner sc = new Scanner(System.in);
        sc.useLocale(Locale.ENGLISH);
        Locale.setDefault(new Locale("en", "US"));
        float n1, n2, n3, n4, media;
        double emexame, emexamefinal;
        n1 = sc.nextFloat();
        n2 = sc.nextFloat();
        n3 = sc.nextFloat();
        n4 = sc.nextFloat();
        media = ((n1 * 2) + (n2 * 3) + (n3 * 4) + (n4 * 1)) / 10;
        System.out.printf("Media: %.1f%n" , media);
        if (media >= 7.0) {
            System.out.println("Aluno aprovado.");
        }

        if (media < 5.0) {
            System.out.println("Aluno reprovado.");
        }
        if (media >= 5.0 && media <= 6.9) {
            System.out.println("Aluno em exame.");
            emexame = sc.nextDouble();
            System.out.printf("Nota do exame: %.1f%n", emexame);
            emexamefinal = ((emexame + media) / 2.0);
            if (emexamefinal >= 5.0) {
                System.out.println("Aluno aprovado.");
                System.out.printf("Media final: %.1f%n", emexamefinal);
            }else{
                System.out.println("Aluno reprovado");
                System.out.printf("Media final: %.1f%n", emexamefinal);
            }
        }
        sc.close();
    }
}
