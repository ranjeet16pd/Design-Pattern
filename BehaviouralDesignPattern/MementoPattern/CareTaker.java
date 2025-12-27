import org.w3c.dom.Text;

import java.util.Stack;

// CareTaker : Helps to manage mementos (snapshots of the TextEditor state)
public class CareTaker {

    private final Stack<EditorMemento> history = new Stack<>();

    public void saveState(TextEditor textEditor) {
        history.push(textEditor.save());
    }

    public void undo(TextEditor textEditor) {
        if (!history.empty()) {
            history.pop();
            textEditor.restore(history.peek());
        }
    }


}
