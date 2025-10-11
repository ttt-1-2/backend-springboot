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
    @Id // 대표키 저장
    @GeneratedValue(strategy = GenerationType.IDENTITY) // DB가 자동으로 1씩 증가
    private Long id;
    @ManyToOne
    @JoinColumn(name="article_id") // 외래키 생성, Article 엔티티의 기본키와 매핑
    private Article article; // 해당 댓글의 부모 게시글
    @Column
    private String nickname;
    @Column
    private String body;
}
