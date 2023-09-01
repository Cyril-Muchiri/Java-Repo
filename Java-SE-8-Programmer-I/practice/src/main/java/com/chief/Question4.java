package com.chief;

import java.io.IOException;

class X{
    public void print() throws IOException{
        throw new IOException(null, null);
    }
}
public class Question4 {
    public static void main(String[] args) throws Exception {
        X xObj=new X();
        xObj.print();
    }
}
