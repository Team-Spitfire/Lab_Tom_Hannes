package team_spitfire.lab_tom_hannes;

import java.io.File;
import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.stage.Stage;

import java.io.IOException;
import java.util.ArrayList;
import javafx.event.EventHandler;
import javafx.scene.image.Image;
import javafx.scene.input.KeyCode;
import javafx.scene.input.KeyEvent;

/**
 * JavaFX App
 */
public class App extends Application {

    private static Scene scene;
    public static ArrayList<FieldModel> list = new ArrayList<FieldModel>();
    private static ArrayList<CardModel> cardList = new ArrayList<CardModel>();
    public static FieldModel[][] field = new FieldModel[7][7];
    private static FieldModel NewField;
    
    public static boolean btnStatus1 = true;
    public static boolean btnStatus2 = true;
    public static boolean btnStatus3 = true;
    public static boolean btnStatus4 = true;
    public static boolean btnStatus5 = true;
    public static boolean btnStatus6 = true;
    public static boolean btnStatus7 = true;
    public static boolean btnStatus8 = true;
    public static boolean btnStatus9 = true;
    public static boolean btnStatus10 = true;
    public static boolean btnStatus11 = true;
    public static boolean btnStatus12 = true;
    
    public static boolean boundsUp;
    public static boolean boundsDown;
    public static boolean boundsRight;
    public static boolean boundsLeft;
   
    
    public static int curPlayer = 1;
    public static boolean insertedField = true;
    
    //   Deklarierung der Spieler            init         P x y
    public static PlayerModel redPlayer = new PlayerModel(0,0,0);
    public static PlayerModel yellowPlayer = new PlayerModel(0,6,0);
    public static PlayerModel greenPlayer = new PlayerModel(0,0,6);
    public static PlayerModel bluePlayer = new PlayerModel(0,6,6);
    
    //Files für die Bilder in FieldModel          "path"
    public static File file0 = new File("src/main/resources/tiles/black.png");
    public static File file13 = new File("src/main/resources/tiles/dragon.png");
    public static File file14 = new File("src/main/resources/tiles/ghost.png");
    public static File file15 = new File("src/main/resources/tiles/gnome.png");
    public static File file16 = new File("src/main/resources/tiles/poltergeist.png");
    public static File file17 = new File("src/main/resources/tiles/witch.png");
    public static File file18 = new File("src/main/resources/tiles/bat.png");
    public static File file19 = new File("src/main/resources/tiles/moth.png");
    public static File file20 = new File("src/main/resources/tiles/mouse.png");
    public static File file21 = new File("src/main/resources/tiles/owl.png");
    public static File file22 = new File("src/main/resources/tiles/salamander.png");
    public static File file23 = new File("src/main/resources/tiles/scarab.png");
    public static File file24 = new File("src/main/resources/tiles/spider.png");
    public static File fileK = new File("src/main/resources/tiles/turn.png");
    public static File fileG = new File("src/main/resources/tiles/straight.png");
    
    //Files für die Bilder in CardModel          "path"
    public static File Cfile1 = new File("src/main/resources/cards/black.png");
    public static File Cfile2 = new File("src/main/resources/cards/dragon.png");
    public static File Cfile3 = new File("src/main/resources/cards/dragon.png");
    public static File Cfile4 = new File("src/main/resources/cards/ghost.png");
    public static File Cfile5 = new File("src/main/resources/cards/gnome.png");
    public static File Cfile6 = new File("src/main/resources/cards/poltergeist.png");
    public static File Cfile7 = new File("src/main/resources/cards/witch.png");
    public static File Cfile8 = new File("src/main/resources/cards/bat.png");
    public static File Cfile9 = new File("src/main/resources/cards/moth.png");
    public static File Cfile10 = new File("src/main/resources/cards/mouse.png");
    public static File Cfile11 = new File("src/main/resources/cards/mouse.png");
    public static File Cfile12 = new File("src/main/resources/cards/mouse.png");
    public static File Cfile13 = new File("src/main/resources/cards/mouse.png");
    public static File Cfile14 = new File("src/main/resources/cards/mouse.png");
    public static File Cfile15 = new File("src/main/resources/cards/mouse.png");
    public static File Cfile16 = new File("src/main/resources/cards/mouse.png");
    public static File Cfile17 = new File("src/main/resources/cards/mouse.png");
    public static File Cfile18 = new File("src/main/resources/cards/mouse.png");
    public static File Cfile19 = new File("src/main/resources/cards/mouse.png");
    public static File Cfile20 = new File("src/main/resources/cards/mouse.png");
    public static File Cfile21 = new File("src/main/resources/cards/mouse.png");
    public static File Cfile22 = new File("src/main/resources/cards/mouse.png");
    public static File Cfile23 = new File("src/main/resources/cards/mouse.png");
    public static File Cfile24 = new File("src/main/resources/cards/mouse.png");
    
    

    

