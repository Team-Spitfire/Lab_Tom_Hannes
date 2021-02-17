package team_spitfire.lab_tom_hannes;

import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.stage.Stage;

import java.io.IOException;
import java.util.ArrayList;


/**
 * JavaFX App
 */
public class App extends Application {

    private static Scene scene;
    private static ArrayList<FieldModel> list;
    private static ArrayList<CardModel> cardList;
    private static FieldModel[][] field;
    private static FieldModel NewField;
    
  //--------------------------------------- DEKLARIERUNG ----------------------------------------
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
        list = new ArrayList<FieldModel> ();
        cardList = new ArrayList<CardModel> ();
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
      //name  _init_          up  right down left -->   -------------------------------------- SAME -----------------------------------------                                  
        sk1 = new FieldModel(true,true,false,true);  kk1 = new FieldModel(false,true,true,false);  gk1 = new FieldModel(false,true,false,true); 
        sk2 = new FieldModel(true,true,false,true);  kk2 = new FieldModel(false,true,true,false);  gk2 = new FieldModel(false,true,false,true);
        sk3 = new FieldModel(true,true,false,true);  kk3 = new FieldModel(false,true,true,false);  gk3 = new FieldModel(false,true,false,true);
        sk4 = new FieldModel(true,true,false,true);  kk4 = new FieldModel(false,true,true,false);  gk4 = new FieldModel(false,true,false,true);
        sk5 = new FieldModel(true,true,false,true);  kk5 = new FieldModel(false,true,true,false);  gk5 = new FieldModel(false,true,false,true);
        sk6 = new FieldModel(true,true,false,true);  kk6 = new FieldModel(false,true,true,false);  gk6 = new FieldModel(false,true,false,true);
        sk7 = new FieldModel(true,true,false,true);  kk7 = new FieldModel(false,true,true,false);  gk7 = new FieldModel(false,true,false,true);
        sk8 = new FieldModel(true,true,false,true);  kk8 = new FieldModel(false,true,true,false);  gk8 = new FieldModel(false,true,false,true);
        sk9 = new FieldModel(true,true,false,true);  kk1 = new FieldModel(false,true,true,false);  gk9 = new FieldModel(false,true,false,true);
        sk10 = new FieldModel(true,true,false,true); kk10 = new FieldModel(false,true,true,false); gk10 = new FieldModel(false,true,false,true);
        sk11 = new FieldModel(true,true,false,true); kk11 = new FieldModel(false,true,true,false); gk11 = new FieldModel(false,true,false,true);
        sk12 = new FieldModel(true,true,false,true); kk12 = new FieldModel(false,true,true,false); gk12 = new FieldModel(false,true,false,true); 

        //fügt zu list hinzu
        list.add(sk1);  list.add(kk1);  list.add(gk1);
        list.add(sk2);  list.add(kk2);  list.add(gk2);
        list.add(sk3);  list.add(kk3);  list.add(gk3);
        list.add(sk4);  list.add(kk4);  list.add(gk4);
        list.add(sk5);  list.add(kk5);  list.add(gk5);
        list.add(sk6);  list.add(kk6);  list.add(gk6);
        list.add(sk7);  list.add(kk7);  list.add(gk7);
        list.add(sk8);  list.add(kk8);  list.add(gk8);
        list.add(sk9);  list.add(kk9);  list.add(gk9);
        list.add(sk10); list.add(kk10); list.add(gk10);
        list.add(sk11); list.add(kk11); list.add(gk11);
        list.add(sk12); list.add(kk12); list.add(gk12);
    
        launch();
    }
    
    
    //NewField ist die FeldKarte, die immer übrig bleibt.
    public static FieldModel getNewField(){
        return App.NewField;
    }
    
    public static void setNewField(FieldModel NF){
        App.NewField = NF;
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
            
            App.setNewField(A6);
        }
        
        if(LinksNachRechts == false){
            field[6][Zeile] = NeuesFeld;
            field[5][Zeile] = A6;
            field[4][Zeile] = A5;
            field[3][Zeile] = A4;
            field[2][Zeile] = A3;
            field[1][Zeile] = A2;
            field[0][Zeile] = A1;
            
            App.setNewField(A0);
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
            
            App.setNewField(A6);
        }
        
        if(ObenNachUnten == false){
            field[Spalte][6] = NeuesFeld;
            field[Spalte][5] = A6;
            field[Spalte][4] = A5;
            field[Spalte][3] = A4;
            field[Spalte][2] = A3;
            field[Spalte][1] = A2;
            field[Spalte][0] = A1;
            
            App.setNewField(A0);
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
    
