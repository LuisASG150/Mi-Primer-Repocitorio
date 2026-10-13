package org.ejemlpos.pryectojvafx;

import javafx.fxml.FXML;
import javafx.scene.control.Label;

public class HelloController {
    @FXML
    private Label welcomeText;

    @FXML
    protected void onHelloButtonClick() {
        //ANTES
        // welcomeText.setText("Welcome to JavaFX Application!");
        // DESPUES
           welcomeText.setText("He realizado la actualizaciòn de mi proyecto javaFx");
    }
}
