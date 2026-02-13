package com.gl.gestionproduits.DAO;

import com.gl.gestionproduits.Model.Categorie;
import com.gl.gestionproduits.config.FactoryJPA;

import javax.persistence.EntityManager;

public class CategorieDAO {
    public void ajoutCategorie(Categorie c, EntityManager em){
        em.persist(c);
    }

}
