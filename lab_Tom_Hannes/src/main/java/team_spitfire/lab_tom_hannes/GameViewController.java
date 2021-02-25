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
    private static ArrayList<Image> images;
    private static ArrayList<Integer> rotations;

    private static int curPlayer;
    private static PlayerModel cPlayer;
    
    private static boolean boundsUp;
    private static boolean boundsDown;
    private static boolean boundsRight;
    private static boolean boundsLeft;
    
    

    /**
     * Initializes the controller class.
     */
    @Override
    public void initialize(URL url, ResourceBundle rb) {
        
        imageviews = new ArrayList<ImageView> ();
        images = new ArrayList<Image> ();
        rotations = new ArrayList<Integer> ();
        addToList();
        //checkTileOri();
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
        if(curPlayer == 4){
            curPlayer = 1;
        }
    }
    
    void keyPressed(KeyEvent event) throws IOException {
        switch (event.getCode()) {
            case W:
                checkBounds();
                // welcher Spieler ist dran, in alle richtugen offen ist 
                // versetz das Bild und die position des Spieler auf dem Grid
                if(curPlayer == 1 && boundsUp == true){
                ivRedPlayer.setY(ivRedPlayer.getY() - 16);
                App.redPlayer.setPosY(App.redPlayer.getPosY() - 1);
                boundsUp = false;
                }
                if(curPlayer == 2 && boundsUp == true){
                ivYellowPlayer.setY(ivYellowPlayer.getY() - 16);
                App.yellowPlayer.setPosY(App.yellowPlayer.getPosY() - 1);
                boundsUp = false;
                }
                if(curPlayer == 3 && boundsUp == true){
                ivGreenPlayer.setY(ivGreenPlayer.getY() - 16);
                App.greenPlayer.setPosY(App.greenPlayer.getPosY() - 1);
                boundsUp = false;
                }
                if(curPlayer == 4 && boundsUp == true){
                ivBluePlayer.setY(ivBluePlayer.getY() - 16);
                App.bluePlayer.setPosY(App.bluePlayer.getPosY() - 1);
                boundsUp = false;
                }

                break;
            case S:
                checkBounds();
                if(curPlayer == 1 && boundsDown == true){
                ivRedPlayer.setY(ivRedPlayer.getY() + 16);
                App.redPlayer.setPosY(App.redPlayer.getPosY() + 1);
                boundsDown = false;
                }
                if(curPlayer == 2 && boundsDown == true){
                ivYellowPlayer.setY(ivYellowPlayer.getY() + 16);
                App.yellowPlayer.setPosY(App.yellowPlayer.getPosY() + 1);
                boundsDown = false;
                }
                if(curPlayer == 3 && boundsDown == true){
                ivGreenPlayer.setY(ivGreenPlayer.getY() + 16);
                App.greenPlayer.setPosY(App.greenPlayer.getPosY() + 1);
                boundsDown = false;
                }
                if(curPlayer == 4 && boundsDown == true){
                ivBluePlayer.setY(ivBluePlayer.getY() + 16);
                App.bluePlayer.setPosY(App.bluePlayer.getPosY() + 1);
                boundsDown = false;
                }
                
                break;
            case A:
                checkBounds();
                if(curPlayer == 1 && boundsLeft == true){
                ivRedPlayer.setX(ivRedPlayer.getX() - 16);
                App.redPlayer.setPosX(App.redPlayer.getPosX() - 1);
                boundsLeft = false;
                }
                else if(curPlayer == 2 && boundsLeft == true){
                ivYellowPlayer.setX(ivYellowPlayer.getY() - 16);
                App.yellowPlayer.setPosX(App.yellowPlayer.getPosX() - 1);
                boundsLeft = false;
                }
                else if(curPlayer == 3 && boundsLeft == true){
                ivGreenPlayer.setX(ivGreenPlayer.getX() - 16);
                App.greenPlayer.setPosX(App.greenPlayer.getPosX() - 1);
                boundsLeft = false;
                }
                else if(curPlayer == 4 && boundsLeft == true){
                ivBluePlayer.setX(ivBluePlayer.getX() - 16);
                App.bluePlayer.setPosX(App.bluePlayer.getPosX() - 1);
                boundsLeft = false;
                }
                break;
            case D:
                checkBounds();
                if(curPlayer == 1 && boundsRight == true){
                ivRedPlayer.setX(ivRedPlayer.getX() + 16);
                App.redPlayer.setPosX(App.redPlayer.getPosX() + 1);
                boundsRight = false;
                }
                else if(curPlayer == 2 && boundsRight == true){
                ivYellowPlayer.setX(ivRedPlayer.getY() + 16);
                App.yellowPlayer.setPosX(App.yellowPlayer.getPosX() + 1);
                boundsRight = false;
                }
                else if(curPlayer == 3 && boundsRight == true){
                ivGreenPlayer.setX(ivRedPlayer.getX() + 16);
                App.greenPlayer.setPosX(App.greenPlayer.getPosX() + 1);
                boundsRight = false;
                }
                else if(curPlayer == 4 && boundsRight == true){
                ivBluePlayer.setX(ivRedPlayer.getX() + 16);
                App.bluePlayer.setPosX(App.bluePlayer.getPosX() + 1);
                boundsRight = false;
                }
                break;

            default:
                break;
        }
    }

    public void checkBounds(){
        
        if(curPlayer == 1){
            cPlayer = App.redPlayer;
        }
        else if(curPlayer == 2){
            cPlayer = App.yellowPlayer;
        }
        else if(curPlayer == 3){
            cPlayer = App.greenPlayer;
        }
        else if(curPlayer == 4){
            cPlayer = App.bluePlayer;
        }
        
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
        if(cu && ud == true){
            boundsUp = true;
        }
        else if(cd && du == true){
            boundsDown = true;
        }
        else if(cl && lr == true){
            boundsLeft = true;
        }
        else if(cr && rl == true){
            boundsRight = true;
        }
        
        
    }
    
    public void addToList(){
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
    }
    
    /* 
    public void checkTileOri() {
        int X = 0;
        int Y = 0;
        boolean exit = false;

        while(exit == false){
            FieldModel F = App.field[X][Y];
            Image i = F.getImg();
            int r = F.getRotation();
            images.add(i);
            rotations.add(r);
            
            if(X == 6 && Y == 6){
                exit = true;
            }
            else{
                if(X == 6){
                    X = 0;
                    Y = Y + 1;
                }
                else{
                    X = X + 1;
                }
            }
        }        
        
        for(ImageView I : imageviews) {
            System.out.println("test1");
            I.setImage(images.get(0));
            I.setRotate(rotations.get(0));
            images.remove(0); 
            rotations.remove(0);
        }  
    }  
    */

    
}

