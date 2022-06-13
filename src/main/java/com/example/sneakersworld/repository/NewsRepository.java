package com.example.sneakersworld.repository;

import com.example.sneakersworld.model.News;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.domain.Sort;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface NewsRepository extends JpaRepository<News,Long> {

    Iterable<News> findFirst10ByOrderByIdDesc();
    Page<News> findAll(Pageable pageable);
//    Iterable<News> findByName(String name, Pageable pageable);
    Iterable<News> findFirst20ByOrderByIdAsc();
}
