package pl.kprwdm.SimpleBlog.Controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.util.HtmlUtils;
import pl.kprwdm.SimpleBlog.DAO.ConfigurationDAO;
import pl.kprwdm.SimpleBlog.DAO.PostDAO;
import pl.kprwdm.SimpleBlog.Model.Post;

import java.time.LocalDate;
import java.util.Date;

@Controller
public class AdminController {

    private final ConfigurationDAO configurationDAO;
    private final PostDAO postDAO;
    private final Post post;

    @Autowired
    public AdminController(ConfigurationDAO configurationDAO, PostDAO postDAO, Post post) {
        this.configurationDAO = configurationDAO;
        this.postDAO = postDAO;
        this.post = post;
    }

    @GetMapping("/admin")
    public String main(Model model) {

        String blogName = configurationDAO.getBlogName();
        model.addAttribute("blogName", blogName);
        model.addAttribute("post", post);

        return "admin";
    }

    @PostMapping("/new-post")
    public String CreateNewPost(@ModelAttribute("post") Post postForm) {
        post.setTitle(postForm.getTitle());
        post.setContent(escapeHtml(postForm.getContent()));
        post.setDate(new Date());
        post.setCategory(1);
        post.setAuthor("Tomek Piasek");

        postDAO.save(post);

        return "redirect:/";
    }

    private String escapeHtml(String inputStringHtml) {
        return HtmlUtils.htmlEscape(inputStringHtml);
    }


}
