package com.example.firstproject.dto;

import com.example.firstproject.entity.Article;
import lombok.AllArgsConstructor;
import lombok.ToString;

//DTO (폼 데이터를 받아올 그릇)
@AllArgsConstructor // lombok-> 모든 필드를 매개변수로 하는 생성자 자동생성 어노테이션
@ToString // lombok -> toString() 메서드와 같은 효과
public class ArticleForm {

    private Long id;
    private String title; // 제목 필드
    private String content; //내용 필드

    //DTO인 form객체를 엔티티 객체로 변환
    public Article toEntity() {
        return new Article(id, title, content);
    }
}
