package assignment2;

import javafx.application.Application;
import static javafx.application.Application.launch;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.stage.Stage;

/**
 *
 * @author Dylan
 */
public class LaunchGame extends Application{
    public static void main(String[]args){
        launch(args);
    }
    
    @Override
    public void start(Stage primaryStage) throws Exception {
        //load FXML File
        Parent root = FXMLLoader.load(getClass().getResource("GameView.fxml"));
        //create new scene
        Scene scene = new Scene(root);
        //set title
        primaryStage.setTitle("Games");
        //set scene
        primaryStage.setScene(scene);
        //launch window
        primaryStage.show();
    }
}
