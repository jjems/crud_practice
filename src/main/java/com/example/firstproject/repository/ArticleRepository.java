package com.example.firstproject.repository;

import com.example.firstproject.entity.Article;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.ArrayList;

//관리하고자 하는 Entity와 Entity의 대표 인자의 타입을 적어줘야 함
public interface ArticleRepository extends JpaRepository<Article, Long> {


    @Override
    ArrayList<Article> findAll();

}
