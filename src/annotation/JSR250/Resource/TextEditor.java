package annotation.JSR250.Resource;

import javax.annotation.Resource;

/**
 * Created by KHOAND on 11/22/2017.
 */
public class TextEditor {
    private SpellChecker spellChecker;

    @Resource(name = "spellChecker")
    public void setSpellChecker( SpellChecker spellChecker ){
        this.spellChecker = spellChecker;
    }
    public SpellChecker getSpellChecker(){
        return spellChecker;
    }
    public void spellCheck(){
        spellChecker.checkSpelling();
    }
}
