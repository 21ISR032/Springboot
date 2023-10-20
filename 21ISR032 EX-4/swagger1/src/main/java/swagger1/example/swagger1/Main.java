package swagger1.example.swagger1;
import java.util.ArrayList;
import java.util.List;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/grocery")
public class Main {
    private static List<Grocery> gro=new ArrayList<Grocery>();
    @GetMapping
    public List<Grocery> disp()
    {
        return gro;
    }
    @PostMapping
    public Grocery add(@RequestBody Grocery grocery)
    {
        gro.add(grocery);
        return grocery;
    }

}