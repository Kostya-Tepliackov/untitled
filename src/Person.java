public class Person {
 String fullName="Steve";
 int age=15;
    public static void talk (String fullName){
        System.out.println(fullName + "каже Привіт!");
    }
    public static void move (String fullName){
        System.out.println(fullName + "танцює");
    }
  public Person(){
  }

  public Person(int age, String fullName){
        System.out.println(age + fullName);
  }
}
