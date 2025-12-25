public class TextEditorMain {

    public static void main(String[] args) {
        TextEditor textEditor=new TextEditor("My name is Rajeet ");
        textEditor.setContent("My name is Rj");

        //Now i Want to Undo this
        System.out.println(textEditor.getContent());
    }
}

