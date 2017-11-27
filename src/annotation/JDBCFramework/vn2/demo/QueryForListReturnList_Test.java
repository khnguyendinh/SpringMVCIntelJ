package annotation.JDBCFramework.vn2.demo;

import annotation.JDBCFramework.vn2.config.AppConfiguration;
import annotation.JDBCFramework.vn2.dao.QueryForListReturnListDAO;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import java.sql.SQLException;
import java.util.List;

/**
 * Created by KHOAND on 11/27/2017.
 */
public class QueryForListReturnList_Test {

    public static void main(String[] args) throws SQLException {

        ApplicationContext context = new AnnotationConfigApplicationContext(AppConfiguration.class);

        QueryForListReturnListDAO dao = context.getBean(QueryForListReturnListDAO.class);

        List<String> names = dao.getDeptNames("A");

        for (String name : names) {

            System.out.println("Dept Name: " + name);
        }
    }

}
