package com.example.sneakersworld.repository;

import com.example.sneakersworld.model.News;
import org.springframework.data.domain.Sort;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.repository.CrudRepository;

import java.util.List;

public interface NewsRepository extends JpaRepository<News,Long> {

//    Iterable<News> findNewsByIdOrderById ();
}
