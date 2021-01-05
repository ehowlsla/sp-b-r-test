package kr.co.bootpay.springbootreact.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HelloController {
//    @GetMa
    @GetMapping("/hello")
    public @ResponseBody String index() {
        return "hello";
    }
}
