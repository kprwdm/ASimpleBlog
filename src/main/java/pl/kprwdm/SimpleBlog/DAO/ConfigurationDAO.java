package pl.kprwdm.SimpleBlog.DAO;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.dao.DataAccessException;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.jdbc.core.ResultSetExtractor;
import org.springframework.stereotype.Repository;
import pl.kprwdm.SimpleBlog.Model.Configuration;
import pl.kprwdm.SimpleBlog.RowMapper.ConfigurationRowMapper;

import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.List;
import java.util.Optional;

@Repository("configurationDao")
public class ConfigurationDAO {

    @Autowired
    private JdbcTemplate jdbcTemplate;


    public void save(Configuration configuration) {
        //TODO ConfigurationDAO save
    }


    public void update(Configuration configuration, String[] params) {
      //TODO ConfigurationDAO update
    }

    public List<Configuration> findAll() {
        return jdbcTemplate.query("SELECT * FROM configuration",
                new ConfigurationRowMapper()
        );
    }

    public String getBlogName() {
        return jdbcTemplate.queryForObject("SELECT blog_name FROM configuration", String.class);
    }




}
