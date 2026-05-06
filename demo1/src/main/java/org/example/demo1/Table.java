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
import javafx.scene.control.TableColumn;
import javafx.scene.control.TableView;
import javafx.scene.control.TextField;
import javafx.scene.control.cell.PropertyValueFactory;
import javafx.stage.Stage;

public class Table {

    @FXML
    private ResourceBundle resources;

    @FXML
    private URL location;

    @FXML
    private Button Add;

    @FXML
    private Button Back;

    @FXML
    private Button Clear;

    @FXML
    private TextField Lodin;

    @FXML
    private TextField Password;
    ObservableList<User> observableList = FXCollections.observableArrayList();

    @FXML
    private Button Remove;

    @FXML
    private TableView<User> table;

    @FXML
    private TableColumn<User, String> collogin;

    @FXML
    private TableColumn<User, String> colpassword;


    @FXML
    void OnActionadd(ActionEvent event) {
        User user = new User(Lodin.getText(), Password.getText());
        observableList .add(user);
        System.out.println(observableList.size());
    }

    @FXML
    void OnActionback(ActionEvent event) throws IOException {
        Stage stage = (Stage) Back.getScene().getWindow(); // закрывает прошлое окно
        FXMLLoader fxmlLoader = new FXMLLoader(HelloApplication.class.getResource(  "task.fxml"));
        Scene scene = new Scene(fxmlLoader.load(), 600, 400);
        stage.setTitle("table!");
        stage.setScene(scene);
        stage.show();
    }

    @FXML
    void OnActionclear(ActionEvent event) {
        observableList.clear();

    }

    @FXML
    void OnActionremove(ActionEvent event) {
        for (int i=0; i<observableList.size(); i++){
            if (Lodin.getText() .equals(observableList.get(i) .getLogin())&&
                    Password.getText().equals(observableList.get(i).getPassword())){
                observableList.remove(i);
            }
        }

    }

    @FXML
    void initialize() {
        table.setItems(observableList);
        collogin.setCellValueFactory(new PropertyValueFactory<>("Login"));
        colpassword.setCellValueFactory(new PropertyValueFactory<>("Password"));

    }

}

