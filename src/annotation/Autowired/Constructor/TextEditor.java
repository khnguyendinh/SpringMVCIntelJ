package annotation.Autowired.Constructor;

import org.springframework.beans.factory.annotation.Autowired;

public class TextEditor {
    private SpellChecker spellChecker;

    @Autowired
    public TextEditor(SpellChecker spellChecker) {
        System.out.println("inside TextEditor constructor ");
        this.spellChecker = spellChecker;
    }


    public void spellCheck() {
        spellChecker.checkSpelling();
    }


}
