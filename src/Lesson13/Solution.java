package Lesson13;

public class Solution
{
    public static void main(String[] args)
    {

        Duck duck1 = new Duck();

        Duck duck2 = new Duck();

        Cat cat1 = new Cat();

        Cat cat2 = new Cat();

        Dog dog1 = new Dog();

        Dog dog2 = new Dog();

       System.out.println(duck1);
        System.out.println(duck2);

        System.out.println(cat1);

        System.out.println(cat2);

        System.out.println(dog1);

        System.out.println(dog2);



    }



    public static class Duck

    {

        public String toString() {

            return "Duck";

        }

    }


   public static class Cat

    {

        public String toString() {

            return "Cat";

        }

   }
    public static class Dog

    {

        public String toString() {

            return "Dog";

        }

    }

   public static class Man {
   String name = "Steve";
   int age = 21;
  String address = "st. Green 10";
}
    public static class Woman {
        String name = "Alex";
        int age = 19;
        String address = "st. Yellow 7";
    }
}
