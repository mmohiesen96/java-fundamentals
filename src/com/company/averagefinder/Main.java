package com.company.averagefinder;

public class Main {
    public static String pluralize (String s , int count) {
        if(count < 0){
            return "Invalid Number";
        }
        else if (count == 1){
            return  s;
        }
        return s + "s";
    }
    public static void main(String[] args) {
        int dogCount = 1;
        System.out.println("I own " + dogCount + " " + pluralize("dog", dogCount) + ".");

        int catCount = 2;
        System.out.println("I own " + catCount + " " + pluralize("cat", catCount) + ".");

        int turtleCount = 0;
        System.out.println("I own " + turtleCount + " " + pluralize("turtle", turtleCount) + ".");

    }
}
