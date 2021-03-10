package hong.com.springboot.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
class home{
@GetMapping("/")
public String Home(){
    return "index";
}
}

@Controller
public class hello {
    @GetMapping("/hello")
    public String HelloWord(){
        return "hello";
    }
}


