package westcoastcompassdealer.demo.web.controllers;


import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.servlet.ModelAndView;
import westcoastcompassdealer.demo.web.controllers.BaseController;

@Controller
public class HomeController extends BaseController {

    @GetMapping("/")
    public ModelAndView home(){
        return super.view("home");
    }

}