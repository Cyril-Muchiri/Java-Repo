package main;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.nio.ByteBuffer;
import java.nio.channels.SeekableByteChannel;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;

public class Main {

    public static void main(String [] args) throws FileNotFoundException {
        String content;
//        filePath="C:\\Users\\Baby Beast\\Desktop\\finalisima\\trial.txt";
      Path filePath=Path.of("C:\\Users\\Baby Beast\\Desktop\\finalisima\\trial3.txt");
        BufferedReader reader=new BufferedReader(new FileReader(filePath.toFile()));
        try {
//
            while((content=reader.readLine()) !=null) {
                System.out.println(content);
            }reader.close();
        } catch (IOException e) {
            throw new RuntimeException(e);
        }

    }}
