package com.gl.gestionproduits.Service;

import com.gl.gestionproduits.DAO.CategorieDAO;
import com.gl.gestionproduits.Model.Categorie;
import com.gl.gestionproduits.config.FactoryJPA;

import javax.persistence.EntityManager;

public class CategorieService {
    private final CategorieDAO dao;
    public CategorieService(CategorieDAO dao) {this.dao = dao;}
    public void ajout(Categorie cat){
        EntityManager em = FactoryJPA.getManager();
        em.getTransaction().begin();
        dao.ajoutCategorie(cat,em);
        em.getTransaction().commit();
    }
}
