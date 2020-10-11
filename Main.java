package sample;

import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.stage.Stage;

import java.util.Scanner;


public class Main extends Application {

    @Override
    public void start(Stage primaryStage) throws Exception {
        FXMLLoader loader = new FXMLLoader(Main.class.getResource("sample.fxml"));
        Parent root = loader.load();
        primaryStage.setTitle("Hello World");
        primaryStage.setScene(new Scene(root, 800, 500));
        primaryStage.show();
    }


    public static void main(String[] args) {
        boolean check = true;
        String input = "";
        while (check) {
            System.out.println("Enter a 3 digit country code to continue");
            Scanner scan = new Scanner(System.in);
            input = scan.nextLine();
            if (input.length() == 3) {
                check = false;
                file.reading();
                file.values(input);
            }
        }

        launch(args);

    }
}
