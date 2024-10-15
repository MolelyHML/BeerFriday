package com.prockopev.beerfriday.domain.repository;

import com.prockopev.beerfriday.domain.model.ParticipantEntity;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface ParticipantRepository extends JpaRepository<ParticipantEntity, Long> {
}
