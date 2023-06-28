package com.chief;
import java.io.*;

public class Main {

    public static void main(String[] args) throws IOException {
	User user=new User();
        user.name="Muchiri";
    user.password="pass";

        FileOutputStream fout=new FileOutputStream("userInfo.ser");
        ObjectOutputStream out=new ObjectOutputStream(fout);
        out.writeObject(user);
        out.close();
        fout.close();

        System.out.println("info saved :)");

        FileReader reader=new FileReader("userInfo.ser");
        int data=reader.read();
        while(data!=-1){
            System.out.print((char)data);
            data=reader.read();

        }

    }
}
