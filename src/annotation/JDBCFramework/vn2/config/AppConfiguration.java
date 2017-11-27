package annotation.JDBCFramework.vn2.config;

import org.apache.commons.dbcp2.BasicDataSource;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.*;
import org.springframework.core.env.Environment;
import org.springframework.transaction.annotation.EnableTransactionManagement;

import javax.sql.DataSource;

/**
 * Created by KHOAND on 11/27/2017.
 */
@Configuration
@ComponentScan({ "annotation.JDBCFramework.vn2.*" })
@EnableTransactionManagement

// Load to Environment.
@PropertySources({ @PropertySource("classpath:ds/datasource-cfg.properties") })
//@PropertySources({ @PropertySource("ds/datasource-cfg.properties") })

public class AppConfiguration {

    // Lưu trữ các giá thuộc tính load bởi @PropertySource.
    @Autowired
    private Environment env;


    // Spring BEAN
    @Bean(name = "dataSource")
    public DataSource getDataSource() {
        BasicDataSource dataSource = new BasicDataSource();

        // See: datasouce-cfg.properties
        dataSource.setDriverClassName(env.getProperty("ds.database-driver"));
        dataSource.setUrl(env.getProperty("ds.url"));
        dataSource.setUsername(env.getProperty("ds.username"));
        dataSource.setPassword(env.getProperty("ds.password"));

        System.out.println("## getDataSource: " + dataSource);

        return dataSource;
    }

}