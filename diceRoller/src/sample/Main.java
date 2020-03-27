package sample;

import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;
import javafx.scene.layout.HBox;
import javafx.scene.layout.VBox;
import javafx.stage.Stage;

public class Main extends Application {

    Button rollButton;
    String result;
    Scene scene;

    public static void main(String[] args) {
        launch(args);
    }

    @Override
    public void start(Stage primaryStage) throws Exception {
        primaryStage.setTitle("Aya's Dice Rolling Program");
        DiceRoller dice = new DiceRoller();
        Label diceToRollLabel = new Label("Number to roll");
        Label maxNumLabel = new Label("Sides");

        TextField diceToRoll = new TextField();
        TextField maxRoll = new TextField();
        Label output = new Label("");
        rollButton = new Button("Roll the dice!");
        rollButton.setOnAction(e -> {
            result = dice.roll(Integer.parseInt(diceToRoll.getText()), Integer.parseInt(maxRoll.getText()));
            output.setText(result);
            primaryStage.setHeight(200+(18*Integer.parseInt(diceToRoll.getText())));
        });

        HBox roll1 = new HBox(20);
        roll1.getChildren().addAll(diceToRollLabel, diceToRoll);

        HBox roll2 = new HBox(20);
        roll2.getChildren().addAll(maxNumLabel, maxRoll);

        VBox layout = new VBox(20);
        layout.getChildren().addAll(roll1, roll2, rollButton, output);

        scene = new Scene(layout, 350, 200);
        primaryStage.setScene(scene);
        primaryStage.show();

    }
}
