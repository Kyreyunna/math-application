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
        int x1=5;
        int x2=10;
        int y1=85;
        int y2=50;

       int x3= -5;
       int y3= 35 ;

       double y4 = Math.pow(35,2);
       double x4 = Math.pow(-5,2);
        System.out.println(y4);
        System.out.println(x4);

      double y4+x4=
        double Math.sqrt();

    }
}