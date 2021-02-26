/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package team_spitfire.lab_tom_hannes;

import java.io.File;
import java.io.IOException;
import java.net.URL;
import java.util.ArrayList;
import java.util.ResourceBundle;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.image.Image;
import javafx.scene.image.ImageView;
import javafx.scene.input.KeyEvent;

/**
 * FXML Controller class
 *
 * @author hanne
 */
public class GameViewController implements Initializable {

    @FXML
    private ImageView iv1_2;
    @FXML
    private ImageView iv1_4;
    @FXML
    private ImageView iv1_5;
    @FXML
    private ImageView iv2_1;
    @FXML
    private ImageView iv2_3;
    @FXML
    private ImageView iv2_5;
    @FXML
    private ImageView iv3_2;
    @FXML
    private ImageView iv3_4;
    @FXML
    private ImageView iv3_6;
    @FXML
    private ImageView iv4_1;
    @FXML
    private ImageView iv4_3;
    @FXML
    private ImageView iv4_5;
    @FXML
    private ImageView iv5_2;
    @FXML
    private ImageView iv5_4;
    @FXML
    private ImageView iv5_6;
    @FXML
    private ImageView iv6_1;
    @FXML
    private ImageView iv6_3;
    @FXML
    private ImageView iv6_5;
    @FXML
    private ImageView iv0_1;
    @FXML
    private ImageView iv0_3;
    @FXML
    private ImageView iv0_5;
    @FXML
    private ImageView iv1_0;
    @FXML
    private ImageView iv1_1;
    @FXML
    private ImageView iv1_3;
    @FXML
    private ImageView iv1_6;
    @FXML
    private ImageView iv3_0;
    @FXML
    private ImageView iv3_1;
    @FXML
    private ImageView iv3_3;
    @FXML
    private ImageView iv3_5;
    @FXML
    private ImageView iv5_0;
    @FXML
    private ImageView iv5_1;
    @FXML
    private ImageView iv5_3;
    @FXML
    private ImageView iv5_5;
    @FXML
    private ImageView ivNewField;
    @FXML
    private ImageView ivRedPlayer;
    @FXML
    private ImageView ivYellowPlayer;
    @FXML
    private ImageView ivBluePlayer;
    @FXML
    private ImageView ivGreenPlayer;

    private static ArrayList<ImageView> imageviews;
    private static ArrayList<FieldModel> tempList;

    private static int curPlayer;
    private static PlayerModel cPlayer;
    private static ImageView cPlayerView;

    private static boolean boundsUp;
    private static boolean boundsDown;
    private static boolean boundsRight;
    private static boolean boundsLeft;
    
    private static Image black;
    /**
     * Initializes the controller class.
     */
    @Override
    public void initialize(URL url, ResourceBundle rb) {

        imageviews = new ArrayList<ImageView>();
        tempList = new ArrayList<FieldModel> ();

        loadImages();
        checkCPlayer();
        checkBounds();
    }

    @FXML
    private void btnTurnRight(ActionEvent event) throws IOException {
        App.getNewField().turnRight();
        ivNewField.setRotate(+45);
        App.setRoot("gameView");
    }

    @FXML
    private void btnTurnLeft(ActionEvent event) throws IOException {
        App.getNewField().turnRight();
        ivNewField.setRotate(-45);
        App.setRoot("gameView");
    }

    @FXML
    private void btn10insU(ActionEvent event) throws IOException {
        App.PfeilY1Oben(App.getNewField());
        App.setRoot("gameView");
    }

    @FXML
    private void btn30insU(ActionEvent event) throws IOException {
        App.PfeilY3Oben(App.getNewField());
        App.setRoot("gameView");
    }

    @FXML
    private void btn50insU(ActionEvent event) throws IOException {
        App.PfeilY5Oben(App.getNewField());
        App.setRoot("gameView");
    }

    @FXML
    private void btn61insR(ActionEvent event) throws IOException {
        App.PfeilX1Rechts(App.getNewField());
        App.setRoot("gameView");
    }

    @FXML
    private void btn63insR(ActionEvent event) throws IOException {
        App.PfeilX3Rechts(App.getNewField());
        App.setRoot("gameView");
    }

    @FXML
    private void btn65insR(ActionEvent event) throws IOException {
        App.PfeilX5Rechts(App.getNewField());
        App.setRoot("gameView");
    }

