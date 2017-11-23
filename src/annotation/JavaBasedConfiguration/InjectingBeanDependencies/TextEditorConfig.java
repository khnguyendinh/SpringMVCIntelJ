package annotation.JavaBasedConfiguration.InjectingBeanDependencies;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import javax.annotation.Resource;

/**
 * Created by KHOAND on 11/22/2017.
 */
@Configuration
public class TextEditorConfig {
    @Bean
    public TextEditor textEditor(){
        return new TextEditor( spellChecker() );
    }

    @Bean
    public SpellChecker spellChecker(){
        return new SpellChecker( );
    }
}
