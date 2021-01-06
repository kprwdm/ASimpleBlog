package pl.kprwdm.SimpleBlog.DAO;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Repository;
import pl.kprwdm.SimpleBlog.RowMapper.PostRowMapper;
import pl.kprwdm.SimpleBlog.Model.Post;

import java.util.List;
import java.util.Optional;


@Repository("postDao")
public class PostDAO {

    @Autowired
    private JdbcTemplate jdbcTemplate;

    public void save(Post post) {
        jdbcTemplate.update("INSERT INTO post  (author, date, title, content, category) VALUES(?,?,?,?,?)",
                post.getAuthor(), post.getDate(), post.getTitle(), post.getContent(), post.getCategory());
    }


    public void update(Post post, String[] params) {
    //TODO PostDAO Update
    }

    public void deleteById(int id) {
        jdbcTemplate.update("DELETE post WHERE id = ?", id);
    }


    public List<Post> findAll() {
        return jdbcTemplate.query("SELECT * FROM post ORDER BY id desc",
               new PostRowMapper()
        );
    }


    public Optional<Post> findById(int id) {
     //TODO PostDAO findById
        return null;
    }
}
