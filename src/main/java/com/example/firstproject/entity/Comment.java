package com.example.firstproject.entity;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.ToString;

@Entity
@Getter
@ToString
@AllArgsConstructor
@NoArgsConstructor
public class Comment {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id; //대표 키

    @ManyToOne //article : comment -> 1 : n
    @JoinColumn(name = "article_id") // 외래키 생성 -> Article 엔티티의 기본키(id)와 매핑
    private Article article; // 댓글의 게시글(부모)

    @Column
    private String nickname; // 댓글 단 사람
    @Column
    private String body; //댓글 본문




}
