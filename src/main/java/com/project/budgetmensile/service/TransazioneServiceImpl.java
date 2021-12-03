package com.project.budgetmensile.service;

import com.project.budgetmensile.model.dto.Transazione;
import com.project.budgetmensile.repository.TransazioneRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;
import java.util.List;

@Service
@RequiredArgsConstructor
public class TransazioneServiceImpl implements TransazioneService{

    private final TransazioneRepository transazioneRepository;

    //CREATE
        @Override
        public Transazione createTransazione(Transazione transazione) {
            return transazioneRepository.saveAndFlush(transazione);
        }

        @Override
        public List<Transazione> findAllTransazioni() {
            return transazioneRepository.findAll();
        }

        @Override
        public Transazione updateTransazione(Transazione transazione) {
            return transazioneRepository.saveAndFlush(transazione);
        }

        @Override
        public void deleteTransazione(Long id) {
            transazioneRepository.deleteById(id);
        }
}
