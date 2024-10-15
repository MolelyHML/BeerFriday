package com.prockopev.beerfriday.domain.repository;

import com.prockopev.beerfriday.domain.model.EventInfoEntity;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface EventInfoRepository extends JpaRepository<EventInfoEntity, Long> {
}
