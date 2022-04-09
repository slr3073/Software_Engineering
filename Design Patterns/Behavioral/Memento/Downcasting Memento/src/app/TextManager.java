package app;

import textArea.TextArea;

import java.util.ArrayDeque;
import java.util.Deque;

public class TextManager {
    private final TextArea textArea;
    private final Deque<Snapshot> history = new ArrayDeque<>();

    public TextManager(TextArea textArea) {
        this.textArea = textArea;
    }

    public void addText(String s) {
        history.push(textArea.save());
        textArea.addText(s);
    }

    public void undo() {
        if (history.isEmpty()) return;

        textArea.restore(history.pop());
    }
}
