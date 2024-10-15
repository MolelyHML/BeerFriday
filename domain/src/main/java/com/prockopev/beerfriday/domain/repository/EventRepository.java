package com.prockopev.beerfriday.domain.repository;

import com.prockopev.beerfriday.domain.model.EventEntity;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface EventRepository extends JpaRepository<EventEntity, Long> {
}