    //DEKLARIERUNG FieldModel (lose)
    private static FieldModel sk1;
    private static FieldModel kk1;
    private static FieldModel gk1;
    private static FieldModel sk2;
    private static FieldModel kk2;
    private static FieldModel gk2;
    private static FieldModel sk3;
    private static FieldModel kk3;
    private static FieldModel gk3;
    private static FieldModel sk4;
    private static FieldModel kk4;
    private static FieldModel gk4;
    private static FieldModel sk5;
    private static FieldModel kk5;
    private static FieldModel gk5;
    private static FieldModel sk6;
    private static FieldModel kk6;
    private static FieldModel gk6;
    private static FieldModel kk7;
    private static FieldModel gk7;
    private static FieldModel kk8;
    private static FieldModel gk8;
    private static FieldModel kk9;
    private static FieldModel gk9;
    private static FieldModel kk10;
    private static FieldModel gk10;
    private static FieldModel kk11;
    private static FieldModel gk11;
    private static FieldModel kk12;
    private static FieldModel gk12;
    private static FieldModel kk13;
    private static FieldModel gk13;
    private static FieldModel kk14;
    private static FieldModel kk15;
    private static FieldModel kk16;

    //DEKLARIERUNG CardModel
    private static CardModel c1;
    private static CardModel c2;
    private static CardModel c3;
    private static CardModel c4;
    private static CardModel c5;
    private static CardModel c6;
    private static CardModel c7;
    private static CardModel c8;
    private static CardModel c9;
    private static CardModel c10;
    private static CardModel c11;
    private static CardModel c12;
    private static CardModel c13;
    private static CardModel c14;
    private static CardModel c15;
    private static CardModel c16;
    private static CardModel c17;
    private static CardModel c18;
    private static CardModel c19;
    private static CardModel c20;
    private static CardModel c21;
    private static CardModel c22;
    private static CardModel c23;
    private static CardModel c24;

