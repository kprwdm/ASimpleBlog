package pl.kprwdm.SimpleBlog.Controller;


import com.fasterxml.jackson.databind.cfg.ConfigFeature;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import pl.kprwdm.SimpleBlog.DAO.ConfigurationDAO;
import pl.kprwdm.SimpleBlog.DAO.PostDAO;
import pl.kprwdm.SimpleBlog.Model.Configuration;
import pl.kprwdm.SimpleBlog.Model.Post;

import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.List;

@Controller
@RequestMapping("/")
public class HomeController {

    @Autowired
    private PostDAO postDAO;
    
    @Autowired
    private ConfigurationDAO configurationDAO;

    @GetMapping
    public String main(Model model) {

        String blogName = configurationDAO.getBlogName();
        model.addAttribute("blogName",blogName);

        List<Post> posts = postDAO.findAll();
        model.addAttribute("posts", posts);


        return "index";
    }

}
