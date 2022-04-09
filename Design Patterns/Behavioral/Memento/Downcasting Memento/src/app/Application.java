package app;

import textArea.TextArea;

public class Application {
    public static void main(String[] args) {
        TextArea textArea = new TextArea();
        TextManager manager = new TextManager(textArea);

        //Mistake has been made
        manager.addText("Helo");
        System.out.println(textArea.getText());

        manager.addText(" World !");
        System.out.println(textArea.getText());

        // Ctrl + Z
        manager.undo();
        System.out.println(textArea.getText());

        // Ctrl + Z
        manager.undo();
        System.out.println(textArea.getText());

        manager.addText("Hello");
        System.out.println(textArea.getText());

        manager.addText(" World !!");
        System.out.println(textArea.getText());
    }
}
