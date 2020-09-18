package com.company;

public class Lab1v3 {

    public static void main(String[] args) {
        String Cotton;
        Cotton = "Where did you come from";
        System.out.println (Cotton);
        String Eye;
        Eye = "Where did you go";
        System.out.println (Eye);
        String Joe;
        Joe = "Where did you come from Cotton Eye Joe";
        System.out.println (Joe);
        Cotton = "I'd be married a long time ago";
        System.out.println (Cotton);
        System.out.println (Joe.length());
        System.out.println (Eye.matches(Cotton));
        System.out.println (Cotton.intern());


        final int MyInt = 10;
        MyInt = MyInt / 10;
    }
}
