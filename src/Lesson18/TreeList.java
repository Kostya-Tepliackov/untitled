package Lesson18;

import java.util.Iterator;
import java.util.Scanner;
import java.util.Set;
import java.util.TreeSet;

public class TreeList {
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);
        Set<Integer> states = new TreeSet<>();

        states.add(7);
        states.add(-2);
        states.add(16);
        states.add(8);
        states.add(3);


        System.out.println(" Enter 5 numbers");

        int a = 0;
        for (int i = 0; i<5; i++ ){
            a = scanner.nextInt();
            states.add(a);
        }
        Iterator<Integer> iterator = states.iterator();
        while(iterator.hasNext()){
            int element = iterator.next();
            if (element >= 1 && element < 15){
                System.out.println(element);
            }
        }

    }
}
