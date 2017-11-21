package annotation.Qualifier;

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

    public void setAge(Integer age) {
        this.age = age;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}
