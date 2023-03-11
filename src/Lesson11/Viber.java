package Lesson11;

public class Viber implements Messenger{
    @Override
    public void SendMessage() {
        System.out.println("Надсилаємо повідомлення у Вайбер");
    }

    @Override
    public void getMessage() {
        System.out.println("Отримуємо повідомлення у Вайбер");
    }
}
