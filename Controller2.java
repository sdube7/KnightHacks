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

public class Controller2 {

    public Label output;
    file f1 = new file();

    public void back(ActionEvent event) throws IOException {
        Object tableViewParent = FXMLLoader.load(getClass().getResource("sample.fxml"));
        Scene initialConfiguration = new Scene((Parent) tableViewParent);
        Stage window = (Stage) ((Node) event.getSource()).getScene().getWindow();
        window.setScene(initialConfiguration);
        window.show();
    }
    @FXML
    public void initialize() {
        outputSet();
    }
    public void outputSet(){
        if (f1.getCounter() == 0) {
            output.setText(f1.getCapital());
        }
        if (f1.getCounter() == 1) {
            output.setText(f1.getContinent());
        }
        if (f1.getCounter() == 2) {
            output.setText(f1.getPopulation());
        }
        if (f1.getCounter() == 3) {
            output.setText(f1.getLanguage());
        }
        if (f1.getCounter() == 4) {
            output.setText(f1.getCurrency());
        }
        if (f1.getCounter() == 5) {
            output.setText(f1.getCallingId());
        }
        if (f1.getCounter() == 6) {
            output.setText(f1.getName());
        }
        if (f1.getCounter() == 7) {
            output.setText(f1.getSubRegion());
        }
        if (f1.getCounter() == 8) {
            output.setText(f1.getArea());
        }
    }
}
