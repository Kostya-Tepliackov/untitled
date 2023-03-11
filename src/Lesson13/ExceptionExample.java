package Lesson13;

public class ExceptionExample {
    public static void main(String[] args){
        method1();
    }

    private static void method1() {
       method2(); 
    }

    private static void method2() {
        method3();
    }

    private static void method3() {
        method4();
    }

    private static void method4() {
        method5();
    }

    private static void method5() {
        StackTraceElement[]  stackTraceElements = Thread.currentThread().getStackTrace();
        for(StackTraceElement element : stackTraceElements){
            System.out.println(element.getMethodName());
        }
    }
}
