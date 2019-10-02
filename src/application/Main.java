package application;

import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.stage.Stage;

public class Main extends Application {

    private static Stage myappStageScene;

    @Override
    public void start(Stage primaryStage) throws Exception {
        Parent root = FXMLLoader.load(getClass().getResource("views/sample.fxml"));
        myappStageScene = primaryStage;
        myappStageScene.setTitle("Hello World");
        myappStageScene.setScene(new Scene(root, 600, 400));
        myappStageScene.show();
    }

    public static Stage getStage() {
        return myappStageScene;
    }

    public static void main(String[] args) {
        launch(args);
    }
}
