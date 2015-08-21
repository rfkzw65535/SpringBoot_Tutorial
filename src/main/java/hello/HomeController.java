package hello;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;



@Controller
@RestController
public class HomeController {

    @RequestMapping("/")
    @ResponseBody
    public String home() {
        return "<html>\r\n<body>\r\nindex here<br>\r\nspringboot<br>\r\n<a href=\"/greeting\">greeting</a><br>\r\n</body>\r\n</html>";
    }

}