    @Override
    public void start(Stage stage) throws IOException {
        scene = new Scene(loadFXML("gameView"), 640, 480);
        scene.setOnKeyPressed(new EventHandler<KeyEvent> (){
            @Override
            public void handle(KeyEvent event) {
                if(event.getCode() == KeyCode.W){
                    GameViewController.KeyEventW();
                }   
            
                if(event.getCode() == KeyCode.S){
                    GameViewController.KeyEventS();
                }
                if(event.getCode() == KeyCode.A){
                    System.out.println("A");
                }
                if(event.getCode() == KeyCode.D){
                    System.out.println("D");
                }
            }
        });
        
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
        //name        _init_  up  right down left  sI      Bild          files siehe z. 31      rotation  -->   -------------------------------------- SAME -----------------------------------------                                  
        sk1 = new FieldModel(true, true, false, true, 13, new Image(file13.toURI().toString()), 0);         kk1 = new FieldModel(false, true, true, false, 19, new Image(file19.toURI().toString()), 0);   gk1 = new FieldModel(false, true, false, true, 0, new Image(fileG.toURI().toString()), 0);
        sk2 = new FieldModel(true, true, false, true, 14, new Image(file14.toURI().toString()), 0);         kk2 = new FieldModel(false, true, true, false, 20, new Image(file20.toURI().toString()), 0);   gk2 = new FieldModel(false, true, false, true, 0, new Image(fileG.toURI().toString()), 0);
        sk3 = new FieldModel(true, true, false, true, 15, new Image(file15.toURI().toString()), 0);         kk3 = new FieldModel(false, true, true, false, 21, new Image(file21.toURI().toString()), 0);   gk3 = new FieldModel(false, true, false, true, 0, new Image(fileG.toURI().toString()), 0);
        sk4 = new FieldModel(true, true, false, true, 16, new Image(file16.toURI().toString()), 0);         kk4 = new FieldModel(false, true, true, false, 22, new Image(file22.toURI().toString()), 0);   gk4 = new FieldModel(false, true, false, true, 0, new Image(fileG.toURI().toString()), 0);
        sk5 = new FieldModel(true, true, false, true, 17, new Image(file17.toURI().toString()), 0);         kk5 = new FieldModel(false, true, true, false, 23, new Image(file23.toURI().toString()), 0);   gk5 = new FieldModel(false, true, false, true, 0, new Image(fileG.toURI().toString()), 0);
        sk6 = new FieldModel(true, true, false, true, 18, new Image(file18.toURI().toString()), 0);         kk6 = new FieldModel(false, true, true, false, 24, new Image(file24.toURI().toString()), 0);   gk6 = new FieldModel(false, true, false, true, 0, new Image(fileG.toURI().toString()), 0);
                                                                                                            kk7 = new FieldModel(false, true, true, false, 0, new Image(fileK.toURI().toString()), 0);     gk7 = new FieldModel(false, true, false, true, 0, new Image(fileG.toURI().toString()), 0);
                                                                                                            kk8 = new FieldModel(false, true, true, false, 0, new Image(fileK.toURI().toString()), 0);     gk8 = new FieldModel(false, true, false, true, 0, new Image(fileG.toURI().toString()), 0);
                                                                                                            kk1 = new FieldModel(false, true, true, false, 0, new Image(fileK.toURI().toString()), 0);     gk9 = new FieldModel(false, true, false, true, 0, new Image(fileG.toURI().toString()), 0);
                                                                                                            kk10 = new FieldModel(false, true, true, false, 0, new Image(fileK.toURI().toString()), 0);    gk10 = new FieldModel(false, true, false, true, 0, new Image(fileG.toURI().toString()), 0);
                                                                                                            kk11 = new FieldModel(false, true, true, false, 0, new Image(fileK.toURI().toString()), 0);    gk11 = new FieldModel(false, true, false, true, 0, new Image(fileG.toURI().toString()), 0);
                                                                                                            kk12 = new FieldModel(false, true, true, false, 0, new Image(fileK.toURI().toString()), 0);    gk12 = new FieldModel(false, true, false, true, 0, new Image(fileG.toURI().toString()), 0);
                                                                                                            kk13 = new FieldModel(false, true, true, false, 0, new Image(fileK.toURI().toString()), 0);    gk13 = new FieldModel(false, true, false, true, 0, new Image(fileG.toURI().toString()), 0);
                                                                                                            kk14 = new FieldModel(false, true, true, false, 0, new Image(fileK.toURI().toString()), 0);
                                                                                                            kk15 = new FieldModel(false, true, true, false, 0, new Image(fileK.toURI().toString()), 0);
                                                                                                            kk16 = new FieldModel(false, true, true, false, 0, new Image(fileK.toURI().toString()), 0);
        
        //fügt zu list hinzu
        list.add(sk1);
        list.add(kk1);
        list.add(gk1);
        list.add(sk2);
        list.add(kk2);
        list.add(gk2);
        list.add(sk3);
        list.add(kk3);
        list.add(gk3);
        list.add(sk4);
        list.add(kk4);
        list.add(gk4);
        list.add(sk5);
        list.add(kk5);
        list.add(gk5);
        list.add(sk6);
        list.add(kk6);
        list.add(gk6);
        list.add(kk7);
        list.add(gk7);
        list.add(kk8);
        list.add(gk8);
        list.add(kk9);
        list.add(gk9);
        list.add(kk10);
        list.add(gk10);
        list.add(kk11);
        list.add(gk11);
        list.add(kk12);
        list.add(gk12);
        list.add(gk13);
        list.add(kk13);
        list.add(kk14);
        list.add(kk15);
        list.add(kk16);


        //name             ID
        c1 = new CardModel(1, new Image(Cfile1.toURI().toString()));
        c2 = new CardModel(2, new Image(Cfile2.toURI().toString()));
        c3 = new CardModel(3, new Image(Cfile3.toURI().toString()));
        c4 = new CardModel(4, new Image(Cfile4.toURI().toString()));
        c5 = new CardModel(5, new Image(Cfile5.toURI().toString()));
        c6 = new CardModel(6, new Image(Cfile6.toURI().toString()));
        c7 = new CardModel(7, new Image(Cfile7.toURI().toString()));
        c8 = new CardModel(8, new Image(Cfile8.toURI().toString()));
        c9 = new CardModel(9, new Image(Cfile9.toURI().toString()));
        c10 = new CardModel(10, new Image(Cfile10.toURI().toString()));
        c11 = new CardModel(11, new Image(Cfile11.toURI().toString()));
        c12 = new CardModel(12, new Image(Cfile12.toURI().toString()));
        c13 = new CardModel(13, new Image(Cfile13.toURI().toString()));
        c14 = new CardModel(14, new Image(Cfile14.toURI().toString()));
        c15 = new CardModel(15, new Image(Cfile15.toURI().toString()));
        c16 = new CardModel(16, new Image(Cfile16.toURI().toString()));
        c17 = new CardModel(17, new Image(Cfile17.toURI().toString()));
        c18 = new CardModel(18, new Image(Cfile18.toURI().toString()));
        c19 = new CardModel(19, new Image(Cfile19.toURI().toString()));
        c20 = new CardModel(20, new Image(Cfile20.toURI().toString()));
        c21 = new CardModel(21, new Image(Cfile21.toURI().toString()));
        c22 = new CardModel(22, new Image(Cfile22.toURI().toString()));
        c23 = new CardModel(23, new Image(Cfile23.toURI().toString()));
        c24 = new CardModel(24, new Image(Cfile24.toURI().toString()));

        //fügt zu liste hinzu
        cardList.add(c1);
        cardList.add(c2);
        cardList.add(c3);
        cardList.add(c4);
        cardList.add(c5);
        cardList.add(c6);
        cardList.add(c7);
        cardList.add(c8);
        cardList.add(c9);
        cardList.add(c10);
        cardList.add(c11);
        cardList.add(c12);
        cardList.add(c13);
        cardList.add(c14);
        cardList.add(c15);
        cardList.add(c16);
        cardList.add(c17);
        cardList.add(c18);
        cardList.add(c19);
        cardList.add(c20);
        cardList.add(c21);
        cardList.add(c22);
        cardList.add(c23);
        cardList.add(c24);

        //Karten werden zufällig auf dem Spielbrett verteilt
        randomList();
        
        randomCard();
        
        //int X = 0;
        //int Y = 0;
        
        //boolean done = false;
        //while(done == false) {
            
            //System.out.println("X" + String.valueOf(X) + " " + "Y" + String.valueOf(Y));
            //System.out.println(field[X][Y]);
            

            //die letzte Karte wird zur "neuen Karte", welche eingeschoben werden kann.
            //if (X == 6 && Y == 6) {
               // done = true;
            //} else {

                //Der nächste Wert wird ausgewählt
            //    if (X == 6) {
                    //X = 0;
                    //Y += 1;
                //} else {
                    //X += 1;
                //}
            //}
        //}

        launch();
    }

