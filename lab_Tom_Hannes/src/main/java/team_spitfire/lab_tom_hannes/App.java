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
    
    //
    public static void InsertX(int Zeile, boolean LinksNachRechts,FieldModel NeuesFeld){
        FieldModel A0 = field[0][Zeile];
        FieldModel A1 = field[1][Zeile];
        FieldModel A2 = field[2][Zeile];
        FieldModel A3 = field[3][Zeile];
        FieldModel A4 = field[4][Zeile];
        FieldModel A5 = field[5][Zeile];
        FieldModel A6 = field[6][Zeile];
        
        if(LinksNachRechts == true){
            field[0][Zeile] = NeuesFeld;
            field[1][Zeile] = A0;
            field[2][Zeile] = A1;
            field[3][Zeile] = A2;
            field[4][Zeile] = A3;
            field[5][Zeile] = A4;
            field[6][Zeile] = A5;
        }
        
        if(LinksNachRechts == false){
            field[6][Zeile] = NeuesFeld;
            field[5][Zeile] = A6;
            field[4][Zeile] = A5;
            field[3][Zeile] = A4;
            field[2][Zeile] = A3;
            field[1][Zeile] = A2;
            field[0][Zeile] = A1;
        }
        
        
    }
    
    public static void InsertY(int Spalte, boolean ObenNachUnten,FieldModel NeuesFeld){
        FieldModel A0 = field[Spalte][0];
        FieldModel A1 = field[Spalte][1];
        FieldModel A2 = field[Spalte][2];
        FieldModel A3 = field[Spalte][3];
        FieldModel A4 = field[Spalte][4];
        FieldModel A5 = field[Spalte][5];
        FieldModel A6 = field[Spalte][6];
        
        if(ObenNachUnten == true){
            field[Spalte][0] = NeuesFeld;
            field[Spalte][1] = A0;
            field[Spalte][2] = A1;
            field[Spalte][3] = A2;
            field[Spalte][4] = A3;
            field[Spalte][5] = A4;
            field[Spalte][6] = A5;
        }
        
        if(ObenNachUnten == false){
            field[Spalte][6] = NeuesFeld;
            field[Spalte][5] = A6;
            field[Spalte][4] = A5;
            field[Spalte][3] = A4;
            field[Spalte][2] = A3;
            field[Spalte][1] = A2;
            field[Spalte][0] = A1;
        }
        
        
    }
    
    
}