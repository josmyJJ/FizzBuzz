package com.company;
// Shazam version of FizzBuzz

import java.util.Random;

public class FizzBuzz {
    static Random rand = new Random();
    public static void main(String[] args) {number1to100();
    }

    // Method for findig the multiples
    private static void number1to100() {
        int randStart = 1 + rand.nextInt(101);
        int randEnd = 1 + rand.nextInt(101);
        System.out.println(randStart);
        System.out.println(randEnd);

        for(int i = randStart; i <= randEnd; i++) {
            int val = i;
            if(randStart == randEnd) {
                System.out.println("Shazam!!");
            }else if((i%3==0) && (i%5==0)) {
                System.out.println("FizzBuzz");
            }else if(i%3==0) {
                System.out.println("Fizz");
            }else if(i%5==0) {
                System.out.println("Buzz");
            }else {
                System.out.println(val);
            }
        }
    }
}
