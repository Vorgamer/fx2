package sample;

import javafx.application.Application;
import javafx.event.ActionEvent;
import javafx.event.EventHandler;
import javafx.geometry.Insets;
import javafx.geometry.Pos;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.TextArea;
import javafx.scene.control.TextField;
import javafx.scene.layout.GridPane;
import javafx.scene.layout.HBox;
import javafx.scene.text.Font;
import javafx.scene.text.FontWeight;
import javafx.scene.text.Text;
import javafx.stage.Stage;

public class Main extends Application {

    Stage game;
    Scene startScreen;
    Scene gameScreen;
    Scene summaryScreen;



    public static void main(String[] args) {
        launch(args);
    }

    public String userName;

    @Override
    public void start(Stage primaryStage) {
        primaryStage.setTitle("First Game!");

        GridPane grid = new GridPane();
        grid.setHgap(5);
        grid.setVgap(5);
        grid.setPadding(new Insets(5, 5, 5, 5));

        Text scenetitle = new Text("Welcome in my game!");
        scenetitle.setFont(Font.font("Tahoma", FontWeight.NORMAL, 20));
        grid.add(scenetitle, 1, 1, 1, 1);

        TextArea description = new TextArea("To start game please input your username and press Start!");
        description.setFont(Font.font("Tahoma", FontWeight.NORMAL, 10));
        description.setPrefHeight(1);
        description.setWrapText(true);
        description.setEditable(false);
        HBox hbDesc = new HBox(10);
        hbDesc.setAlignment(Pos.CENTER);
        hbDesc.getChildren().add(description);
        grid.add(description, 1, 3, 1, 1);

        Label userNameLabel = new Label("User Name:");
        grid.add(userNameLabel, 1, 5);

        TextField userNameInputField = new TextField();
        userName = userNameInputField.getText();
        grid.add(userNameInputField, 1, 6);

        Button playBtn = new Button("Start!");
        HBox hbBtn = new HBox(10);
        hbBtn.setAlignment(Pos.CENTER);
        hbBtn.getChildren().add(playBtn);
        grid.add(hbBtn, 1, 10);

        Label label = new Label();
        grid.add(label, 1, 12);

        GridPane grid1 = new GridPane();

        Scene scene1 = new Scene(grid, 1000, 1000);
        Scene scene2 = new Scene(grid1, 1000, 1000);
        primaryStage.setScene(scene1);

        playBtn.setOnAction(new EventHandler<ActionEvent>() {
            @Override
            public void handle(ActionEvent event) {
                if (userNameInputField.getText() != null) {
                    primaryStage.setScene(scene2);
                } else {
                    label.setText("Input your username first");
                }
            }
        });

        primaryStage.show();

    }

}

