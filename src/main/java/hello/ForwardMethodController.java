package hello;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;



@Controller
public class ForwardMethodController {

    @RequestMapping("/forward")
    public String forward() {
        return "forward:greeting";
    }

}
