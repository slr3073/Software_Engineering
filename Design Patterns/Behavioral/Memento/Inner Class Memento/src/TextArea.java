public class TextArea {
    private String text = "";
    private String font = "Arial";
    private int fontSize = 11;
    private float lineSpacing = 0.5f;

    public Snapshot save(){
        return new Snapshot(text, font, fontSize, lineSpacing);
    }

    public void restore(Snapshot save){
        text = save.text;
        font = save.font;
        fontSize = save.fontSize;
        lineSpacing = save.lineSpacing;
    }

    public void addText(String s) {
        text += s;
    }

    public String getText(){
        return text;
    }

    public static class Snapshot {
        private final String text;
        private final String font;
        private final int fontSize;
        private final float lineSpacing;

        private Snapshot(String text, String font, int fontSize, float lineSpacing) {
            this.text = text;
            this.font = font;
            this.fontSize = fontSize;
            this.lineSpacing = lineSpacing;
        }
    }
}