    @FXML
    private void btn56insD(ActionEvent event) throws IOException {
        App.PfeilY5Unten(App.getNewField());
        App.setRoot("gameView");
    }

    @FXML
    private void btn36insD(ActionEvent event) throws IOException {
        App.PfeilY3Unten(App.getNewField());
        App.setRoot("gameView");
    }

    @FXML
    private void btn16insD(ActionEvent event) throws IOException {
        App.PfeilY1Unten(App.getNewField());
        App.setRoot("gameView");
    }

    @FXML
    private void btn01insL(ActionEvent event) throws IOException {
        App.PfeilX1Links(App.getNewField());
        App.setRoot("gameView");
    }

    @FXML
    private void btn03insL(ActionEvent event) throws IOException {
        App.PfeilX3Links(App.getNewField());
        App.setRoot("gameView");
    }

    @FXML
    private void btn05insL(ActionEvent event) throws IOException {
        App.PfeilX5Links(App.getNewField());
        App.setRoot("gameView");
    }

    @FXML
    private void btnEndTurn(ActionEvent event) {
        curPlayer = curPlayer + 1;
        if (curPlayer == 4) {
            curPlayer = 1;
        }
    }

    @FXML
    void keyPressed(KeyEvent event) throws IOException {
        switch (event.getCode()) {
            case W:
                

                // welcher Spieler ist dran, in alle richtugen offen ist 
                // versetz das Bild und die position des Spieler auf dem Grid
                cPlayerView.setY(cPlayerView.getY() - 16);
                cPlayer.setPosY(cPlayer.getPosY() - 1);
                boundsUp = false;
                
                App.setRoot("gameview");
                
                break;
            case S:
                

                cPlayerView.setY(cPlayerView.getY() + 16);
                cPlayer.setPosY(cPlayer.getPosY() + 1);
                boundsUp = false;
                
                App.setRoot("gameview");

                break;
            case A:
                
                cPlayerView.setX(cPlayerView.getX() - 16);
                cPlayer.setPosX(cPlayer.getPosX() - 1);
                boundsUp = false;
                
                App.setRoot("gameview");
                
                break;
            case D:
                

                cPlayerView.setX(cPlayerView.getX() + 16);
                cPlayer.setPosX(cPlayer.getPosX() + 1);
                boundsUp = false;
                
                App.setRoot("gameview");
                
                break;
            default:
                break;
        }
    }

    public void checkCPlayer() {

        switch (curPlayer) {
            case 1:
                cPlayer = App.redPlayer;
                cPlayerView = ivRedPlayer;
                break;
            case 2:
                cPlayer = App.yellowPlayer;
                cPlayerView = ivYellowPlayer;
                break;
            case 3:
                cPlayer = App.greenPlayer;
                cPlayerView = ivGreenPlayer;
                break;
            case 4:
                cPlayer = App.bluePlayer;
                cPlayerView = ivBluePlayer;
                break;
            default:
                break;
        }

    }

    
    
    public void checkBounds() {

        int x = cPlayer.getPosX();
        int y = cPlayer.getPosY();

        //Alle Fieldmodels die den Spieler Umgeben
        FieldModel c = App.field[x][y];
        FieldModel d = App.field[x - 1][y];
        FieldModel u = App.field[x + 1][y];
        FieldModel l = App.field[x][y - 1];
        FieldModel r = App.field[x][y + 1];

        //Alle Booleans des Feldes wo der Spieler sich drauf befindet
        boolean cu = c.isUp();
        boolean cd = c.isDown();
        boolean cl = c.isLeft();
        boolean cr = c.isRight();

        //Alle Booleans der umgebenden Felder
        boolean ud = u.isDown();
        boolean du = d.isUp();
        boolean lr = l.isRight();
        boolean rl = r.isLeft();

        //guckt ob die Übergänge offen sind
        if (cu && ud == true) {
            boundsUp = true;
        } else if (cd && du == true) {
            boundsDown = true;
        } else if (cl && lr == true) {
            boundsLeft = true;
        } else if (cr && rl == true) {
            boundsRight = true;
        }
    }

