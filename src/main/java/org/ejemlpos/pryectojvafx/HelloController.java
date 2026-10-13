package org.ejemlpos.pryectojvafx;

import javafx.fxml.FXML;
import javafx.scene.control.Label;

public class HelloController {
    @FXML
    private Label welcomeText;

    @FXML
    protected void onHelloButtonClick() {
        welcomeText.setText("He realizado la actualizacion de mi proyecto java fx");
    }
}
