package Lesson9;

public class Solution {
    String name;

    public static void main(String[] args){
        for (int i = 0; i < 10; i++) {
            Cat cat = new Cat();
        }

    }
    public static class Cat{
        public static int catCount = 0;
       public Cat(){
           catCount++;
           System.out.println("80998");

       }
    }
}
