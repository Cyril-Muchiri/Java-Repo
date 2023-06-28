package example;

import java.io.FileNotFoundException;
import java.io.PrintStream;

public class Main {
    public static void main(String [] y){
        try {
            PrintStream stream=new PrintStream("C:\\Users\\Baby Beast\\Desktop\\finalisima\\trial2.txt");
            stream.println("\nhello Muchiri ");
            stream.close();
        } catch (FileNotFoundException e) {
            throw new RuntimeException(e);
        }

    }
}
