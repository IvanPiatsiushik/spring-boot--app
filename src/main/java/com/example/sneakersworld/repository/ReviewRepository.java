package com.example.sneakersworld.repository;

import com.example.sneakersworld.model.News;
import com.example.sneakersworld.model.Review;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface ReviewRepository extends JpaRepository<Review,Long> {
    Page<Review> findAll(Pageable pageable);

}
