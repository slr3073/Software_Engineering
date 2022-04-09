package textArea;

import app.Snapshot;

class TextAreaSnapshot implements Snapshot {
    private String text = "";
    private String font = "Arial";
    private int fontSize = 11;
    private float lineSpacing = 0.5f;

    public TextAreaSnapshot(String text, String font, int fontSize, float lineSpacing) {
        this.text = text;
        this.font = font;
        this.fontSize = fontSize;
        this.lineSpacing = lineSpacing;
    }

    public String getText() {
        return text;
    }

    public String getFont() {
        return font;
    }

    public int getFontSize() {
        return fontSize;
    }

    public float getLineSpacing() {
        return lineSpacing;
    }
}
