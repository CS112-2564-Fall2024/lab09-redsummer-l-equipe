package cs112.lab09.controllers;

import cs112.lab09.RedSummer;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.Scene;
import javafx.scene.image.Image;
import javafx.scene.image.ImageView;
import javafx.stage.Modality;
import javafx.stage.Stage;


import java.io.IOException;

import static cs112.lab09.Constants.*;
import static cs112.lab09.Constants.MAP_VIEW_TITLE;

public class MapController {

    @FXML
    ImageView imageLabel;

    public void initialize() {
        Image image = new Image(REDSUMMER_IMAGE_PATH);
        imageLabel.setImage(image);
    }

    public void handleSanFranciscoCalifornia() throws IOException {


    public void handleBisbeeArizona() throws IOException {


    }

    public void handleOpenPopup() {
            Stage stage = new Stage();
            stage.initModality(Modality.APPLICATION_MODAL);

            FXMLLoader fxmlLoader = new FXMLLoader(RedSummer(RedSummer.class.getResource(CITY_VIEW_RESOURCE));
            Scene scene = new Scene(fxmlLoader.load());
            stage.setScene(scene);
            stage.setTitle(CITY_VIEW_TITLE);
            CityController cityController = fxmlLoader.getController();
            stage.show();)
        }
}
