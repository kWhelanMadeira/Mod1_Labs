package com.company;

import java.util.Scanner;

public class Lab3 {
    private static Byte January;

    public static void main(String[] args) {
        //Part 1//

        System.out.println("Enter your age in years");

        int Age;
        Scanner TheirAge = new Scanner(System.in);
        Age = TheirAge.nextInt();

        if (Age > 16) System.out.println("You may drive!");
        else System.out.println("You may... ride in the car with someone else!");
        if (Age > 18) System.out.println("You may get a tattoo!");
        else System.out.println("You can always break the law and get a tattoo anyway");
        if (Age < 35) System.out.println("You shall not be president on this day");
        else
            System.out.println("You are legally allowed to apply to be the leader of this country... why you would is beyond me");


        //Part 2//

        System.out.println("Please enter your birth month");

        Scanner Month = new Scanner(System.in);
        String TheirMonth = Month.nextLine();

        if (TheirMonth.equals("January")) System.out.print("You are either a Capricorn or an Aquarius");
        else if (TheirMonth.equals("February")) System.out.println("You are either an Aquarius or a Pisces");
        else if (TheirMonth.equals("March")) System.out.println("You are either a Pisces or an Aries");
        else if (TheirMonth.equals("April")) System.out.println("You are either an Aries or a Taurus");
        else if (TheirMonth.equals("May")) System.out.println("You are either a Taurus or or a Gemini");
        else if (TheirMonth.equals("June")) System.out.println("You are either a Gemini or a Cancer");
        else if (TheirMonth.equals("July")) System.out.println("You are either a Cancer or a Leo");
        else if (TheirMonth.equals("August")) System.out.println("You are either a Leo or a Virgo");
        else if (TheirMonth.equals("September")) System.out.println("You are either a Virgo or a Libra");
        else if (TheirMonth.equals("October")) System.out.println("You are either a Libra or a Scorpio");
        else if (TheirMonth.equals("November")) System.out.println("You are either a Scorpio or a Sagittarius");
        else if (TheirMonth.equals("December")) System.out.println("You are either a Sagittarius or a Capricorn");
        else System.out.println("That's not a real month, silly");

        //Part 3//

        System.out.println("");
        System.out.println("Enter your age in years again, please; do not question me");


        //make an int for 0 and add 365 for each value of age

        int Years;
        int i = 365;
        Scanner ThemAge = new Scanner(System.in);
        Years = ThemAge.nextInt();

        int prod1 = i * Years;

        int b = 30;
        int prod2 = prod1 + b;
        int prod3 = prod2 + b;
        int prod4 = prod3 + b;
        int prod5 = prod4 + b;
        int prod6 = prod5 + b;
        int prod7 = prod6 + b;
        int prod8 = prod7 + b;
        int prod9 = prod8 + b;
        int prod10 = prod9 + b;
        int prod11 = prod10 + b;
        int prod12 = prod11 + b;


        if (TheirMonth.equals("January")) System.out.println(prod1);
        else if (TheirMonth.equals("February")) System.out.println(prod2);
        else if (TheirMonth.equals("March")) System.out.println(prod3);
        else if (TheirMonth.equals("April")) System.out.println(prod4);
        else if (TheirMonth.equals("May")) System.out.println(prod5);
        else if (TheirMonth.equals("June")) System.out.println(prod6);
        else if (TheirMonth.equals("July")) System.out.println(prod7);
        else if (TheirMonth.equals("August")) System.out.println(prod8);
        else if (TheirMonth.equals("September")) System.out.println(prod9);
        else if (TheirMonth.equals("October")) System.out.println(prod10);
        else if (TheirMonth.equals("November")) System.out.println(prod11);
        else if (TheirMonth.equals("December")) System.out.println(prod12);

        System.out.println("^That's how many days you've been alive, approximately");









    }
}