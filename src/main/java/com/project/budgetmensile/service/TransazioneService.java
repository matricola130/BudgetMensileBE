package com.project.budgetmensile.service;

import com.project.budgetmensile.model.dto.Transazione;

import java.util.List;

public interface TransazioneService {

    //CREATE
        Transazione createTransazione(Transazione transazione);

    //FIND
        List<Transazione> findAllTransazioni();

    //UPDATE
        Transazione updateTransazione(Transazione transazione);

    //DELETE
        void deleteTransazione(Long id);

}
