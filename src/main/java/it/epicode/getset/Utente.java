package it.epicode.getset;

import javax.persistence.Entity;
import javax.persistence.Id;
import java.util.Date;

@Entity
public class Utente {

    @Id
    private int numeroTessera;
    private String nome;
    private String cognome;
    private Date dataNascita;

    // Getters e Setters
    public int getNumeroTessera() {
        return numeroTessera;
    }

    public void setNumeroTessera(int numeroTessera) {
        this.numeroTessera = numeroTessera;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getCognome() {
        return cognome;
    }

    public void setCognome(String cognome) {
        this.cognome = cognome;
    }

    public Date getDataNascita() {
        return dataNascita;
    }

    public void setDataNascita(Date dataNascita) {
        this.dataNascita = dataNascita;
    }
}
