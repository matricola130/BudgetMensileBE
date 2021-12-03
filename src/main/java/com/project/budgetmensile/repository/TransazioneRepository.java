package com.project.budgetmensile.repository;

import com.project.budgetmensile.model.dto.Transazione;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface TransazioneRepository extends JpaRepository<Transazione, Long> {

}
