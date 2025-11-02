package com.example.firstproject.dto;

import com.example.firstproject.entity.Article;
import com.example.firstproject.entity.Member;
import lombok.AllArgsConstructor;
import lombok.ToString;

@AllArgsConstructor
@ToString
public class MemberForm {

    private Long id;
    private String email;
    private String password;


    //DTO인 form객체를 엔티티 객체로 변환
    public Member toEntity() {
        return new Member(id, email, password);
    }
}
