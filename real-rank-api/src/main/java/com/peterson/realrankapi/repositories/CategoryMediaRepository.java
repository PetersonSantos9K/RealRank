package com.peterson.realrankapi.repositories;

import com.peterson.realrankapi.entities.CategoryMedia;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface CategoryMediaRepository extends JpaRepository<CategoryMedia, Long> {
}
