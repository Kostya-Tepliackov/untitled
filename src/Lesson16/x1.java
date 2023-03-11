package Lesson16;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.List;

public class x1 {
    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        List<String> list = new ArrayList<>();
        int max = 0;
        for (int i = 0; i < 5; i++) {
            list.add(i, reader.readLine());
            if(list.get(i).length() > max){
                max = list.get(i).length();
            }
        }

        for (int i = 0; i < list.size(); i++) {
            if(max == list.get(i).length()){
                System.out.println(list.get(i));
            }
        }
    }
}
