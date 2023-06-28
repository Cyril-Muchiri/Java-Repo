package com.chief;

import java.io.FileInputStream;
import java.io.FileReader;
import java.io.IOException;
import java.io.ObjectInputStream;

public class Main {

    public static void main(String[] args) throws Exception {
        User user;

        FileInputStream fin = new FileInputStream("C:\\Users\\Baby Beast\\IdeaProjects\\Serialization\\UserInfo.ser");
        ObjectInputStream oin = new ObjectInputStream(fin);
        user = (User) oin.readObject();
        fin.close();
        oin.close();

         System.out.println(user.name);
        System.out.println(user.password);
        user.sayHello();

      /*  FileReader reader = new FileReader("C:\\Users\\Baby Beast\\IdeaProjects\\Serialization\\UserInfo.ser");
        int data = reader.read();
        while (data != -1) {
            System.out.print((char) data);
            data = reader.read();*/
        }
    }
