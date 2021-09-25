package com.gftest01.controller;

import org.json.JSONException;
import org.json.JSONObject;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/api/test")
public class testController {
//    @GetMapping("/hello")
//    public String func(){
//        return "hello world";
//    }

    @PostMapping("upload")
//    @RequestMapping(value = "aa", method = RequestMethod.POST)
//    @ResponseBody
    public int getResult(@RequestBody JSONObject seq) throws JSONException {
        System.out.println(seq);
        int a = seq.getInt("name1");
        int b = seq.getInt("name2");
        System.out.println(a+" "+b);
        return a + b;
//        return seq;
    }
}
