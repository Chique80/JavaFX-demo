package sample;

import javafx.application.Application;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.layout.BorderPane;
import javafx.stage.Stage;

public class GameWindow extends Application {

    public GameWindow()
    {
    }

    @Override
    public void start(Stage primaryStage) {
        BorderPane root = new BorderPane();

        Button btn = new Button();
        btn.setText("Hello World");
        root.setCenter(btn);

        Scene scene = new Scene(root, 300, 275);

        primaryStage.setTitle("Hello World");
        primaryStage.setScene(scene);
        primaryStage.show();
    }

    public void play(String[] args)
    {
        launch(args);
    }
}
