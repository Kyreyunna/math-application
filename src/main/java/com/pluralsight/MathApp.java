package com.pluralsight;

public class MathApp {
    public static void main(String[] args) {


        //step1
        //Q1
        int bobSalary = 2;

        int garySalary = 200000;

        int highestSalary = Math.max(bobSalary, garySalary);

        System.out.println("The highest salary is " + highestSalary);

        //Q2
        int truckPrice= 10000;
        int carPrice= 6000;
        int lowestPrice = Math.min(truckPrice, carPrice);

        System.out.println("The lowest price is " + lowestPrice);

        //Q3
        float radius = 7.25F;
        float π =3.14159F;
        //float areaCircle= π * (radius * radius);
        //or
        double areaCircle= (π * (Math.pow(7.25,2)));
        System.out.println("The area of the circle is " + areaCircle);


        //Q4
        // there is a class of 49 that needs to be split into two groups. How many students are in each group?
        int numStudents=49;

        double sizeGroup= Math.sqrt(49);

        System.out.println("The class will be split into two groups of " + sizeGroup);

        numStudents=5;
        double sizeGroup2= Math.sqrt(5);
        System.out.println("The class will be split into two groups of " + sizeGroup2);

        //Q5
        // (5, 10) and (85, 50)
        int x1=5 ; int x2=85 ; int y1=10 ; int y2=50 ;


        //x2 and x1 difference, y1 and y2 difference
       int x3= 80;
       int y3= 40 ;

       // y3 to the power of two and then x3 to the power of two
       double y4 = Math.pow(40,2);
       double x4 = Math.pow(80,2);
       System.out.println(y4);
       System.out.println(x4);

       // addition of y4 and x4
      int z= 1600 + 6400;
        System.out.println(z);

        //the square root of z is the distace which completes the formula
        double distance= Math.sqrt(8000);
        System.out.println("The distance is " + distance);

        //Q6
        // absolute positive value of temperature
        double temperature= -3.8;
        double temperature2=Math.abs(-3.8);
        System.out.println("The positive value is " + temperature2);

        //Q7
        // distance between zero and one
       double randomNumber= Math.random()/Math.nextDown(1.0);
        System.out.println(randomNumber);

        //Q8
        // how many minutes in 24 days
        // bonus how many milliseconds
        //int oneDay=24 hours;
        int twentyFour= 24 * 24;
        System.out.println(twentyFour);
        //there are 576 hours in 24 days
        //each hour is 60 minutes
        int minTwenty= 60*576;
        System.out.println("There are " + minTwenty + " " + "minutes in 24 days");
        //There are 1000 milliseconds in one second
        // the minutes in 24 days * seconds per minute * milliseconds
        int milliTwenty = 34560 * 60 * 1000;
        System.out.println("There are " + milliTwenty + " " + "milliseconds in 24 days");






    }
}