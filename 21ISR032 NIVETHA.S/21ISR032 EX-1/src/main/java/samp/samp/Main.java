package samp.samp;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
@Controller
public class Main {
    @RequestMapping("/")
    public String ho()
    {
        return "formindex";
    }
    @RequestMapping("/login")
    public String registerform(@ModelAttribute("frm")Forms frm)
    {
        return "registerform";
    }
    @PostMapping("/sucess")
    public String sucess(@ModelAttribute("frm")Forms frm)
    {
        return "sucessform";
    }
}
