package com.ns.sarala;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
public class saralaController {
    @RequestMapping("index")
    public String index(){
        return "index";
    }
}
