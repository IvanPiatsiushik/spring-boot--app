package com.example.sneakersworld.repository;

import com.example.sneakersworld.model.News;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface NewsRepository extends JpaRepository<News,Long> {

//    Iterable<News> findNewsByIdOrderById ();
}
