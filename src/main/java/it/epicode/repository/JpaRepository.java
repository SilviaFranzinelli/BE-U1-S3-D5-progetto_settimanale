package it.epicode.repository;

import it.epicode.getset.Libro;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

public interface LibroRepository extends JpaRepository<Libro, String> {
    Libro findByIsbn(String isbn);
    List<Libro> findByAnnoPubblicazione(int anno);
    List<Libro> findByAutore(String autore);
    List<Libro> findByTitoloContaining(String titolo);
}
