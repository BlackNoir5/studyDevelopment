package com.example.SpringBasic_Study.controller;

import com.example.SpringBasic_Study.model.SearchParam;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/api")
public class GetController {
    //localhosst:8080/api/getMethod
    @RequestMapping(method = RequestMethod.GET,path = "getMethod")
    public String getRequest(){
        return "Hi getMethod";
    }

    //localhost:8080/api/getParameter?id=1234&password=0305
    //    @GetMapping("/getParameter")
    //    public String getParameter(@RequestParam String id, @RequestParam String password){
    //        return id+password;
    //    }

    @GetMapping("/getParameter")
    public String getParameter(@RequestParam String id, @RequestParam(name = "password") String pwd){
        String password = "1234";

        return id+pwd;
    }

    //localhost:8080/api/multiParameter?account=1234&email=dhquddlf5@gmail.com&page=10
    @GetMapping("/multiParameter")
    public String multiParameter(SearchParam searchParam){
        System.out.println(searchParam.getAccount());
        System.out.println(searchParam.getEmail());
        System.out.println(searchParam.getPage());

        // { account : "", email : "", page : 0 }

        return "OK";
    }
}
