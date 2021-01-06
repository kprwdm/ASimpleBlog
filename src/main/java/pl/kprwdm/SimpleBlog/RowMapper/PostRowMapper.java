package pl.kprwdm.SimpleBlog.RowMapper;

import org.springframework.jdbc.core.RowMapper;
import org.springframework.web.util.HtmlUtils;
import pl.kprwdm.SimpleBlog.Model.Post;

import java.sql.ResultSet;
import java.sql.SQLException;

public class PostRowMapper implements RowMapper<Post> {

    @Override
    public Post mapRow(ResultSet resultSet, int rowNum) throws SQLException {
       Post post = new Post();

       post.setId(resultSet.getInt("id"));
       post.setAuthor(resultSet.getString("author"));
       post.setDate(resultSet.getTimestamp("date"));
       post.setTitle(resultSet.getString("title"));
       post.setContent(HtmlUtils.htmlUnescape(resultSet.getString("content")));


       return post;
    }
}
