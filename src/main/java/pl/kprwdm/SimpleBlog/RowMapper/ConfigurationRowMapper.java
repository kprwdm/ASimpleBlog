package pl.kprwdm.SimpleBlog.RowMapper;

import org.springframework.jdbc.core.RowMapper;
import pl.kprwdm.SimpleBlog.Model.Configuration;

import java.sql.ResultSet;
import java.sql.SQLException;

public class ConfigurationRowMapper implements RowMapper<Configuration> {
    @Override
    public Configuration mapRow(ResultSet resultSet, int rowNum) throws SQLException {

        Configuration configuration = new Configuration();

        configuration.setBlogName(resultSet.getString("blog_name"));

        return configuration;
    }

}
