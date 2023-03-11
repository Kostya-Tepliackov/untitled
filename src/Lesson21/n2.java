package Lesson21;

import java.io.ByteArrayInputStream;

public class n2 {
    public static void main(String[] args) {
        String text = "I'm listening to 'White Night'";
        byte[] arrayL = text.getBytes();
        ByteArrayInputStream byteArrayL = new ByteArrayInputStream(arrayL, 3 , 8);
        int l;
        while ((l = byteArrayL.read()) != -1){
            System.out.println((char) l);
        }
    }
}

