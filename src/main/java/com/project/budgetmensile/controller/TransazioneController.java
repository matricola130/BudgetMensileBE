package com.project.budgetmensile.controller;

import com.project.budgetmensile.model.dto.Transazione;
import com.project.budgetmensile.service.TransazioneService;
import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@CrossOrigin(origins = "http://localhost:8081")
@RestController
@RequestMapping("/transaction")
@RequiredArgsConstructor
public class TransazioneController {

    private final TransazioneService transazioneService;

    //GET
        @GetMapping("/all")
        public @ResponseBody List<Transazione> getTransactionInBody() {
            return transazioneService.findAllTransazioni();
        }

    //CREATE
        @PostMapping("/create")
        public @ResponseBody Transazione createTransazione(@RequestBody Transazione transazione){
            return transazioneService.createTransazione(transazione);
        }

    //UPDATE
        @PutMapping("/update")
        public @ResponseBody Transazione updateTransazione(@RequestBody Transazione transazione){
            return transazioneService.updateTransazione(transazione);
        }

    //DELETE
        @DeleteMapping("{id}/delete")
        public @ResponseBody void deleteTransazione(@PathVariable("id") Long id) {
            transazioneService.deleteTransazione(id);
        }
}
