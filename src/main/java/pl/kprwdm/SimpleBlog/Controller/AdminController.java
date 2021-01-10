package pl.kprwdm.SimpleBlog.Controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;
import org.springframework.web.util.HtmlUtils;
import pl.kprwdm.SimpleBlog.DAO.ConfigurationDAO;
import pl.kprwdm.SimpleBlog.DAO.PostDAO;
import pl.kprwdm.SimpleBlog.Model.Post;

@Controller
public class AdminController {

    @Autowired
    private ConfigurationDAO configurationDAO;

    // Post DI
    @Autowired
    private Post post;
    @Autowired
    private PostDAO postDAO;

    @GetMapping("/admin")
    public String main(Model model) {

        String blogName = configurationDAO.getBlogName();
        model.addAttribute("blogName",blogName);
        model.addAttribute("post", post);

        return "admin";
    }

    @PostMapping("/new-post")
    public void CreateNewPost(@ModelAttribute Post post) {
        //post.setContent();


    }

    private String encodeHTMLChars(String htmlCode) {
        return HtmlUtils.htmlEscape(htmlCode);
    }

}
