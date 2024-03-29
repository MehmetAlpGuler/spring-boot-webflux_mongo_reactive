package com.spring.boot.webflux.repository;

import org.springframework.data.mongodb.repository.ReactiveMongoRepository;
import org.springframework.stereotype.Repository;

import com.spring.boot.webflux.model.Blog;

import reactor.core.publisher.Flux;
import reactor.core.publisher.Mono;

@Repository
public interface BlogRepository extends ReactiveMongoRepository<Blog, String> {

    Flux<Blog> findByAuthor(String author);

    Flux<Blog> findByAuthorAndDeleteIsFalse(String titleKeyword);

    Mono<Blog> findByTitle(String title);

    Mono<Blog> findByIdAndDeleteIsFalse(String id);
}
