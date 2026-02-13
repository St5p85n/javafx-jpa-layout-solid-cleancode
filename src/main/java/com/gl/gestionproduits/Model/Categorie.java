package com.gl.gestionproduits.Model;

import lombok.Data;

import javax.persistence.*;
import java.util.List;
@Data
@Entity
public class Categorie {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;
    private String libelle;
    @OneToMany(mappedBy = "categorie", cascade = CascadeType.ALL,fetch = FetchType.LAZY)
    private List<Produit> produits;
}
