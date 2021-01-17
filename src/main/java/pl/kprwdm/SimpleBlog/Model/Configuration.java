package pl.kprwdm.SimpleBlog.Model;

import org.springframework.stereotype.Service;

@Service
public class Configuration {

    private String blogName;

    public String getBlogName() {
        return blogName;
    }

    public void setBlogName(String blogName) {
        this.blogName = blogName;
    }
}
