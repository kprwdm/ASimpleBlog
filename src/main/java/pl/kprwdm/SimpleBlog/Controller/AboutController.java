package pl.kprwdm.SimpleBlog.Controller;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Configuration;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import pl.kprwdm.SimpleBlog.DAO.ConfigurationDAO;


@Controller
@Configuration
public class AboutController {


    private final ConfigurationDAO configurationDAO;

    @Autowired
    public AboutController(ConfigurationDAO configurationDAO) {
        this.configurationDAO = configurationDAO;
    }

    @RequestMapping("/about")
    public String main(Model model) {

        String blogName = configurationDAO.getBlogName();
        model.addAttribute("blogName", blogName);

        return "about";
    }

}
