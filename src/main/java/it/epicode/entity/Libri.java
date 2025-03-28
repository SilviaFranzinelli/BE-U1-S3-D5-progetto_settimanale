package it.epicode.entity;

import javax.persistence.Entity;
import javax.persistence.Table;

@Entity
@Table(name = "libri")
public class Libri extends ElementoCatalogo {
    private String autore;
    private String genere;

    public Libri() {}

    public Libri(String isbn, String titolo, int anno, int pagine, String autore, String genere) {
        super(isbn, titolo, anno, pagine);
        this.autore = autore;
        this.genere = genere;
    }

    public String getAutore() { return autore; }
    public void setAutore(String autore) { this.autore = autore; }

    public String getGenere() { return genere; }
    public void setGenere(String genere) { this.genere = genere; }
}
