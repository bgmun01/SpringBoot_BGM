package com.example.member.controller;

import com.example.member.dto.MemberDTO;
import com.example.member.service.MemberService;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;

@Controller
@RequiredArgsConstructor
public class MemberController {
    //생성자 주입
    private final MemberService memberService;
    // 회원가입 페이지 출력 요청
    @GetMapping("/member/save") //링크를 클릭 하는 것은 Get 이다 거의
    public String saveForm() {
        return "save"; //save.html을 보여주겠다. 템플릿에서 html을 찾는다.
    }
//    @PostMapping("/member/save")
//    public String save(@RequestParam("memberEmail") String memberEmail,
//                       @RequestParam("memberPassword") String memberPassword,
//                       @RequestParam("memberName") String memberName) {
//        return "index";
//    }
//    위 방법을 아래와 같이 사용할 수 있다.
    @PostMapping("/member/save")
    public String save(@ModelAttribute MemberDTO memberDTO) {
        System.out.println("memberDTO = " + memberDTO);
        /* 일반적으로 함수를 사용할 때
        MemberService memberService = new MemberService();
        memberService.save();
         */
        // 하지만 Spring 에서는 다른걸 쓴다.
        // @Controller 같은 어노테이션은 스프링이 관리하는 객체로 선언한다 인데
        // 이걸 사용할 때는 주입? 을 사용한다.객체를 주입받는다. 생성자 주입?
        memberService.save(memberDTO);
        return "index";
    }
}
