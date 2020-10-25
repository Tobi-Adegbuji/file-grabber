import javafx.application.Application;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.layout.StackPane;
import javafx.stage.Stage;

import java.io.File;

public class Main extends Application {
    public static void main(String[] args) {
        launch(args);
    }
    @Override
    public void start(Stage stage) throws Exception {
        stage.setTitle("File Grabber");
        Button btn = new Button();
        btn.setText("Find Input File");
        btn.setOnAction(actionEvent -> {
            System.out.println("Launching Window Finder");
        });
        StackPane root = new StackPane();
        root.getChildren().add(btn);
        stage.setScene(new Scene(root, 650, 700));
        stage.show();
    }
}
