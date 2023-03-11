package Lesson11;

public class Telegram implements Messenger, Application {
    @Override
    public void SendMessage() {
        System.out.println("Надсилаємо повідомлення у Телеграм");
    }

    @Override
    public void getMessage() {
        System.out.println("Отримуємо повідомлення у Телеграм");
    }
}
