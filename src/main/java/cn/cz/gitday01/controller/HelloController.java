package cn.cz.gitday01.controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HelloController {
@RequestMapping("/helllo")
public String hello(){
        String s="hot-fix test";
        return "hello hello fix4";
}
}
