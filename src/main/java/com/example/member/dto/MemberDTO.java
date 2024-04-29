package com.example.member.dto;

import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import lombok.ToString;

@Getter
@Setter
@NoArgsConstructor
@ToString
//회원 정보의 내용을 필드로 변수 정의
public class MemberDTO {

    private Long id;
    private String memberEmail;
    private String memberPassword;
    private String memberName;
}
