package annotation.JDBCFramework.TransactionManagement.Programmatic;

import annotation.JDBCFramework.Student;

import javax.sql.DataSource;
import java.util.List;

/**
 * Created by KHOAND on 11/27/2017.
 */
public interface StudentDAO {
    /**
     * This is the method to be used to initialize
     * database resources ie. connection.
     */
    public void setDataSource(DataSource ds);

    /**
     * This is the method to be used to create
     * a record in the Student and Marks tables.
     */
    public void create(String name, Integer age, Integer marks, Integer year);

    /**
     * This is the method to be used to list down
     * all the records from the Student and Marks tables.
     */
    public List<StudentMarks> listStudents();
}
