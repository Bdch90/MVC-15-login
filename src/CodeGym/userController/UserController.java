package CodeGym.userController;

import CodeGym.model.Login;
import CodeGym.model.User;
import CodeGym.userDao.DatabaseUser;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.portlet.ModelAndView;

@Controller
public class UserController
{

    @GetMapping("/home*")
    public String home(Model model)
    {
        model.addAttribute("login", new Login());
        return "home";
    }

    @PostMapping("/login")
    public String login(@ModelAttribute("login") Login login , Model model)
    {
        User user = DatabaseUser.checkLogin(login);
        if (user == null)
        {
            return "error";
        }
        else
        {
            model.addAttribute("user", user);
            return "user";
        }
    }
}
