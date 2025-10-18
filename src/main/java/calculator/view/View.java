package calculator.view;

public class View {
    public void printMessage(Message message) {
        System.out.println(message.getMessage());
    }

    public void printFormattingMessage(Message message, String response) {
        System.out.printf(message.getMessage(), response);
    }
}
