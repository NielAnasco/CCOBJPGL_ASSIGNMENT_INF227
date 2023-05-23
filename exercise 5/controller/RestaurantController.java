package controller;

import model.*;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.Alert;
import javafx.scene.control.Button;
import javafx.scene.control.Alert.AlertType;
import javafx.scene.image.ImageView;

public class RestaurantController {

    @FXML
    ImageView img1, img2, img3, img4, img5;
    
    @FXML
    Button btn1, btn2, btn3, btn4, btn5;

    Giligans giligans = new Giligans();
    Jollibee jollibee = new Jollibee();
    MarugameUdon marugameudon = new MarugameUdon();
    Maxs maxs = new Maxs();
    RomanticBaboy romanticbaboy = new RomanticBaboy();
    

    public void initialize() {

        giligans.setColor("Green");
        giligans.setTaste("Toothsome");

        jollibee.setColor("Red");
        jollibee.setTaste("Delicious");

        marugameudon.setColor("Red and White");
        marugameudon.setTaste("Heavenly");

        maxs.setColor("Red and White");
        maxs.setTaste("Mouthwatering");

        romanticbaboy.setColor("Red and Black");
        romanticbaboy.setTaste("Appetizing");
    }

    public void showInfo(ActionEvent event) {

        Button sourceButton = (Button) event.getSource();
        Alert alert = new Alert(AlertType.INFORMATION);

        if (sourceButton.equals(btn1)) {
            alert.setContentText("Giligans are " + giligans.getColor() + " and " + giligans.getTaste());
        }

        if (sourceButton.equals(btn2)) {
            alert.setContentText("Jollibee are " + jollibee.getColor() + " and " + jollibee.getTaste());
        }

        if (sourceButton.equals(btn3)) {
            alert.setContentText("Marugame Udon are " + marugameudon.getColor() + " and " + marugameudon.getTaste());
        }

        if (sourceButton.equals(btn4)) {
            alert.setContentText("Max's are " + maxs.getColor() + " and " + maxs.getTaste());
        }

        if (sourceButton.equals(btn5)) {
            alert.setContentText("Romantic Baboy are " + romanticbaboy.getColor() + " and " + romanticbaboy.getTaste());
        }

        alert.showAndWait();

    }
}