package com.example.cafe.Controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class CafeController {
   @GetMapping("main")
    public String main(){
       return "main";
   }

}