    //NewField ist die FeldKarte, die immer übrig bleibt.
    public static FieldModel getNewField() {
        return App.NewField;
    }

    public static void setNewField(FieldModel NF) {
        App.NewField = NF;
    }

    public static void randomCard(){
        boolean done = false;
        int R = 4;
        int Y = 4;
        int G = 4;
        int B = 4;
        
        ArrayList<CardModel> handRed = new ArrayList<CardModel> ();
        ArrayList<CardModel> handYellow = new ArrayList<CardModel> ();
        ArrayList<CardModel> handGreen = new ArrayList<CardModel> ();
        ArrayList<CardModel> handBlue = new ArrayList<CardModel> ();
        
        while(R >= 0){
            int Min = 0;
            int Max = cardList.size() - 1;
            int random = Min + (int) (Math.random() * ((Max - Min) + 1));
            
            handRed.add(cardList.get(random));
            
            R -= 1;
        }
        
        while(Y >= 0){
            int Min = 0;
            int Max = cardList.size() - 1;
            int random = Min + (int) (Math.random() * ((Max - Min) + 1));
            
            handYellow.add(cardList.get(random));
            
            Y -= 1;
        }
        
        while(G >= 0){
            int Min = 0;
            int Max = cardList.size() - 1;
            int random = Min + (int) (Math.random() * ((Max - Min) + 1));
            
            handGreen.add(cardList.get(random));
            
            G  -= 1;
        }
        
        while(B >= 0){
            int Min = 0;
            int Max = cardList.size() - 1;
            int random = Min + (int) (Math.random() * ((Max - Min) + 1));
            
            handBlue.add(cardList.get(random));
            
            B -= 1;
        }
        
        redPlayer.setHand(handRed);
        yellowPlayer.setHand(handYellow);
        greenPlayer.setHand(handGreen);
        bluePlayer.setHand(handBlue);

    }
    
    
    public static void randomList() {
        //Stellen mit festen Karten

        //X0 - y0 2 4 6
        //X2 - y0 2 4 6
        //X4 - y0 2 4 6
        //X6 - y0 2 4 6
        //Feste Karten werden in die passende Stelle eingefügt
        //  name        _init_        up  right down left      sI png  -->   -------------------------------------- SAME -----------------------------------------
        field[0][0] = new FieldModel(false, true, true, false, 0, new Image(file0.toURI().toString()), 0);//red
        field[6][0] = new FieldModel(false, false, true, true, 0, new Image(file0.toURI().toString()), 0);//yellow
        field[0][6] = new FieldModel(true, true, false, false, 0, new Image(file0.toURI().toString()), 0);//green
        field[6][6] = new FieldModel(true, false, false, true, 0, new Image(file0.toURI().toString()), 0);//blue
        field[2][0] = new FieldModel(false, true, true, true, 1, new Image(file0.toURI().toString()), 0);
        field[4][0] = new FieldModel(false, true, true, true, 2, new Image(file0.toURI().toString()), 0);
        field[0][2] = new FieldModel(true, true, true, false, 3, new Image(file0.toURI().toString()), 0);
        field[2][2] = new FieldModel(true, true, true, false, 4, new Image(file0.toURI().toString()), 0);
        field[4][2] = new FieldModel(false, true, true, true, 5, new Image(file0.toURI().toString()), 0);
        field[6][2] = new FieldModel(true, false, true, true, 6, new Image(file0.toURI().toString()), 0);
        field[0][4] = new FieldModel(true, true, true, false, 7, new Image(file0.toURI().toString()), 0);
        field[2][4] = new FieldModel(true, true, false, true, 8, new Image(file0.toURI().toString()), 0);
        field[4][4] = new FieldModel(true, false, true, true, 9, new Image(file0.toURI().toString()), 0);
        field[6][4] = new FieldModel(true, false, true, true, 10, new Image(file0.toURI().toString()), 0);
        field[2][6] = new FieldModel(true, true, false, true, 11, new Image(file0.toURI().toString()), 0);
        field[4][6] = new FieldModel(true, true, false, true, 12, new Image(file0.toURI().toString()), 0);

        //Werte für die for-each Schleife
        int X = 0;
        int Y = 0;
        boolean reserved = false;
        boolean done = false;

        while(done == false) {
            reserved = false;
            
            //Zahl wird zufällig generiert
            int Min = 0;
            int Max = list.size() - 1;
            int random = Min + (int) (Math.random() * ((Max - Min) + 1));

            //Stellen für feste Karten werden reserviert
            if(X == 0 ||X == 2 || X == 4 || X == 6){
                if(Y == 0 ||Y == 2 || Y == 4 || Y == 6){
                    //System.out.println("reserved");
                    reserved = true;
                }
            }

            //nicht reserverte Stellen werden gefüllt (mit der zufälligen Karte R)
            if (reserved == false) {
                //System.out.println(list.size());
                FieldModel R = list.get(random);
                field[X][Y] = R;
                list.remove(R);
            }

            //die letzte Karte wird zur "neuen Karte", welche eingeschoben werden kann.
            if (X == 6 && Y == 6) {
                //Fix start
                boolean fixed = false;
                int fX = 0;
                int fY = 0;
                
                while(fixed == false){
                    
                    if(field[fX][fY] == null){
                        field[fX][fY] = list.get(0);
                        list.remove(0);
                        fixed = true;
                    }
                    
                    
                    //
                    if (fX == 6) {
                    fX = 0;
                    fY += 1;
                    } 
                    else {
                    fX += 1;
                    }
                }
                //Fix ende
                
                NewField = list.get(0);
                list.remove(0);
                //System.out.println(NewField);
                //System.out.println(list.size());
                done = true;
            } 
            else {

                //Der nächste Wert wird ausgewählt
                if (X == 6) {
                    X = 0;
                    Y += 1;
                } else {
                    X += 1;
                }
            }
        }
    }

