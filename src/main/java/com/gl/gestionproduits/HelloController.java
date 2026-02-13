package com.gl.gestionproduits;

import com.gl.gestionproduits.DAO.CategorieDAO;
import com.gl.gestionproduits.Model.Categorie;
import com.gl.gestionproduits.Utilitaire.Navigation;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.control.Label;
import javafx.scene.layout.StackPane;

import java.io.IOException;

public class HelloController {
    @FXML
    private Label welcomeText;

    @FXML
    private StackPane stackPane;
    @FXML
    protected void onHelloButtonClick() {

        welcomeText.setText("Welcome to JavaFX Application!");

    }

    @FXML
    protected void afficheAjoutCategorie(){
        Navigation.loadView("ajoutCat.fxml",stackPane);
    }
    @FXML
    protected void afficheListeCategorie(){
        Navigation.loadView("listCat.fxml",stackPane);
    }

}
