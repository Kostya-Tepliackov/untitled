import java.util.Scanner;

public class DZ2210 {
//    public static void main (String[] args){
//        int sum = sumOfTwo(51);
//       System.out.println("Сума двох чисел " + sum);
//    }
//    public static int sumOfTwo (int a){
//        int result = 0;
//        if(a > 9 && a < 100) {
//            int m = a / 10;
//            int m2 = a % 10;
//            result = m + m2;
//        }
//        else{
//            System.out.println("Введене не двозначне число");
//        }
//       return result;
//    }
    public static void main (String[] args){
    int rizn = riznOfTwo(45);
    System.out.println("Різниця двох чисел " + rizn);
}
    public static int riznOfTwo (int a){
        int result = 0;
        if(a > 9 && a < 100) {
            int m = a / 10;
            int m2 = a % 10;
            result = m - m2;
        }
        else{
            System.out.println("Введене не двозначне число");
        }
        return result;
    }
}
