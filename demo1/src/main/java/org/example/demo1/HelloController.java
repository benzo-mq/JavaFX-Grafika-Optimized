package org.example.demo1;

import java.net.URL;
import java.util.ResourceBundle;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.Scene;
import javafx.scene.control.Alert;
import javafx.scene.control.Button;
import javafx.scene.control.TextField;
import javafx.stage.Stage;

public class HelloController {

    @FXML
    private ResourceBundle resources;

    @FXML
    private URL location;

    @FXML
    private TextField Password;
    @FXML
    private Button next;
    @FXML
    private TextField name;

    @FXML
    private Button save;

    @FXML
    private Button update;

    @FXML
    void Doliev07(ActionEvent event) {

    }

    @FXML
    void OnActonUpdate(ActionEvent event) {
        name.clear();
        Password.clear();
        name.setStyle("");
        Password.setStyle("");
    }
    @FXML
    void OnActionnext(ActionEvent event) throws Exception {
        if (name.getText(). equals("admin")&&Password.getText().equals("admin")){
            Stage stage = (Stage) next.getScene().getWindow(); // закрывает прошлое окно
            FXMLLoader fxmlLoader = new FXMLLoader(HelloApplication.class.getResource(  "task.fxml"));
            Scene scene = new Scene(fxmlLoader.load(), 600, 400);
            stage.setTitle("task!");
            stage.setScene(scene);
            stage.show();
        }else {
            Alert alert = new Alert(Alert.AlertType.ERROR);
            alert.setHeaderText("Ошибка");
            alert.setContentText("Вы ввели не правильный логин или пароль");
            alert.showAndWait();
        }}
    @FXML
    void onHelloButtonClick(ActionEvent event) {
        name.setStyle("fx-text-fill: blue:");
        Password.setStyle("fx-text-fill: blue");

    }

    @FXML
    void initialize() {
        assert Password != null : "fx:id=\"Password\" was not injected: check your FXML file 'hello-view.fxml'.";
        assert name != null : "fx:id=\"name\" was not injected: check your FXML file 'hello-view.fxml'.";
        assert save != null : "fx:id=\"save\" was not injected: check your FXML file 'hello-view.fxml'.";
        assert update != null : "fx:id=\"update\" was not injected: check your FXML file 'hello-view.fxml'.";

    }

}
