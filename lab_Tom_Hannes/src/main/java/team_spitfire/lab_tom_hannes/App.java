package team_spitfire.lab_tom_hannes;

import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.stage.Stage;

import java.io.IOException;

/**
 * JavaFX App
 */
public class App extends Application {

    private static Scene scene;
    private static FieldModel[][] field;

    @Override
    public void start(Stage stage) throws IOException {
        scene = new Scene(loadFXML("homeScreenView"), 640, 480);
        field = new FieldModel[7][7];
        stage.setScene(scene);
        stage.show();
        
    }
   
    
    static void setRoot(String fxml) throws IOException {
        scene.setRoot(loadFXML(fxml));
    }

    private static Parent loadFXML(String fxml) throws IOException {
        FXMLLoader fxmlLoader = new FXMLLoader(App.class.getResource(fxml + ".fxml"));
        return fxmlLoader.load();
    }

    public static void main(String[] args) {
        launch();
    }
    
    public static void InsertX(int Zeile){
        FieldModel A1 = field[0][Zeile];
    }
    
}