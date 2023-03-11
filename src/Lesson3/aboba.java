package Lesson3;

import java.util.Scanner;

public class aboba {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Введіть х:");
        int x = scanner.nextInt();
        System.out.println("Введіть у:");
        int y = scanner.nextInt();
        if (x<0 && y<0) {
            System.out.println(1);
        }
        else if (x<0 && y>0) {
        System.out.println(2);
        }
        else if (x>0 && y>0) {
        System.out.println(3);
              }
        else if (x>0 && y<0) {
        System.out.println(4);
            }

        }
    }


