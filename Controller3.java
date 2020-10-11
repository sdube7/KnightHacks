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

public class Controller3 {
    public Button b1;
    public Button b3;
    public Button b4;
    public Button b2;
    file f1 = new file();

    public void initialize() {
        b1.setVisible(false);
        b2.setVisible(false);
        b3.setVisible(false);
        b4.setVisible(false);
        if (f1.getBorder1() != null){
            b1.setText(f1.getBorder1());
            b1.setVisible(true);
        }
        if (f1.getBorder2() != null){
            b2.setText(f1.getBorder2());
            b2.setVisible(true);
        }
        if (f1.getBorder3() != null){
            b3.setText(f1.getBorder3());
            b3.setVisible(true);
        }
        if (f1.getBorder4() != null){
            b4.setText(f1.getBorder4());
            b4.setVisible(true);
        }
    }
    public void back(ActionEvent event) throws IOException {
        Object tableViewParent = FXMLLoader.load(getClass().getResource("sample.fxml"));
        Scene initialConfiguration = new Scene((Parent) tableViewParent);
        Stage window = (Stage) ((Node) event.getSource()).getScene().getWindow();
        window.setScene(initialConfiguration);
        window.show();
    }
    public void next1(ActionEvent event) throws IOException {
        file.values(b1.getText());
        Object tableViewParent = FXMLLoader.load(getClass().getResource("sample.fxml"));
        Scene initialConfiguration = new Scene((Parent) tableViewParent);
        Stage window = (Stage) ((Node) event.getSource()).getScene().getWindow();
        window.setScene(initialConfiguration);
        window.show();
    }
    public void next2(ActionEvent event) throws IOException {
        file.values(b3.getText());
        Object tableViewParent = FXMLLoader.load(getClass().getResource("sample.fxml"));
        Scene initialConfiguration = new Scene((Parent) tableViewParent);
        Stage window = (Stage) ((Node) event.getSource()).getScene().getWindow();
        window.setScene(initialConfiguration);
        window.show();
    }
    public void next3(ActionEvent event) throws IOException {
        file.values(b4.getText());
        Object tableViewParent = FXMLLoader.load(getClass().getResource("sample.fxml"));
        Scene initialConfiguration = new Scene((Parent) tableViewParent);
        Stage window = (Stage) ((Node) event.getSource()).getScene().getWindow();
        window.setScene(initialConfiguration);
        window.show();
    }
    public void next4(ActionEvent event) throws IOException {
        file.values(b2.getText());
        Object tableViewParent = FXMLLoader.load(getClass().getResource("sample.fxml"));
        Scene initialConfiguration = new Scene((Parent) tableViewParent);
        Stage window = (Stage) ((Node) event.getSource()).getScene().getWindow();
        window.setScene(initialConfiguration);
        window.show();
    }
}
