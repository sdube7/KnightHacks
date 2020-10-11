package sample;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.Node;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.stage.Stage;

import java.io.IOException;
import java.net.URL;
import java.util.ResourceBundle;

public class Controller {
    public Label labeling;

    file f1 = new file();

    public void capital(ActionEvent event) throws IOException {
        f1.setCounter(0);
        Object tableViewParent = FXMLLoader.load(getClass().getResource("values.fxml"));
        Scene initialConfiguration = new Scene((Parent) tableViewParent);
        Stage window = (Stage) ((Node) event.getSource()).getScene().getWindow();
        window.setScene(initialConfiguration);
        window.show();
    }
    public void continent(ActionEvent event) throws IOException {
        f1.setCounter(1);
        Object tableViewParent = FXMLLoader.load(getClass().getResource("values.fxml"));
        Scene initialConfiguration = new Scene((Parent) tableViewParent);
        Stage window = (Stage) ((Node) event.getSource()).getScene().getWindow();
        window.setScene(initialConfiguration);
        window.show();
    }
    public void population(ActionEvent event) throws IOException {
        f1.setCounter(2);
        Object tableViewParent = FXMLLoader.load(getClass().getResource("values.fxml"));
        Scene initialConfiguration = new Scene((Parent) tableViewParent);
        Stage window = (Stage) ((Node) event.getSource()).getScene().getWindow();
        window.setScene(initialConfiguration);
        window.show();
    }
    public void language(ActionEvent event) throws IOException {
        f1.setCounter(3);
        Object tableViewParent = FXMLLoader.load(getClass().getResource("values.fxml"));
        Scene initialConfiguration = new Scene((Parent) tableViewParent);
        Stage window = (Stage) ((Node) event.getSource()).getScene().getWindow();
        window.setScene(initialConfiguration);
        window.show();
    }
    public void currency(ActionEvent event) throws IOException {
        f1.setCounter(4);
        Object tableViewParent = FXMLLoader.load(getClass().getResource("values.fxml"));
        Scene initialConfiguration = new Scene((Parent) tableViewParent);
        Stage window = (Stage) ((Node) event.getSource()).getScene().getWindow();
        window.setScene(initialConfiguration);
        window.show();
    }
    public void callingCode(ActionEvent event) throws IOException {
        f1.setCounter(5);
        Object tableViewParent = FXMLLoader.load(getClass().getResource("values.fxml"));
        Scene initialConfiguration = new Scene((Parent) tableViewParent);
        Stage window = (Stage) ((Node) event.getSource()).getScene().getWindow();
        window.setScene(initialConfiguration);
        window.show();
    }
    public void name(ActionEvent event) throws IOException {
        f1.setCounter(6);
        Object tableViewParent = FXMLLoader.load(getClass().getResource("values.fxml"));
        Scene initialConfiguration = new Scene((Parent) tableViewParent);
        Stage window = (Stage) ((Node) event.getSource()).getScene().getWindow();
        window.setScene(initialConfiguration);
        window.show();
    }
    public void region(ActionEvent event) throws IOException {
        f1.setCounter(7);
        Object tableViewParent = FXMLLoader.load(getClass().getResource("values.fxml"));
        Scene initialConfiguration = new Scene((Parent) tableViewParent);
        Stage window = (Stage) ((Node) event.getSource()).getScene().getWindow();
        window.setScene(initialConfiguration);
        window.show();
    }
    public void landArea(ActionEvent event) throws IOException {
        f1.setCounter(8);
        Object tableViewParent = FXMLLoader.load(getClass().getResource("values.fxml"));
        Scene initialConfiguration = new Scene((Parent) tableViewParent);
        Stage window = (Stage) ((Node) event.getSource()).getScene().getWindow();
        window.setScene(initialConfiguration);
        window.show();
    }
    public void border(ActionEvent event) throws IOException {
        f1.setCounter(9);
        Object tableViewParent = FXMLLoader.load(getClass().getResource("border.fxml"));
        Scene initialConfiguration = new Scene((Parent) tableViewParent);
        Stage window = (Stage) ((Node) event.getSource()).getScene().getWindow();
        window.setScene(initialConfiguration);
        window.show();
    }
    public void initialize() {
        labeling.setText(f1.getCc());
    }


}
