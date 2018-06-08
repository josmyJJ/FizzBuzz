package com.company;

//DOUBLE BONUS version of FizzBuzz
import java.util.Random;

public class FizzBuzz {
    static Random rand = new Random();
    static int randStart, randEnd;

    public static void main(String[] args) {
        getcrazyFizzBuzz();
    }

    private static void getcrazyFizzBuzz() {
        randStart = 1 + rand.nextInt(101);
        randEnd = 1 + rand.nextInt(101);

        if(randEnd<randStart) {
            System.out.println(randStart);
            System.out.println(randEnd);
            System.out.println("Ending number is less than staring number. Please try again!");
        }else if(randStart == randEnd) {
            System.out.println("Shazam!!");
        }else {
            // getDigits() method checks number of digits
            getDigits();
            // Call the getFizzBuzz() method
            getFizzBuzz();
        }
    }
    private static void getDigits() {
        int numDigits = randEnd - randStart;
        if(numDigits < 10) {
            System.out.println("This won't take long!");
            System.out.println("::::::::::::::::::");
        }
    }
    private static void getFizzBuzz() {
        int counter = 0;
        for(int i = randStart; i <= randEnd; i++) {

            int val = i;
            if((i%3==0) && (i%5==0)) {
                System.out.println("Fizz Buzz");
            }else if(i%3==0) {
                System.out.println("Fizz");
            }else if(i%5==0) {
                System.out.println("Buzz");
            }else if(i%7==0) {
                System.out.println(i + " - multiples of seven");
            }else if ((i%2==0)){

                String[] list = {"Rock", "Paper", "Scissors", "Lizard", "Spock"};
                if(i > 10){
                    System.out.println(i + " - " + list[counter]);
                    counter++;
                    if(counter == 5){
                        counter = 0;
                    }
                }
                //
            }if(i>20){
                String hp = Integer.toString(i);
                //System.out.println( i + " HP " + hp);
                String endNum = hp.substring(1);
                if(endNum.equals("1")){
                    System.out.println(i + " - Harry");
                }else if(endNum.equals("2")){
                    System.out.println(i + " - Harry");
                }else if(endNum.equals("3")){
                    System.out.println(i + " - Harry");
                }else if(endNum.equals("4")){
                    System.out.println(i + " - Potter");
                }else if(endNum.equals("5")){
                    System.out.println(i + " - Potter");
                }else if(endNum.equals("6")){
                    System.out.println(i + " - Harry");
                }else if(endNum.equals("7")){
                    System.out.println(i + " - Harry");
                }else if(endNum.equals("8")){
                    System.out.println(i + " - Harry");
                }else if(endNum.equals("9")){
                    System.out.println(i + " - Potter");
                }else if(endNum.equals("0")){
                    System.out.println(i + " - Potter");
                }

            }
            else {
                System.out.println(val);
            }
        }
    }

}
