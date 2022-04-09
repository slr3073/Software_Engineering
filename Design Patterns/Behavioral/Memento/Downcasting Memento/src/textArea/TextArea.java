package textArea;

import app.Snapshot;

public class TextArea {
    private String text = "";
    private String font = "Arial";
    private int fontSize = 11;
    private float lineSpacing = 0.5f;

    public Snapshot save() {
        return new TextAreaSnapshot(text, font, fontSize, lineSpacing);
    }

    public void restore(Snapshot save) {
        TextAreaSnapshot concreteSave = (TextAreaSnapshot) save;
        text = concreteSave.getText();
        font = concreteSave.getFont();
        fontSize = concreteSave.getFontSize();
        lineSpacing = concreteSave.getLineSpacing();
    }

    public void addText(String s) {
        text += s;
    }

    public String getText() {
        return text;
    }
}
