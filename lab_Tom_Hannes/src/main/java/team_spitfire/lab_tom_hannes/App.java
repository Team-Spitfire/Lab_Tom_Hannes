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
    private static ArrayList<FieldModel> list = new ArrayList<FieldModel> ();
    private static ArrayList<CardModel> cardList = new ArrayList<CardModel> ();
    private static FieldModel[][] field = new FieldModel[7][7];
    private static FieldModel NewField;
    
    //----------------------------------- DEKLARIERUNG FieldModel (feste)-------------------------
    private static FieldModel fsk_2_0;  private static FieldModel fkk_0_0;
    private static FieldModel fsk_4_0;  private static FieldModel fkk_6_0;
    private static FieldModel fsk_0_2;  private static FieldModel fkk_0_6;
    private static FieldModel fsk_2_2;  private static FieldModel fkk_6_6;
    private static FieldModel fsk_4_2;
    private static FieldModel fsk_6_2;
    private static FieldModel fsk_0_4;
    private static FieldModel fsk_2_4;
    private static FieldModel fsk_4_4;
    private static FieldModel fsk_6_4;
    private static FieldModel fsk_2_6;
    private static FieldModel fsk_4_6;
    
    
    
    
    //----------------------------------- DEKLARIERUNG FieldModel (lose)--------------------------
    private static FieldModel sk1;  private static FieldModel kk1;  private static FieldModel gk1;
    private static FieldModel sk2;  private static FieldModel kk2;  private static FieldModel gk2;
    private static FieldModel sk3;  private static FieldModel kk3;  private static FieldModel gk3;
    private static FieldModel sk4;  private static FieldModel kk4;  private static FieldModel gk4;
    private static FieldModel sk5;  private static FieldModel kk5;  private static FieldModel gk5;
    private static FieldModel sk6;  private static FieldModel kk6;  private static FieldModel gk6;
                                    private static FieldModel kk7;  private static FieldModel gk7;
                                    private static FieldModel kk8;  private static FieldModel gk8;
                                    private static FieldModel kk9;  private static FieldModel gk9;
                                    private static FieldModel kk10; private static FieldModel gk10;
                                    private static FieldModel kk11; private static FieldModel gk11;
                                    private static FieldModel kk12; private static FieldModel gk12;
                                    private static FieldModel kk13;
                                    private static FieldModel kk14;
                                    private static FieldModel kk15;
                                    private static FieldModel kk16;
                                    
    
    //----------------------------------- DEKLARIERUNG CardModel----------------------------------------
    private static CardModel c1;    private static CardModel c2;    private static CardModel c3;
    private static CardModel c4;    private static CardModel c5;    private static CardModel c6;
    private static CardModel c7;    private static CardModel c8;    private static CardModel c9;
    private static CardModel c10;   private static CardModel c11;   private static CardModel c12;
    private static CardModel c13;   private static CardModel c14;   private static CardModel c15;
    private static CardModel c16;   private static CardModel c17;   private static CardModel c18;
    private static CardModel c19;   private static CardModel c20;   private static CardModel c21;
    private static CardModel c22;   private static CardModel c23;   private static CardModel c24;
    

    @Override
    public void start(Stage stage) throws IOException {
        scene = new Scene(loadFXML("homeScreenView"), 640, 480);
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
    //feste
      
        
        
        
        
    //lose
      //name        _init_    up  right down left  sI typ  -->   -------------------------------------- SAME -----------------------------------------                                  
        sk1 = new FieldModel(true,true,false,true, 1, "t");  kk1 = new FieldModel(false,true,true,false, 1, "k");     gk1 = new FieldModel(false,true,false,true, 0, "g"); 
        sk2 = new FieldModel(true,true,false,true, 2, "t");  kk2 = new FieldModel(false,true,true,false, 2, "k");     gk2 = new FieldModel(false,true,false,true, 0, "g");
        sk3 = new FieldModel(true,true,false,true, 3, "t");  kk3 = new FieldModel(false,true,true,false, 3, "k");     gk3 = new FieldModel(false,true,false,true, 0, "g");
        sk4 = new FieldModel(true,true,false,true, 4, "t");  kk4 = new FieldModel(false,true,true,false, 4, "k");     gk4 = new FieldModel(false,true,false,true, 0, "g");
        sk5 = new FieldModel(true,true,false,true, 5, "t");  kk5 = new FieldModel(false,true,true,false, 5, "k");     gk5 = new FieldModel(false,true,false,true, 0, "g");
        sk6 = new FieldModel(true,true,false,true, 6, "t");  kk6 = new FieldModel(false,true,true,false, 6, "k");     gk6 = new FieldModel(false,true,false,true, 0, "g");
                                                             kk7 = new FieldModel(false,true,true,false, 0, "k");     gk7 = new FieldModel(false,true,false,true, 0, "g");
                                                             kk8 = new FieldModel(false,true,true,false, 0, "k");     gk8 = new FieldModel(false,true,false,true, 0, "g");
                                                             kk1 = new FieldModel(false,true,true,false, 0, "k");     gk9 = new FieldModel(false,true,false,true, 0, "g");
                                                             kk10 = new FieldModel(false,true,true,false, 0, "k");    gk10 = new FieldModel(false,true,false,true, 0, "g");
                                                             kk11 = new FieldModel(false,true,true,false, 0, "k");    gk11 = new FieldModel(false,true,false,true, 0, "g");
                                                             kk12 = new FieldModel(false,true,true,false, 0, "k");    gk12 = new FieldModel(false,true,false,true, 0, "g"); 
                                                             kk13 = new FieldModel(false,true,true,false, 0, "k");
                                                             kk14 = new FieldModel(false,true,true,false, 0, "k");
                                                             kk15 = new FieldModel(false,true,true,false, 0, "k");
                                                             kk16 = new FieldModel(false,true,true,false, 0, "k");
                                                             
                                                                
        //fügt zu list hinzu
        list.add(sk1);  list.add(kk1);  list.add(gk1);
        list.add(sk2);  list.add(kk2);  list.add(gk2);
        list.add(sk3);  list.add(kk3);  list.add(gk3);
        list.add(sk4);  list.add(kk4);  list.add(gk4);
        list.add(sk5);  list.add(kk5);  list.add(gk5);
        list.add(sk6);  list.add(kk6);  list.add(gk6);
                        list.add(kk7);  list.add(gk7);
                        list.add(kk8);  list.add(gk8);
                        list.add(kk9);  list.add(gk9);
                        list.add(kk10); list.add(gk10);
                        list.add(kk11); list.add(gk11);
                        list.add(kk12); list.add(gk12);
    
      //name              ID
        c1 = new CardModel(1);      c2 = new CardModel(2);      c3 = new CardModel(3);
        c4 = new CardModel(4);      c5 = new CardModel(5);      c6 = new CardModel(6);
        c7 = new CardModel(7);      c8 = new CardModel(8);      c9 = new CardModel(9);
        c10= new CardModel(10);     c11 = new CardModel(11);    c12 = new CardModel(12);
        c13 = new CardModel(13);    c14 = new CardModel(14);    c15 = new CardModel(15);
        c16 = new CardModel(16);    c17 = new CardModel(17);    c18 = new CardModel(18);
        c19 = new CardModel(19);    c20 = new CardModel(20);    c21 = new CardModel(21);
        c22 = new CardModel(22);    c23 = new CardModel(23);    c24 = new CardModel(24);
        
        //fügt zu liste hinzu
        cardList.add(c1);       cardList.add(c2);       cardList.add(c3);
        cardList.add(c4);       cardList.add(c5);       cardList.add(c6);
        cardList.add(c7);       cardList.add(c8);       cardList.add(c9);
        cardList.add(c10);      cardList.add(c11);      cardList.add(c12);
        cardList.add(c13);      cardList.add(c14);      cardList.add(c15);
        cardList.add(c16);      cardList.add(c17);      cardList.add(c18);
        cardList.add(c19);      cardList.add(c20);      cardList.add(c21);
        cardList.add(c22);      cardList.add(c23);      cardList.add(c24);

        //Karten werden zufällig auf dem Spielbrett verteilt
        randomList(list);
        
        launch();
    }
    
    //NewField ist die FeldKarte, die immer übrig bleibt.
    public static FieldModel getNewField(){
        return App.NewField;
    }
    
    public static void setNewField(FieldModel NF){
        App.NewField = NF;
    }
    
    
    public static void randomList(ArrayList<FieldModel> Flist){
        //Stellen mit festen Karten
        
        //X0 - y0 2 4 6
        //X2 - y0 2 4 6
        //X4 - y0 2 4 6
        //X6 - y0 2 4 6
        
        //Feste Karten werden in die passende Stelle eingefügt
        //            name        _init_        up  right down left  sI typ  -->   -------------------------------------- SAME -----------------------------------------
        field[0][0] = fkk_0_0 = new FieldModel(false,true,true,false, 1, "k");
        field[6][0] = fkk_6_0 = new FieldModel(false,false,true,true, 1, "k");
        field[0][6] = fkk_0_6 = new FieldModel(true,true,false,false, 1, "k");
        field[6][6] = fkk_6_6 = new FieldModel(true,false,false,true, 1, "k");
        field[2][0] = fsk_2_0 = new FieldModel(false,true,true,true, 7, "t");   
        field[4][0] = fsk_4_0 = new FieldModel(false,true,true,true, 8, "t");   
        field[0][2] = fsk_0_2 = new FieldModel(true,true,true,false, 9, "t");   
        field[2][2] = fsk_2_2 = new FieldModel(true,true,true,false, 10, "t");  
        field[4][2] = fsk_4_2 = new FieldModel(false,true,true,true, 11, "t");
        field[6][2] = fsk_6_2 = new FieldModel(true,false,true,true, 12, "t");
        field[0][4] = fsk_0_4 = new FieldModel(true,true,true,false, 13, "t");
        field[2][4] = fsk_2_4 = new FieldModel(true,true,false,true, 14, "t");
        field[4][4] = fsk_4_4 = new FieldModel(true,false,true,true, 15, "t");
        field[6][4] = fsk_6_4 = new FieldModel(true,false,true,true, 16, "t");
        field[2][6] = fsk_2_6 = new FieldModel(true,true,false,true, 17, "t");
        field[4][6] = fsk_4_6 = new FieldModel(true,true,false,true, 18, "t");

        //Werte für die for-each Schleife
        int X = 0;
        int Y = 0;
        boolean reserved = false;
        
         
        for(FieldModel F : Flist){
            //Zahl wird zufällig generiert
            int Min = 0;
            int Max = Flist.size() - 1;
            int random = Min + (int)(Math.random() * ((Max - Min) + 1));
            
            //Stellen für feste Karten werden reserviert
            if(X == 0 || X == 2 || X == 4 || X ==6){
               if(X == 0 || X == 2 || X == 4 || X ==6){
                   reserved = true;
                } 
            }
            
            //nicht reserverte Stellen werden gefüllt (mit der zufälligen Karte R)
            if(reserved == false){
                FieldModel R = Flist.get(random);
                field[X][Y] = R;
                Flist.remove(R);
            }       
            
            //die letzte Karte wird zur "neuen Karte", welche eingeschoben werden kann.
            if(X == 6 && Y == 6){
                NewField = F;
            }
            else{
                
                //Der nächste Wert wird ausgewählt
                if(X == 6){
                    X = 0;
                    Y += 1;
                }
                else{
                X += 1;
                }
            }
        } 
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
    
    public static void checkTileOri(FieldModel F){
        
        
    }
} 
    
