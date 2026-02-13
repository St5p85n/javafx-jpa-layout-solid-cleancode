module com.gl.gestionproduits {
    requires javafx.controls;
    requires javafx.fxml;
    requires javafx.web;

    requires org.controlsfx.controls;
    requires com.dlsc.formsfx;
    requires net.synedra.validatorfx;
    requires org.kordamp.bootstrapfx.core;
    requires java.persistence;
    requires static lombok;
    requires org.hibernate.orm.core;
    requires java.sql;
    opens com.gl.gestionproduits.Model to org.hibernate.orm.core, java.persistence;
    opens com.gl.gestionproduits to javafx.fxml;
    opens com.gl.gestionproduits.Controller to javafx.fxml;
    exports com.gl.gestionproduits;
}