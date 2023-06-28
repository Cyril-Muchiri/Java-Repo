package com.chief;

import java.util.Scanner;
// splits string function
public class Delimieters {
    public static void main(String args[]) {
        String msg = "Hello welcome to java programming";
        Scanner sc = new Scanner(msg);

        while (sc.hasNext()) {

            String tokens = sc.next();
            System.out.println(tokens);

            sc.close();


        }
    }
}