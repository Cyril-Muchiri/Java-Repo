package com.chief;


class Box{
    double width;
    double depth;
    double height;
    //Box myBox=new Box();
}
 public class BoxDemo {

    public static void main(String[] args) {

        Box myBox=new Box();
        Box myBox2=new Box();
        double vol;
        double vol2;
        myBox.depth=12;
        myBox.height=20;
        myBox.width=15;

        myBox2.depth=10;
        myBox2.height=9;
        myBox2.width=12;

        vol= myBox.depth * myBox.height* myBox.width;

        System.out.println("volume for first box  is:  "+vol);


        vol2= myBox2.depth * myBox2.height* myBox2.width;
        System.out.println("volume for second box is:  "+vol2);
    }
}