    public void loadImages(){
        tempList.clear();
        imageviews.clear();
        
        imageviews.add(iv0_1);
        imageviews.add(iv0_3);
        imageviews.add(iv0_5);
        imageviews.add(iv1_0);
        imageviews.add(iv1_1);
        imageviews.add(iv1_2);
        imageviews.add(iv1_3);
        imageviews.add(iv1_4);
        imageviews.add(iv1_5);
        imageviews.add(iv1_6);
        imageviews.add(iv2_1);
        imageviews.add(iv2_3);
        imageviews.add(iv2_5);
        imageviews.add(iv3_0);
        imageviews.add(iv3_1);
        imageviews.add(iv3_2);
        imageviews.add(iv3_3);
        imageviews.add(iv3_4);
        imageviews.add(iv3_5);
        imageviews.add(iv3_6);
        imageviews.add(iv4_1);
        imageviews.add(iv4_3);
        imageviews.add(iv4_5);
        imageviews.add(iv5_0);
        imageviews.add(iv5_1);
        imageviews.add(iv5_2);
        imageviews.add(iv5_3);
        imageviews.add(iv5_4);
        imageviews.add(iv5_5);
        imageviews.add(iv5_6);
        imageviews.add(iv6_1);
        imageviews.add(iv6_3);
        imageviews.add(iv6_5);
        imageviews.add(ivNewField);   

        FieldModel F0_1 = App.field[0][1];
        FieldModel F0_3 = App.field[0][3];
        FieldModel F0_5 = App.field[0][5];
        FieldModel F1_0 = App.field[1][0];
        FieldModel F1_1 = App.field[1][1];
        FieldModel F1_2 = App.field[1][2];
        FieldModel F1_3 = App.field[1][3];
        FieldModel F1_4 = App.field[1][4];
        FieldModel F1_5 = App.field[1][5];
        FieldModel F1_6 = App.field[1][6];
        FieldModel F2_1 = App.field[2][1];
        FieldModel F2_3 = App.field[2][3];
        FieldModel F2_5 = App.field[2][5];
        FieldModel F3_0 = App.field[3][0];
        FieldModel F3_1 = App.field[3][1];
        FieldModel F3_2 = App.field[3][2];
        FieldModel F3_3 = App.field[3][3];
        FieldModel F3_4 = App.field[3][4];
        FieldModel F3_5 = App.field[3][5];
        FieldModel F3_6 = App.field[3][6];
        FieldModel F4_1 = App.field[4][1];
        FieldModel F4_3 = App.field[4][3];
        FieldModel F4_5 = App.field[4][5];
        FieldModel F5_0 = App.field[5][0];
        FieldModel F5_1 = App.field[5][1];
        FieldModel F5_2 = App.field[5][2];
        FieldModel F5_3 = App.field[5][3];
        FieldModel F5_4 = App.field[5][4];
        FieldModel F5_5 = App.field[5][5];
        FieldModel F5_6 = App.field[5][6];
        FieldModel F6_1 = App.field[6][1];
        FieldModel F6_3 = App.field[6][3];
        FieldModel F6_5 = App.field[6][5];
        FieldModel FNewField = App.getNewField();
        
        tempList.add(F0_1);
        tempList.add(F0_3);
        tempList.add(F0_5);
        tempList.add(F1_0);
        tempList.add(F1_1);
        tempList.add(F1_2);
        tempList.add(F1_3);
        tempList.add(F1_4);
        tempList.add(F1_5);
        tempList.add(F1_6);
        tempList.add(F2_1);
        tempList.add(F2_3);
        tempList.add(F2_5);
        tempList.add(F3_0);
        tempList.add(F3_1);
        tempList.add(F3_2);
        tempList.add(F3_3);
        tempList.add(F3_4);
        tempList.add(F3_5);
        tempList.add(F3_6);
        tempList.add(F4_1);
        tempList.add(F4_3);
        tempList.add(F4_5);
        tempList.add(F5_0);
        tempList.add(F5_1);
        tempList.add(F5_2);
        tempList.add(F5_3);
        tempList.add(F5_4);
        tempList.add(F5_5);
        tempList.add(F5_6);
        tempList.add(F6_1);
        tempList.add(F6_3);
        tempList.add(F6_5);
        tempList.add(FNewField);
        
        
        for(ImageView I : imageviews) {
            I.setImage(tempList.get(0).getImg());
            I.setRotate(tempList.get(0).getRotation());
            
            tempList.remove(0);
        }
    }
}
        
