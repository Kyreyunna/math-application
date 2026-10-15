package com.pluralsight;

public class MathApp {
    public static void main(String[] args) {


        //step1
        int bobSalary = 2;

        int garySalary = 200000;

        int highestSalary = Math.max(bobSalary, garySalary);

        System.out.println("The highest salary is " + highestSalary);
    }
}