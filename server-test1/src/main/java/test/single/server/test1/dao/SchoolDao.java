package test.single.server.test1.dao;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.BeanPropertyRowMapper;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Repository;
import test.single.server.test1.model.SchoolSchoolInfo;

import java.util.List;

@Repository
public class SchoolDao {

    private JdbcTemplate jdbcTemplate;

    @Autowired
    public void setJdbcTemplate(JdbcTemplate jdbcTemplate) {
        this.jdbcTemplate = jdbcTemplate;
    }

    public SchoolSchoolInfo getSchoolInfo(int serial) {
        String sql = "select * from school_info where serial=?";
        List<SchoolSchoolInfo> infoList = jdbcTemplate.query(sql, new BeanPropertyRowMapper<>(SchoolSchoolInfo.class), serial);
        return infoList.size() <= 0 ? new SchoolSchoolInfo() : infoList.get(0);
    }
}