    //Schiebt ein neues Feld in eine Zeile ein.
    public static void InsertX(int Zeile, boolean LinksNachRechts, FieldModel NeuesFeld) {
        //Alte Werte werden gespeichert, damit sie nicht ungewollt übetschrieben werden.
        FieldModel A0 = field[Zeile][0];
        FieldModel A1 = field[Zeile][1];
        FieldModel A2 = field[Zeile][2];
        FieldModel A3 = field[Zeile][3];
        FieldModel A4 = field[Zeile][4];
        FieldModel A5 = field[Zeile][5];
        FieldModel A6 = field[Zeile][6];

        //if abfrage wird für die Richtung des einschiebens benötigt.
        if (LinksNachRechts == true) {
            field[Zeile][0] = NeuesFeld;
            field[Zeile][1] = A0;
            field[Zeile][2] = A1;
            field[Zeile][3] = A2;
            field[Zeile][4] = A3;
            field[Zeile][5] = A4;
            field[Zeile][6] = A5;

            App.setNewField(A6);
        }

        if (LinksNachRechts == false) {
            field[Zeile][6] = NeuesFeld;
            field[Zeile][5] = A6;
            field[Zeile][4] = A5;
            field[Zeile][3] = A4;
            field[Zeile][2] = A3;
            field[Zeile][1] = A2;
            field[Zeile][0] = A1;

            App.setNewField(A0);
        }
    }

