package samp.samp;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
// import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class control1 {
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
    @GetMapping("/sucesform")
    public String sucessform(@ModelAttribute("frm")Forms frm)
    {
        return "sucessform";
    }
}
