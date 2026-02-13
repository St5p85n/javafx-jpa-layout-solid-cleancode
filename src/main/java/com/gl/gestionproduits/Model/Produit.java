package com.gl.gestionproduits.Model;

import lombok.*;

import javax.persistence.*;

@Data
@Entity
public class Produit {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;
    private String nomProd;
    private int quanite;
    private float prix;
    @ManyToOne
    @JoinColumn(name = "categorie_id")
    private Categorie categorie;
}
