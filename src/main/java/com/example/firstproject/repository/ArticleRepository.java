package com.example.firstproject.repository;

import com.example.firstproject.entity.Article;
import org.springframework.data.repository.CrudRepository;

import java.util.ArrayList;

//CrudRepository<,> : JPA 제공 -> 엔티티 관리(생성,조회,수정,삭제)
//<관리 대상 엔티티의 클래스 타입 : Article, 관리 대상 엔티티의 대푯값 타입 : Long(여기선 id의 타입)>
public interface ArticleRepository extends CrudRepository<Article, Long> {
    @Override
    ArrayList<Article> findAll();
}
