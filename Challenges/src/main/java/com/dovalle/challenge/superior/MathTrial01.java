package com.dovalle.challenge.superior;
import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.Locale;
import java.util.Scanner;
import java.util.StringTokenizer;

public class MathTrial01 {
    public static void run() {
       /*
       The formula for calculating the area of a circle is: area = π . radius2. Considering for this problem that π = 3.14159:

        - Perform area calculation by squared radius value and multiplying by π.

            Input
            The input contains a floating point value (double precision), in this case the radius variable.

            Exit
            Display the message "A=" followed by the value of the variable area, as shown below, with 4 places after the decimal point. Use double precision variables (double). As with all problems, don't forget to print the end of line after the result, otherwise you will get "Presentation Error".


            Input Examples      Output Examples
                2.00            A=12.5664
              100.64            A=31819.3103
              150.00            A=70685.7750
        */
        Scanner myScanner;
        StringTokenizer st;
        Double area = 0.0;
        Double radius = 0.0;
        Double pi = 3.14159;

        try {
            myScanner = new Scanner(System.in);
            st = new StringTokenizer(myScanner.next());

            radius = Double.parseDouble(st.nextToken());
            area = pi * (Math.pow(radius, 2));
        }
        catch (Exception e){
            //TODO
        }
        finally {
            System.out.printf("A=%.4f\n", area);
        }
    }
}
