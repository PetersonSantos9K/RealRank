package com.peterson.realrankapi.repositories;

import com.peterson.realrankapi.entities.Media;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository

public interface MediaRepository extends JpaRepository<Media, Long> {
}
