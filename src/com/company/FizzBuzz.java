package com.company;
//Working version of FizzBuzz
public class FizzBuzz {

    public static void main(String[] args)  {
        number1to100();
    }

    // Method for findig the multiples
    private static void number1to100() {
        // Write 1 to 100
        for(int i = 1; i <= 100; i++) {
            int val = i;
            if((i%3==0) && (i%5==0)) {
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
