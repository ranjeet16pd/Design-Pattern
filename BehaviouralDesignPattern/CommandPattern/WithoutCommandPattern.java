
class TextEditorV2 {

    public void boldText() {
        System.out.println("Text has been Bold");
    }

    public void italicText() {
        System.out.println("Text has been Italic");
    }

    public void underlineText() {
        System.out.println("Text has been Underline");
    }
}


// Making Button Class
class BoldButton {

    private final TextEditorV2 textEditorV2;

    public BoldButton(TextEditorV2 textEditorV2) {
        this.textEditorV2 = textEditorV2;
    }

    public void click() {
        textEditorV2.boldText();
    }
}

class ItalicButton {
    private final TextEditorV2 textEditorV2;

    public ItalicButton(TextEditorV2 textEditorV2) {
        this.textEditorV2 = textEditorV2;
    }

    public void click() {
        textEditorV2.italicText();
    }
}

class UnderlineButton {
    private final TextEditorV2 textEditorV2;

    public UnderlineButton(TextEditorV2 textEditorV2) {
        this.textEditorV2 = textEditorV2;
    }

    public void click() {
        textEditorV2.underlineText();
    }
}


public class WithoutCommandPattern {

    public static void main(String[] args) {
        TextEditorV2 textEditorV2 = new TextEditorV2();
        BoldButton button = new BoldButton(textEditorV2);
        ItalicButton italicButton = new ItalicButton(textEditorV2);
        UnderlineButton underlineButton = new UnderlineButton(textEditorV2);
        button.click();
        italicButton.click();
        underlineButton.click();

    }
}
