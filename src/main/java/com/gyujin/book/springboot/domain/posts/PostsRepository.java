package com.gyujin.book.springboot.domain.posts;

import org.springframework.data.jpa.repository.JpaRepository;

public interface PostsRepository extends JpaRepository<Posts, Long> { // Dao와 마찬가지의 역할 (JpaRepository<Entity 클래스, PK타입> 상속받음)

}
