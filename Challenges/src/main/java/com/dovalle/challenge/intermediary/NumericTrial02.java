package com.dovalle.challenge.intermediary;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class NumericTrial02 {
    public static void run(){
        /*
        Challenge
We need to know how much a certain company must pay its employees, but we only have the amount of hours worked and the hourly value. Write a program that reads an employee's number, their number of hours worked, the amount they receive per hour, and calculates that employee's salary. Then present the employee's number and salary, to two decimal places.

Input
You will receive 2 whole numbers and 1 number with two decimal places, representing the number, amount of hours worked and the amount the employee receives per hour worked.

Exit
Display the employee's number and salary, as shown below, with a blank space before and after the equality. In the case of salary, there must also be a blank space after the $.


Input Examples Output Examples
25
100
5.50

NUMBER = 25
SALARY = $550.00

1
200
20.50

NUMBER = 1
SALARY = U$4100.00

6
145
15.55

NUMBER = 6
SALARY = $2254.75
        * */
        BufferedReader br;
        StringTokenizer st;
        int employeeNumber = 0;
        int employeeHoursWorked = 0;
        double employeeCostPerHour = 0;
        double employeeSalary = 0;

        try{
            br = new BufferedReader(new InputStreamReader(System.in));
            st = new StringTokenizer(br.readLine());
            employeeNumber = Integer.parseInt(st.nextToken());

            st = new StringTokenizer(br.readLine());
            employeeHoursWorked = Integer.parseInt(st.nextToken());

            st = new StringTokenizer(br.readLine());
            employeeCostPerHour = Double.parseDouble(st.nextToken());

            employeeSalary = employeeHoursWorked * employeeCostPerHour;

        }
        catch (Exception e ){
         //TODO
        }
        finally {
            System.out.println("NUMBER = " + employeeNumber);
            System.out.printf("SALARY = U$ %.2f", employeeSalary);
        }
    }
}
