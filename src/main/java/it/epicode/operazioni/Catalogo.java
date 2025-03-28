package it.epicode.operazioni;
import it.epicode.getset.Libro;
import it.epicode.repository.LibroRepository;

import java.util.List;

public class CatalogoService {

    private LibroRepository libroRepository;

    public void aggiungiLibro(Libro libro) {
        libroRepository.save(libro);
    }

    public void rimuoviLibro(String isbn) {
        libroRepository.deleteById(isbn);
    }

    public List<Libro> ricercaPerIsbn(String isbn) {
        return libroRepository.findByIsbn(isbn);
    }

    public List<Libro> ricercaPerAnno(int anno) {
        return libroRepository.findByAnnoPubblicazione(anno);
    }
}

