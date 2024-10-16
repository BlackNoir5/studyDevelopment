package com.example.SpringBasic_Study.controller;

import com.example.SpringBasic_Study.model.SearchParam;
import org.springframework.web.bind.annotation.*;

//HTML <Form>
//ajax
//http post body -> data
//위 3가지 형식으로 받을 수 있음

//json, xml, multipart-form / text-plain 이라는 데이터
@RestController
@RequestMapping("/api")
public class PostController {
    //@RequestMapping(method = RequestMethod.POST,path = "/postMethod")
    @PostMapping(value = "/postMethod")
    public SearchParam postMethod(@RequestBody SearchParam searchParam){
        return searchParam;
    }

    @PutMapping()
    public void put(){

    }

    @PatchMapping()
    public void patch(){

    }
}
