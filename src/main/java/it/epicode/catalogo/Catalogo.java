package it.epicode.catalogo;

import it.epicode.entity.ElementoCatalogo;
import javax.persistence.EntityManager;
import java.util.List;

public class Catalogo {
    private EntityManager em;

    public Catalogo(EntityManager em) {
        this.em = em;
    }

    public void aggiungiElemento(ElementoCatalogo elemento) {
        em.getTransaction().begin();
        em.persist(elemento);
        em.getTransaction().commit();
    }

    public void rimuoviElemento(String isbn) {
        em.getTransaction().begin();
        ElementoCatalogo elemento = em.find(ElementoCatalogo.class, isbn);
        if (elemento != null) {
            em.remove(elemento);
        }
        em.getTransaction().commit();
    }

    public ElementoCatalogo ricercaPerISBN(String isbn) {
        return em.find(ElementoCatalogo.class, isbn);
    }

    public List<ElementoCatalogo> ricercaPerAnno(int anno) {
        return em.createQuery("SELECT e FROM ElementoCatalogo e WHERE e.annoPubblicazione = :anno", ElementoCatalogo.class)
                .setParameter("anno", anno)
                .getResultList();
    }

    public List<ElementoCatalogo> ricercaPerTitolo(String titolo) {
        return em.createQuery("SELECT e FROM ElementoCatalogo e WHERE e.titolo LIKE :titolo", ElementoCatalogo.class)
                .setParameter("titolo", "%" + titolo + "%")
                .getResultList();
    }
}
