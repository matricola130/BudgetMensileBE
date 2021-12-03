package com.project.budgetmensile;


import com.project.budgetmensile.model.dto.Transazione;
import com.project.budgetmensile.repository.TransazioneRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;

import java.sql.Array;
import java.util.Arrays;

@Component
public class LoadDatabasa implements CommandLineRunner {

    @Autowired
    TransazioneRepository transazioneRepository;

    @Override
    public void run(String ...args) throws Exception {

        transazioneRepository.saveAll(
        Arrays.asList(
                new Transazione.TransazioneBuilder("USCITA",100L,"Transazione1")
                        .descrizione("Descrizione1").ricorrenza("NO").tag("tag1").build(),
                new Transazione.TransazioneBuilder("ENTRATA",1000L,"Transazione2")
                        .descrizione("Descrizione2").ricorrenza("NO").tag("tag2").build()
                )
        );
    }

}
