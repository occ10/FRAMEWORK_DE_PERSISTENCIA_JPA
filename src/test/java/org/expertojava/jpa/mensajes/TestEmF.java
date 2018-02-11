package org.expertojava.jpa.mensajes;

/**
 * Created by expertojava on 11/02/18.
 */

import org.junit.Test;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

import static org.junit.Assert.*;
public class TestEmF {

    @Test
    public void createEntityManagerTest() {
        EntityManagerFactory emf =
                Persistence.createEntityManagerFactory("mensajes-mysql");
        EntityManager em = emf.createEntityManager();
        assertNotNull(em);
        em.close();
    }
}
