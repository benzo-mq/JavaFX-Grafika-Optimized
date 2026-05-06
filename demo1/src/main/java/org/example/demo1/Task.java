package org.example.demo1;

import java.io.IOException;
import java.net.URL;
import java.util.ResourceBundle;

import javafx.collections.FXCollections;
import javafx.collections.ObservableList;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.ListView;
import javafx.scene.control.TextField;
import javafx.stage.Stage;

public class Task {

    @FXML
    private ResourceBundle resources;

    @FXML
    private URL location;

    @FXML
    private Button Add;



    @FXML
    private TextField Name;

    @FXML
    private Button Previous;

    @FXML
    private Button Remove;

    @FXML
    private Button Thefollowing;
    ObservableList<String> observableList =FXCollections.observableArrayList("1","2","3");
    @FXML
    private ListView<String> List = new ListView<>(observableList);
    @FXML
    void OnActionPrevious(ActionEvent event) throws IOException {
        Stage stage = (Stage) Previous.getScene().getWindow(); // закрывает прошлое окно
        FXMLLoader fxmlLoader = new FXMLLoader(HelloApplication.class.getResource(  "hello-view.fxml"));
        Scene scene = new Scene(fxmlLoader.load(), 341, 237);
        stage.setTitle("table!");
        stage.setScene(scene);
        stage.show();

    }

    @FXML
    void OnActionadd(ActionEvent event) {
        observableList.add(Name.getText());
    }

    @FXML
    void OnActionremove(ActionEvent event) {
        observableList.remove(Name.getText());
    }

    @FXML
    void OnActionthefollowing(ActionEvent event) throws IOException {
        Stage stage = (Stage) Previous.getScene().getWindow(); // закрывает прошлое окно
        FXMLLoader fxmlLoader = new FXMLLoader(HelloApplication.class.getResource(  "table.fxml"));
        Scene scene = new Scene(fxmlLoader.load(), 600, 400);
        stage.setTitle("table!");
        stage.setScene(scene);
        stage.show();

    }

    @FXML
    void initialize() {
        List.setItems(observableList);

    }

}
