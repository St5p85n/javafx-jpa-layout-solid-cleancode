package com.gl.gestionproduits.Controller;
import com.gl.gestionproduits.DAO.CategorieDAO;
import com.gl.gestionproduits.Model.Categorie;
import com.gl.gestionproduits.Service.CategorieService;
import javafx.fxml.FXML;
import javafx.scene.control.TextField;

public class CategorieController {
    @FXML
    private TextField libT;
    private final CategorieService categorieService = new CategorieService(new CategorieDAO());


    @FXML
    protected void addCategorie(){
        Categorie c = new Categorie();
        c.setLibelle(libT.getText());
        categorieService.ajout(c);
    }
}
