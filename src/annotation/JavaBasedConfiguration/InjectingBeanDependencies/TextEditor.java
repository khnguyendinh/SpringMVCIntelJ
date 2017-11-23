package annotation.JavaBasedConfiguration.InjectingBeanDependencies;

import javax.annotation.Resource;

/**
 * Created by KHOAND on 11/22/2017.
 */
public class TextEditor {
    private SpellChecker spellChecker;

    public TextEditor(SpellChecker spellChecker){
        System.out.println("Inside TextEditor constructor." );
        this.spellChecker = spellChecker;
    }
    public void spellCheck(){
        spellChecker.checkSpelling();
    }
}
