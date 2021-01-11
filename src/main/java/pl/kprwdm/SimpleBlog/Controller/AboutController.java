package pl.kprwdm.SimpleBlog.Controller;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Configuration;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import pl.kprwdm.SimpleBlog.DAO.ConfigurationDAO;
import pl.kprwdm.SimpleBlog.DAO.PostDAO;
import pl.kprwdm.SimpleBlog.Model.Post;

import java.util.List;

@Controller
@Configuration
public class AboutController {


    @Autowired
    private ConfigurationDAO configurationDAO;

    @RequestMapping("/about")
    public String main(Model model) {

        String blogName = configurationDAO.getBlogName();
        model.addAttribute("blogName",blogName);

        return "about";
    }

}
