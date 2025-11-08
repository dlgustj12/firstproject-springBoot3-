package com.example.firstproject.entity;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.ToString;

@Entity // JPA 어노테이션 -> 이 클래스를 기반으로 DB에 테이블이 생성도록함.
@AllArgsConstructor
@NoArgsConstructor
@ToString
@Getter
public class Article {

    /*public Long getId() { //Getter 롬복 어노테이션 사용으로 불필요
        return id;
    }*/

    //@Id -> 해당 엔티티의 Primary key로 매핑
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY) // DB가 id 자동 생성
    private Long id;

    // @Column -> 해당 필드가 DB 테이블의각 열에 매핑됨.
    @Column
    private String title;
    @Column
    private String content;

}
