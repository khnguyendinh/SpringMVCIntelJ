package annotation.Autowired.WithOption;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Required;

/**
 * Created by KHOAND on 11/21/2017.
 */
public class Student {
    private Integer age;
    private String name;

    public Integer getAge() {
        return age;
    }
    @Autowired(required = false)
    public void setAge(Integer age) {
        this.age = age;
    }

    public String getName() {
        return name;
    }
    @Autowired
    public void setName(String name) {
        this.name = name;
    }
}
