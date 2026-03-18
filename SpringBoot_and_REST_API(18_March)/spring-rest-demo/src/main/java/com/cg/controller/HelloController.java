package com.cg.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

//@RestController
public class HelloController {
    @GetMapping("abc/{name}")
    public String sayHello(@PathVariable String name){
        return "Hello "+name;
    }
}


//@Controller // this sees the return as Logic view rather tha a plain text
//public class HelloController {
//    @GetMapping("abc")
//    public @ResponseBody String sayHello(){ // this will again make the return as plain text
//        return "Hello";
//    }
//}
// so @Controller + @ResponseBody --> @RestController