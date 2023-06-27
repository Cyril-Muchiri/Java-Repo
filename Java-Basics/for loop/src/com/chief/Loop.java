package com.chief;

import java.util.Arrays;
// program finds the duplicate number in an array
// program finds the maximum number in an array
// program finds the min number in an array
// program finds the totals of elements  number in the array
public class Loop {

    public static void main(String[] args) {

       int [] numbers= {1,13,32,4,6,3,6,8,9,0,12,12,13,-1,100,100,23,1};

       int sum=0;
       int counter=1;
       int j=1;
        System.out.println(" ");
        Arrays.sort(numbers);
        for (int i=0;i<numbers.length-1;i++) {
            j = i + 1;                              // block finds the duplicate number in an array


            if (numbers[i] == numbers[j])
                System.out.print(numbers[j]+", " );
                //break;
        }
        System.out.print("......This numbers are the duplicates in the array......\n");


        for (int x:numbers) {
            sum+=x;
            System.out.println("\n"+counter+")------- "+x);
            counter ++;

            if (x==5) break;                            //counter

        }
                                                        //totals,max and min calculated
        System.out.println("Totals: "+sum);
        System.out.println("\nminimum number in the array stack is "+numbers[0]);
       System.out.println("\nmaximum number in the array stack is "+numbers[numbers.length-1]);
        //System.out.println(Arrays.stream(numbers).max());


    }
}