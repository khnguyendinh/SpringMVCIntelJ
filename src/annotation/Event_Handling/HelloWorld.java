package annotation.Event_Handling;

/**
 * Created by KHOAND on 11/23/2017.
 */
public class HelloWorld {
    private String message;

    public void setMessage(String message){
        this.message  = message;
    }
    public void getMessage(){
        System.out.println("Your Message : " + message);
    }
}
