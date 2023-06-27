package com.example;

public class Fibonnaci {
    public static void main(String []args){

        int count = 10; // Number of Fibonacci numbers to generate

        System.out.println("Fibonacci Series up to " + count + " numbers:");
        int num1 = 0, num2 = 1;

        
        System.out.print(num1 + " " + num2);

        for (int i = 2; i < count; i++) {
            int fibNum = num1 + num2;
            System.out.print(" " + fibNum);
            num1 = num2;
            num2 = fibNum;
        }
       /* for (k=0;k<10;k++){
            //iterator
            x=i+j;
            System.out.println(x);
            j=x;
           // i+=j;


        }*/
    }
}
