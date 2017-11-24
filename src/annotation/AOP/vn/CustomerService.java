package annotation.AOP.vn;

/**
 * Created by KHOAND on 11/24/2017.
 */
public class CustomerService implements Service {
    private String name;
    private String url;

    @Override
    public void execute() {

    }

    public void setName(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public void setUrl(String url) {
        this.url = url;
    }

    public String getUrl() {
        return url;
    }
}
