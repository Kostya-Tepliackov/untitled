package Lesson11;

public class WhatsApp implements Messenger{
    @Override
    public void SendMessage() {
        System.out.println("Надсилаємо повідомлення у Ватсап");
    }

    @Override
    public void getMessage() {
        System.out.println("Отримуємо повідомлення у Ватсап");
    }
}
