package com.example.firstproject.dto;

import com.example.firstproject.entity.Comment;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.ToString;

@AllArgsConstructor //모든 필드를 매개변수로 갖는 생성자 자동 생성
@NoArgsConstructor //매개변수가 아예 없는 기본 생성자 자동 생성
@Getter
@ToString //모든 필드를 출력할 수 있는 toString 자동 생성
public class CommentDto {

     private Long id;
     private Long articleId;
     private String nickname;
     private String body;

    public static CommentDto createCommentDto(Comment comment) {
        //생성자 호출
        return new CommentDto(
                comment.getId(), // 댓글 엔티티의 id
                comment.getArticle().getId(), //댓글 엔티티가 속한 부모 게시글의 id
                comment.getNickname(),
                comment.getBody());

    }
}
