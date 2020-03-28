package sample;

import javafx.scene.Scene;
import javafx.scene.layout.GridPane;
import javafx.stage.Stage;

public class FistChapter {

    public void firstChapter() {
        Stage firstChapterStage = new Stage();
        firstChapterStage.setTitle("First Game!");

        GridPane grid = new GridPane();

        Scene firstChScene = new Scene(grid, 300, 500);
        firstChapterStage.setScene(firstChScene);
//        firstChapterStage.show();
    }
}
