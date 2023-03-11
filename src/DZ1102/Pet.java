package DZ1102;

import java.util.HashMap;
import java.util.Map;

public class Pet {
    int age;
    int weight;
    String color;

    public Pet(int age, int weight, String color) {
        this.age = age;
        this.weight = weight;
        this.color = color;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public int getWeight() {
        return weight;
    }

    public void setWeight(int weight) {
        this.weight = weight;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }
    public static void main(String[] args){
        Map<String, Pet> map = new HashMap<String, Pet>();

        Pet pet1 = new Cat(3, 8, "black");
        Pet pet2 = new Cat(1, 3, "white");
        Pet pet3 = new Dog(4, 20, "brown");
        Pet pet4 = new Dog(7, 30,"orange");
        Pet pet5 = new Parrot(2, 1, "red");
        Pet pet6 = new Parrot(1, 2, "blue");

        map.put("Knopka", pet1);
        map.put("Rizhziy", pet2);
        map.put("Dina", pet3);
        map.put("Valet", pet4);
        map.put("Kesha", pet5);
        map.put("Petya", pet6);

        System.out.println(map);



    }
}
