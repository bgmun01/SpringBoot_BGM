package com.example.demo.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class MemberController {
    // 회원가입 페이지 출력 요청
    @GetMapping("/member/save") //링크를 클릭 하는 것은 Get 이다 거의
    public String saveForm() {
        return "save"; //save.html을 보여주겠다. 템플릿에서 html을 찾는다.
    }

}
