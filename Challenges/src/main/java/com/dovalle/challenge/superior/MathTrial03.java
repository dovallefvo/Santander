package com.dovalle.challenge.superior;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.List;

public class MathTrial03 {

    public static void run(){
        /*
        Challenge
        Turtle racing is a sport that has grown a lot in recent years, making several competitors dedicated to catching fast turtles, and training them to earn millions in races around the world. But the task of capturing turtles is not a very easy task, as almost all these reptiles are very slow. Each turtle is classified in a level depending on its speed:


        Level 1: If the speed is less than 10 cm/h .
        Level 2: If the speed is greater than or equal to 10 cm/h and less than 20 cm/h.
        Level 3: If the speed is greater than or equal to 20 cm/h .

        Your task is to identify the speed level of the fastest turtle in a group.

        Input
        The input consists of multiple test cases, each consisting of two lines: The first line contains an integer L (1 ≤ L ≤ 500) representing the number of turtles in the group, and the second line contains L integers Vi (1 ≤ Vi ≤ 50) representing the velocities of each turtle in the group.

        Exit
        For each test case, print a single line indicating the speed level of the fastest turtle in the group.

        */
        BufferedReader br = null;
        int qntTurtles = 0;
        String strVelocities = null;
        String turtleVelocities[];
        int FAST_VELOCITY = 20;
        int LAZY_VELOCITY = 10;
        int FAST_LEVEL = 3;
        int MEDIUM_LEVEL = 2;
        int LAZY_LEVEL = 1;

        try {
            br = new BufferedReader(new InputStreamReader(System.in));
            //read the console while need
            do {
                qntTurtles = Integer.parseInt(br.readLine());
                strVelocities = br.readLine();
                turtleVelocities = strVelocities.split(" ");
                int higherFastLevel = 0;

                //iterates the quantity of turtles and their velocities
                for (int index = 0; index < qntTurtles; index++) {
                    int fastAux = Integer.parseInt(turtleVelocities[index]);
                    int levelAux = 0;

                    //compare the velocity and set the level
                    if (fastAux >= FAST_VELOCITY) levelAux = FAST_LEVEL;
                    else if (fastAux < LAZY_VELOCITY) levelAux = LAZY_LEVEL;
                    else levelAux = MEDIUM_LEVEL;

                    //compare the higher level of this turtle group
                    higherFastLevel = higherFastLevel < levelAux ? levelAux : higherFastLevel;
                }

                System.out.println(higherFastLevel);
            } while (br.ready());

        }
        catch (Exception e){
            //TODO
        }
        finally {
            //TODO
        }
    }
}
