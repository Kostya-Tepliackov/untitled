package Lesson20;

import java.io.FileInputStream;
import java.io.IOException;

public class DZ2 {
    public static void main(String[] args) throws IOException {
    FileInputStream inputStream = new FileInputStream("c:/data.txt");
    long sum = 0;

    int minByte = Integer.MAX_VALUE;


    while(inputStream.available() > 0){
        int data = inputStream.read();
        sum+=data;
    }
    inputStream.close();

    System.out.println(sum);

}

}
