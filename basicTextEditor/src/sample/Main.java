package sample;

import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.TextArea;
import javafx.scene.control.TextField;
import javafx.scene.layout.VBox;
import javafx.stage.Stage;

import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;
import java.io.File;

import java.awt.Desktop;


public class Main extends Application {

    Scene scene1;
    Button showButton;

    public static void main(String[] args) {
        launch(args);

    }

    @Override
    public void start(Stage primaryStage) throws Exception {
        Label firstLabel = new Label("Aya's text editor");
        TextArea mainTextArea = new TextArea();
        Label saveLabel = new Label("Save file name:");
        TextField saveFileName = new TextField();


        showButton = new Button("Save text");
        showButton.setOnAction(e -> {
            try {
                FileWriter write = new FileWriter(saveFileName.getText()+".txt", false);
                PrintWriter print = new PrintWriter(write);
                print.printf(mainTextArea.getText());
                print.close();
            }
            catch (IOException ex) {
                ex.printStackTrace();
            }
        });

        VBox layout1 = new VBox(20);
        layout1.getChildren().addAll(firstLabel, mainTextArea, saveLabel, saveFileName, showButton);
        Scene mainScene = new Scene(layout1, 500, 800);

        primaryStage.setScene(mainScene);
        primaryStage.show();

    }
}
