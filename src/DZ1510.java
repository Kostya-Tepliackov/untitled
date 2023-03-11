import java.util.Scanner;

public class DZ1510 {
    int minnumber;

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
//        System.out.println("Введіть два числа, а система видасть найменше");
//        int num = scanner.nextInt();
//        int num1 = scanner.nextInt();
//        if (num > num1) {
//            System.out.println(num1);
//        } else {
//            System.out.println(num);
//        }
        int a = scanner.nextInt();
        int b = scanner.nextInt();
        System.out.println(Math.min(a,b));

    }
}

