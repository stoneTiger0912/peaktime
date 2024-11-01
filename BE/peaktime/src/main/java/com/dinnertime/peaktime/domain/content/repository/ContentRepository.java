package com.dinnertime.peaktime.domain.content.repository;

import com.dinnertime.peaktime.domain.content.entity.Content;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface ContentRepository extends JpaRepository<Content, Long> {
}
