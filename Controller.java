package pl.lublin.wsei.java.cwiczenia.lab2cw1;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;

public class Controller {

    @FXML
    public Button btnMain;
    //private Label resultLabel;
    public TextField txtLicznik;

    int clickCounter = 0;

    @FXML
    public void onBtnAction(ActionEvent actionEvent) {

        System.out.println("Wartość z Button: kliknięcie nr " + ++clickCounter);

        if (clickCounter == 1)
            btnMain.setText("I jeszcze raz");

    }

    public void onTxtField(ActionEvent event) {

        String x1 = txtLicznik.getText();
        System.out.println("Wartość z TextField: " + x1);

    }
}