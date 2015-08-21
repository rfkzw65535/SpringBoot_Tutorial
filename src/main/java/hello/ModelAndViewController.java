package hello;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;


@Controller
public class ModelAndViewController {

    @RequestMapping("/modelandview")
    public ModelAndView modelandview() {
        ModelAndView modelAndView = new ModelAndView();
        modelAndView.addObject(new User("tag:modelandview", "name:username"));
//        modelAndView.setViewName("/modelandview.html");
        modelAndView.setViewName("modelandview");
        return modelAndView;
    }

}
