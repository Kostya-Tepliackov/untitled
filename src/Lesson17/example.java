package Lesson17;

import java.util.ArrayDeque;

public class example {
    public static void main(String args[]){
        ArrayDeque<cat> cats =  new ArrayDeque<>();
        cats.addFirst(new cat("Vaska", 2));
        cats.add(new cat("Knopka", 3));
        cats.addLast(new cat("Rijiy", 4));
        for (cat cat : cats ){
            System.out.println("Name" + cat.getName() + ", age" + cat.getAge());
        }
    }
}
