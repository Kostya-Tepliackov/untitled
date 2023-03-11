package Lesson20;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

public class Example1 {
    public static void main(String[] args) throws IOException {
        FileInputStream inputStream = new FileInputStream("c:/data.txt");
        long sum = 0;

        while(inputStream.available() > 0){
            int data = inputStream.read();
            sum+=data;
        }
        inputStream.close();
    }
}