    //Schiebt ein neues Feld in eine Spalte ein.
    public static void InsertY(int Spalte, boolean ObenNachUnten, FieldModel NeuesFeld) {
        //Alte Werte werden gespeichert, damit sie nicht ungewollt übetschrieben werden.
        FieldModel A0 = field[0][Spalte];
        FieldModel A1 = field[1][Spalte];
        FieldModel A2 = field[2][Spalte];
        FieldModel A3 = field[3][Spalte];
        FieldModel A4 = field[4][Spalte];
        FieldModel A5 = field[5][Spalte];
        FieldModel A6 = field[6][Spalte];

        //if abfrage wird für die Richtung des einschiebens benötigt.
        if (ObenNachUnten == true) {
            field[0][Spalte] = NeuesFeld;
            field[1][Spalte] = A0;
            field[2][Spalte] = A1;
            field[3][Spalte] = A2;
            field[4][Spalte] = A3;
            field[5][Spalte] = A4;
            field[6][Spalte] = A5;

            App.setNewField(A6);
        }

        if (ObenNachUnten == false) {
            field[6][Spalte] = NeuesFeld;
            field[5][Spalte] = A6;
            field[4][Spalte] = A5;
            field[3][Spalte] = A4;
            field[2][Spalte] = A3;
            field[1][Spalte] = A2;
            field[0][Spalte] = A1;

            App.setNewField(A0);
        }
    }

    //-------------Pfeile Start-------------
    //InsertX/Y wurden oben deklariert, aber es gibt nur ein paar Stellen, an den man etwas einschieben kann.
    //Die folgenden Methoten sind für diese Stellen zuständing
    //(in der View gibt es Pfeile zum einschieben, welche hierdurch funktional gemacht werden)
    //Bei der Zählung von X und Y wurde bedacht, dass es bei 0 anfängt.
    //Links nach Rechts
    public static void PfeilX1Links(FieldModel F) {
        InsertX(1, true, F);
    }

    public static void PfeilX3Links(FieldModel F) {
        InsertX(3, true, F);
    }

    public static void PfeilX5Links(FieldModel F) {
        InsertX(5, true, F);
    }

    //Rechts nach Links
    public static void PfeilX1Rechts(FieldModel F) {
        InsertX(1, false, F);
    }

    public static void PfeilX3Rechts(FieldModel F) {
        InsertX(3, false, F);
    }

    public static void PfeilX5Rechts(FieldModel F) {
        InsertX(5, false, F);
    }

    //Oben nach Unten
    public static void PfeilY1Oben(FieldModel F) {
        InsertY(1, true, F);
    }

    public static void PfeilY3Oben(FieldModel F) {
        InsertY(3, true, F);
    }

    public static void PfeilY5Oben(FieldModel F) {
        InsertY(5, true, F);
    }

    //Unten nach Oben
    public static void PfeilY1Unten(FieldModel F) {
        InsertY(1, false, F);
    }

    public static void PfeilY3Unten(FieldModel F) {
        InsertY(3, false, F);
    }

    public static void PfeilY5Unten(FieldModel F) {
        InsertY(5, false, F);
    }

    //-------------Pfeile Ende-------------


    
    
}
