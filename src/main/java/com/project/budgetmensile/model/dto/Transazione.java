package com.project.budgetmensile.model.dto;

import javax.persistence.*;

@Entity
@Table(name = "transazione")
public class Transazione {

    @Id
    @GeneratedValue(strategy = GenerationType.SEQUENCE)
    private Long id;

    private String type;
    private String ricorrenza;

    private Long importo;
    private String titolo;
    private String descrizione;
    private String tag;

    //CONSTRUCTOR
    private Transazione(TransazioneBuilder builder){
        this.type = builder.type;
        this.ricorrenza = builder.ricorrenza;
        this.importo = builder.importo;
        this.descrizione = builder.descrizione;
        this.titolo = builder.titolo;
        this.tag = builder.tag;
    }

    public Transazione() { }

    //SETTER

    public void setType(String type) {
        this.type = type;
    }

    public void setRicorrenza(String ricorrenza) {
        this.ricorrenza = ricorrenza;
    }

    public void setImporto(Long importo) {
        this.importo = importo;
    }

    public void setTitolo(String titolo) {
        this.titolo = titolo;
    }

    public void setDescrizione(String descrizione) {
        this.descrizione = descrizione;
    }

    public void setTag(String tag) {
        this.tag = tag;
    }

    //GETTER

    public Long getId() {
        return this.id;
    }

    public Long getImporto() {
        return this.importo;
    }

    public String getType() {
        return this.type;
    }

    public String getRicorrenza() {
        return this.ricorrenza;
    }

    public String getTitolo() {
        return this.titolo;
    }

    public String getDescrizione() {
        return this.descrizione;
    }

    public String getTag() {
        return this.tag;
    }

    //BUILDER
    public static class TransazioneBuilder {

        private final String type;
        private String ricorrenza;

        private final Long importo;
        private final String titolo;
        private String descrizione;
        private String tag;

        public TransazioneBuilder(String type, Long importo, String titolo){
            this.type = type;
            this.importo = importo;
            this.titolo = titolo;
        }
        public TransazioneBuilder ricorrenza(String ricorrenza){
            this.ricorrenza = ricorrenza;
            return this;
        }
        public TransazioneBuilder descrizione(String descrizione){
            this.descrizione = descrizione;
            return this;
        }
        public TransazioneBuilder tag(String tag){
            this.tag = tag;
            return this;
        }

        //Oggetto finale
        public Transazione build() {
            Transazione transazione = new Transazione(this);
            return transazione;
        }

    }

}
