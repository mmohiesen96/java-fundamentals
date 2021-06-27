package com.company.averagefinder;

import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.util.Random;

public class Main {
    static String pluralize (String s , int count) {
        if(count < 0){
            return "Invalid Number";
        }
        else if (count == 1){
            return  s;
        }
        return s + "s";
    }

    static void flipNHeads (int headsInRow) {
        int flipCounter = 0 , headsCounter = 0;
        double coin;
        Random rnd = new Random();
        while(headsCounter < headsInRow) {
            coin = rnd.nextDouble();
            if (coin < 0.5) {
                System.out.println("tail");
                flipCounter++;
                headsCounter = 0;
            }
            else {
                System.out.println("heads");
                flipCounter++;
                headsCounter++;
            }
        }

        System.out.println("It took " + flipCounter + " "  + pluralize("flip" , flipCounter) +
                " to flip " +  headsInRow  +" heads in a row.");
    }

    static void clock () {
        int currentSec = 0;
        while(true) {
            LocalDateTime now = LocalDateTime.now();
            int hour = now.getHour();
            int minute = now.getMinute();
            int second = now.getSecond();
            String time = now.format(DateTimeFormatter.ofPattern("HH:mm:ss"));
            if(currentSec != second) {
                System.out.println(time);
                currentSec = second;
            }
        }


    }
    public static void main(String[] args) {
        int dogCount = 1;
        System.out.println("I own " + dogCount + " " + pluralize("dog", dogCount) + ".");

        int catCount = 2;
        System.out.println("I own " + catCount + " " + pluralize("cat", catCount) + ".");

        int turtleCount = 0;
        System.out.println("I own " + turtleCount + " " + pluralize("turtle", turtleCount) + ".");

        flipNHeads(5);

        clock();
    }
}
