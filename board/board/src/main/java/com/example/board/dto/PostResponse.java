package com.example.board.dto;


public class PostResponse {
    // 게시글의 필드 예시
    private Long id;
    private String title;
    private String content;

    // 생성자, getter, setter 등 추가
    public PostResponse(Long id, String title, String content) {
        this.id = id;
        this.title = title;
        this.content = content;
    }

    public Long getId() { return id; }
    public String getTitle() { return title; }
    public String getContent() { return content; }
}

