package com.example.firsttest.Service;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class HtmlLoader {

    @RequestMapping("/te")
    public String home3(){
        return "index.html";
    }

    @RequestMapping("/")
    public String home(){
        return "index2.html";
    }

}
