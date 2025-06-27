package com.example.board.service;

import com.example.board.dto.PostResponse;
import org.springframework.stereotype.Service;
import java.util.List;
import java.util.ArrayList;

@Service
public class PostService {

    public List<PostResponse> findAllPost() {
        // 임시 데이터 리턴 (DB 연동 전 테스트용)
        List<PostResponse> list = new ArrayList<>();
        list.add(new PostResponse(1L, "제목1", "내용1"));
        list.add(new PostResponse(2L, "제목2", "내용2"));
        return list;
    }

    public PostResponse findPostById(Long id) {
        // 임시 데이터 예시 (실제로는 DB에서 조회해야 함)
        List<PostResponse> posts = findAllPost(); // 이미 있는 전체 리스트 재사용
        return posts.stream()
                .filter(post -> post.getId().equals(id))
                .findFirst()
                .orElse(null);
    }
}
