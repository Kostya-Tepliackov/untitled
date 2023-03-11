package Lesson21;

import java.io.ByteArrayInputStream;
import java.io.ByteArrayOutputStream;
import java.io.FileOutputStream;

public class n3 {
    public static void main(String[] args) {
        ByteArrayOutputStream baos = new ByteArrayOutputStream();
        String text = "Hey everyone";
        byte[] buffer = text.getBytes();

        try{
            baos.write(buffer);
        }catch(Exception e){
            e.printStackTrace();
        }

        try(FileOutputStream fos = new FileOutputStream("hey.txt")){
            baos.writeTo(fos);
        }catch (Exception e){
            e.printStackTrace();
        }
    }
}
