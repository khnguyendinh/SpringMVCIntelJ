package annotation.JDBCFramework.vn_checkConnectDb;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import javax.sql.DataSource;
import java.sql.Connection;
import java.sql.SQLException;

/**
 * Created by KHOAND on 11/27/2017.
 */
public class App {
    public static void main(String[] args) throws SQLException {
        AnnotationConfigApplicationContext applicationContext = new AnnotationConfigApplicationContext(AppConfiguration.class);
        DataSource dataSource = applicationContext.getBean("dataSource", DataSource.class);
        Connection connection = dataSource.getConnection();
        System.out.println("Kết nối Hệ quản trị Cơ sở dữ liệu thành công");
        checkConnectionStatus(connection);
        connection.close();
        checkConnectionStatus(connection);
    }

    public static void checkConnectionStatus(Connection connection) throws SQLException {
        if (connection.isClosed()) {
            System.out.println("Hiện tại Không có kết nối đến Hệ Quản trị Cơ sở dữ liệu");
        } else {
            System.out.println("Hiện tại Đang có kết nối đến Hệ quản trị CSDL");
        }
    }
}
