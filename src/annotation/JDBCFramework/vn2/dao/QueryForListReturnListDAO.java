package annotation.JDBCFramework.vn2.dao;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.support.JdbcDaoSupport;
import org.springframework.stereotype.Repository;

import javax.sql.DataSource;
import java.util.List;

/**
 * Created by KHOAND on 11/27/2017.
 */
@Repository
public class QueryForListReturnListDAO extends JdbcDaoSupport {

    @Autowired
    public QueryForListReturnListDAO(DataSource dataSource) {
        this.setDataSource(dataSource);
    }


    public List<String> getDeptNames() {

        String sql = "Select d.dept_name from Department d ";

        // queryForList(String sql, Class<T> elementType)
        List<String> list = this.getJdbcTemplate().queryForList(sql, String.class);

        return list;
    }

    public List<String> getDeptNames(String searchName) {

        String sql = "Select d.dept_name from Department d "//
                + " Where d.dept_name like ? ";

        // queryForList(String sql, Class<T> elementType, Object... args)
        List<String> list = this.getJdbcTemplate().queryForList(sql, String.class, //
                "%" + searchName + "%");

        return list;
    }


}
