package yao.danny.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class MainController{

    @RequestMapping(value = "/index")
    public String index(){
        return "1";
    }
}