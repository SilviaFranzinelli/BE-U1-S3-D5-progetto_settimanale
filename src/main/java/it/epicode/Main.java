package it.epicode;

import it.epicode.Catalogo;
import it.epicode.entity.Libro;
import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

public class Main {
    public static void main(String[] args) {
        EntityManagerFactory emf = Persistence.createEntityManagerFactory("bibliotecaPU");
        EntityManager em = emf.createEntityManager();
        CatalogoDAO catalogoDAO = new CatalogoDAO(em);

        // Aggiungere un libro
        Libro libro = new Libro("9781234567890", "Il Signore degli Anelli", 1954, 1000, "J.R.R. Tolkien", "Fantasy");
        catalogoDAO.aggiungiElemento(libro);

        // Ricerca per ISBN
        System.out.println("Libro trovato: " + catalogoDAO.ricercaPerISBN("9781234567890").getTitolo());

        em.close();
        emf.close();
    }
}
