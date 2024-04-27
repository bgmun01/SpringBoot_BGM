package com.example.demo.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class HomeController {
    // 기본페이지 요청 메서드
    // 기본 주소 요청이 오면 요 메서드를 호출해준다.
    @GetMapping("/") //서버에서 자료를 받아올 때
    public String index(){
        return "index";//return 스프링이 작업을 해서 => templates 폴더의 index.html을 찾아감.
    }
}
