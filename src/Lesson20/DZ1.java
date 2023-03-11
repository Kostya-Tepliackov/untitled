package Lesson20;

import java.io.BufferedReader;
import java.io.FileInputStream;
import java.io.InputStreamReader;

public class DZ1 {

    public static void main(String[] args) throws Exception {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        FileInputStream file = new FileInputStream(reader.readLine());
        int max = file.read();
        while (file.available()>0)
        {
            int data = file.read();
            if (data>max)
            {
                max = data;
            }

        }
        file.close();
        System.out.println(max);
    }
}

