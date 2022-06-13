package com.example.sneakersworld.repository;

import com.example.sneakersworld.model.History;
import com.example.sneakersworld.model.News;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface HistoryRepository extends JpaRepository<History,Long> {
    Iterable<History> findFirst10ByOrderByIdDesc();
    Page<History> findAll(Pageable pageable);


}
