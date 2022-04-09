import java.util.ArrayList;
import java.util.List;

public class TextManager {
    private final TextArea textArea;
    private final List<TextArea.Snapshot> snapshots = new ArrayList<>();

    public TextManager(TextArea textArea) {
        this.textArea = textArea;
    }

    public void addText(String s) {
        snapshots.add(textArea.save());
        textArea.addText(s);
    }

    public void undo() {
        if (snapshots.isEmpty()) return;

        textArea.restore(snapshots.remove(snapshots.size() - 1));
    }
}
