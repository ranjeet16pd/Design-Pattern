public class TextEditorMain {

    public static void main(String[] args) {
        TextEditor textEditor=new TextEditor();
        CareTaker careTaker=new CareTaker();

        textEditor.write("A");
        careTaker.saveState(textEditor);

        textEditor.write("B");
        careTaker.saveState(textEditor);

        textEditor.write("C");
        careTaker.saveState(textEditor);

        careTaker.undo(textEditor);

        //Now i Want to Undo this
        System.out.println(textEditor.getContent());
    }
}

