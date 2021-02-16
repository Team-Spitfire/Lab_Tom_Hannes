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
    
    private static FieldModel sk1;  private static FieldModel kk1;  private static FieldModel gk1;
    private static FieldModel sk2;  private static FieldModel kk2;  private static FieldModel gk2;
    private static FieldModel sk3;  private static FieldModel kk3;  private static FieldModel gk3;
    private static FieldModel sk4;  private static FieldModel kk4;  private static FieldModel gk4;
    private static FieldModel sk5;  private static FieldModel kk5;  private static FieldModel gk5;
    private static FieldModel sk6;  private static FieldModel kk6;  private static FieldModel gk6;
    private static FieldModel sk7;  private static FieldModel kk7;  private static FieldModel gk7;
    private static FieldModel sk8;  private static FieldModel kk8;  private static FieldModel gk8;
    private static FieldModel sk9;  private static FieldModel kk9;  private static FieldModel gk9;
    private static FieldModel sk10; private static FieldModel kk10; private static FieldModel gk10;
    private static FieldModel sk11; private static FieldModel kk11; private static FieldModel gk11;
    private static FieldModel sk12; private static FieldModel kk12; private static FieldModel gk12;
    

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
        sk1 = new FieldModel(true,true,false,true, "bat.png");         kk1 = new FieldModel(false,true,true,false, "turn.png");  gk1 = new FieldModel(false,true,false,true, "straight.png"); 
        sk2 = new FieldModel(true,true,false,true, "dragon.png");      kk2 = new FieldModel(false,true,true,false, "turn.png");  gk2 = new FieldModel(false,true,false,true, "straight.png");
        sk3 = new FieldModel(true,true,false,true, "ghost.png");       kk3 = new FieldModel(false,true,true,false, "turn.png");  gk3 = new FieldModel(false,true,false,true, "straight.png");
        sk4 = new FieldModel(true,true,false,true, "gnome.png");       kk4 = new FieldModel(false,true,true,false, "turn.png");  gk4 = new FieldModel(false,true,false,true, "straight.png");
        sk5 = new FieldModel(true,true,false,true, "moth.png");        kk5 = new FieldModel(false,true,true,false, "turn.png");  gk5 = new FieldModel(false,true,false,true, "straight.png");
        sk6 = new FieldModel(true,true,false,true, "mouse.png");       kk6 = new FieldModel(false,true,true,false, "turn.png");  gk6 = new FieldModel(false,true,false,true, "straight.png");
        sk7 = new FieldModel(true,true,false,true, "owl.png");         kk7 = new FieldModel(false,true,true,false, "turn.png");  gk7 = new FieldModel(false,true,false,true, "straight.png");
        sk8 = new FieldModel(true,true,false,true, "poltergeist.png"); kk8 = new FieldModel(false,true,true,false, "turn.png");  gk8 = new FieldModel(false,true,false,true, "straight.png");
        sk9 = new FieldModel(true,true,false,true, "salamander.png");  kk1 = new FieldModel(false,true,true,false, "turn.png");  gk9 = new FieldModel(false,true,false,true, "straight.png");
        sk10 = new FieldModel(true,true,false,true, "scarab.png");     kk10 = new FieldModel(false,true,true,false, "turn.png"); gk10 = new FieldModel(false,true,false,true, "straight.png");
        sk11 = new FieldModel(true,true,false,true, "spider.png");     kk11 = new FieldModel(false,true,true,false, "turn.png"); gk11 = new FieldModel(false,true,false,true, "straight.png");
        sk12 = new FieldModel(true,true,false,true, "witch.png");      kk12 = new FieldModel(false,true,true,false, "turn.png"); gk12 = new FieldModel(false,true,false,true, "straight.png");
        launch();
    }
    
    //Schiebt ein neues Feld in eine Zeile ein.
    public static void InsertX(int Zeile, boolean LinksNachRechts,FieldModel NeuesFeld){
        //Alte Werte werden gespeichert, damit sie nicht ungewollt übetschrieben werden.
        FieldModel A0 = field[0][Zeile];
        FieldModel A1 = field[1][Zeile];
        FieldModel A2 = field[2][Zeile];
        FieldModel A3 = field[3][Zeile];
        FieldModel A4 = field[4][Zeile];
        FieldModel A5 = field[5][Zeile];
        FieldModel A6 = field[6][Zeile];
        
        
        //if abfrage wird für die Richtung des einschiebens benötigt.
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
    
    //Schiebt ein neues Feld in eine Spalte ein.
    public static void InsertY(int Spalte, boolean ObenNachUnten,FieldModel NeuesFeld){
        //Alte Werte werden gespeichert, damit sie nicht ungewollt übetschrieben werden.
        FieldModel A0 = field[Spalte][0];
        FieldModel A1 = field[Spalte][1];
        FieldModel A2 = field[Spalte][2];
        FieldModel A3 = field[Spalte][3];
        FieldModel A4 = field[Spalte][4];
        FieldModel A5 = field[Spalte][5];
        FieldModel A6 = field[Spalte][6];
        
        //if abfrage wird für die Richtung des einschiebens benötigt.
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
    
    
    //-------------Pfeile Start-------------
    
    //InsertX/Y wurden oben deklariert, aber es gibt nur ein paar Stellen, an den man etwas einschieben kann.
    //Die folgenden Methoten sind für diese Stellen zuständing
    //(in der View gibt es Pfeile zum einschieben, welche hierdurch funktional gemacht werden)
    //Bei der Zählung von X und Y wurde bedacht, dass es bei 0 anfängt.
    
    //Links nach Rechts
    public static void PfeilX1Links(FieldModel F){
        InsertX(1,true,F);
    }
    
    public static void PfeilX3Links(FieldModel F){
        InsertX(3,true,F);
    }
    
    public static void PfeilX5Links(FieldModel F){
        InsertX(5,true,F);
    }
    
    //Rechts nach Links
    public static void PfeilX1Rechts(FieldModel F){
        InsertX(1,false,F);
    }
    
    public static void PfeilX3Rechts(FieldModel F){
        InsertX(3,false,F);
    }
    
    public static void PfeilX5Rechts(FieldModel F){
        InsertX(5,false,F);
    }
    
    //Oben nach Unten
    public static void PfeilY1Oben(FieldModel F){
        InsertY(1,true,F);
    }
    
    public static void PfeilY3Oben(FieldModel F){
        InsertY(3,true,F);
    }
    
    public static void PfeilY5Oben(FieldModel F){
        InsertY(5,true,F);
    }
    
    //Unten nach Oben
    public static void PfeilY1Unten(FieldModel F){
        InsertY(1,false,F);
    }
    
    public static void PfeilY3Unten(FieldModel F){
        InsertY(3,false,F);
    }
    
    public static void PfeilY5Unten(FieldModel F){
        InsertY(5,false,F);
    }
    
    //-------------Pfeile Ende-------------
    
    
}