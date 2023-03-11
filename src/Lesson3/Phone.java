package Lesson3;

public class Phone {

    String model;
    int number;
    double weight;


    public static void receiveCall(String name) {
        System.out.println("Phoning " + name);
    }

    public static void receiveCall(String name, int number) {
        System.out.println("Phoning " + name + number);
    }

    public double getWeight() {
        return weight;
    }

    public String getModel() {
        return model;
    }

    public int getNumber() {
        return number;
    }

    public Phone(String model, int number) {
        this.model = model;
        this.number = number;

    }

    public Phone() {
    }

    Phone(int number, String model, double weight) {
        this.number = number;
        this.model = model;
        this.weight = weight;
        new Phone(model, number);
    }

    public static void sendMassage(String... numbers) {
        for (String number : numbers) {
            System.out.println(number);
        }
    }

    public static void main(String[] args) {
        Phone phone0 = new Phone();
        Phone phone1 = new Phone("SamsungA14", 367291866);
        Phone phone2 = new Phone(718549265, "OppoA21", 2.6);
        receiveCall("Jane");
        receiveCall("Hanna ", 618738164);
        sendMassage("618781691", "5197391608", "8157915918");
        System.out.println(phone0.number + " " + phone0.model + " " + phone0.weight + " ");
        System.out.println(phone1.number + " " + phone1.model + " " + phone1.weight + " ");
        System.out.println(phone2.number + " " + phone2.model + " " + phone2.weight + " ");


    }
}