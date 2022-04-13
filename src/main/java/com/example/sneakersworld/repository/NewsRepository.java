package com.example.sneakersworld.repository;

import com.example.sneakersworld.model.News;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

public interface NewsRepository extends JpaRepository<News,Long> {

//    List<News> findNewsBy (String news);
}
