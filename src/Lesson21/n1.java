package Lesson21;

import java.io.ByteArrayInputStream;

public class n1 {
    public static void main(String[] args) {
        byte[] arrayL = new byte[] {1, 2, 3, 4, 5};
        ByteArrayInputStream byteArrayL = new ByteArrayInputStream(arrayL);
        int l;
        while((l = byteArrayL.read()) != -1){
            if (l%2 == 0){
                System.out.println(l +" ");
            }


        }
        System.out.println();
    }
}
