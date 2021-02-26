/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package team_spitfire.lab_tom_hannes;


import java.io.IOException;
import java.net.URL;
import java.util.ArrayList;

import java.util.ResourceBundle;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.Button;
import javafx.scene.control.Label;

import javafx.scene.image.ImageView;
import javafx.scene.input.KeyCode;
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
    private ImageView ivRed4;
    @FXML
    private ImageView ivRed3;
    @FXML
    private ImageView ivRed2;
    @FXML
    private ImageView ivRed1;
    @FXML
    private ImageView ivYellow4;
    @FXML
    private ImageView ivYellow3;
    @FXML
    private ImageView ivYellow2;
    @FXML
    private ImageView ivYellow1;
    @FXML
    private ImageView ivGreen4;
    @FXML
    private ImageView ivGreen3;
    @FXML
    private ImageView ivGreen2;
    @FXML
    private ImageView ivGreen1;
    @FXML
    private ImageView ivBlue4;
    @FXML
    private ImageView ivBlue3;
    @FXML
    private ImageView ivBlue2;
    @FXML
    private ImageView ivBlue1;
    @FXML
    private Label txtZugIndicator;
    @FXML
    private ImageView ivNewField;
    @FXML
    private static ImageView ivRedPlayer;
    @FXML
    private static ImageView ivYellowPlayer;
    @FXML
    private static ImageView ivBluePlayer;
    @FXML
    private static ImageView ivGreenPlayer;

    @FXML
    private Button btn1;
    @FXML
    private Button btn2;
    @FXML
    private Button btn3;
    @FXML
    private Button btn4;
    @FXML
    private Button btn5;
    @FXML
    private Button btn6;
    @FXML
    private Button btn7;
    @FXML
    private Button btn8;
    @FXML
    private Button btn9;
    @FXML
    private Button btn10;
    @FXML
    private Button btn11;
    @FXML
    private Button btn12;

    private static ArrayList<ImageView> imageviews;
    private static ArrayList<FieldModel> tempList;
    private static ArrayList<ImageView> cardImageviewsR;
    private static ArrayList<ImageView> cardImageviewsY;
    private static ArrayList<ImageView> cardImageviewsG;
    private static ArrayList<ImageView> cardImageviewsB;
    
    

    /**
     * Initializes the controller class.
     */
    @Override
    public void initialize(URL url, ResourceBundle rb) {
        
        imageviews = new ArrayList<ImageView>();
        tempList = new ArrayList<FieldModel>();
        cardImageviewsR = new ArrayList<ImageView>();
        cardImageviewsY = new ArrayList<ImageView>();
        cardImageviewsG = new ArrayList<ImageView>();
        cardImageviewsB = new ArrayList<ImageView>();
        
        checkBounds();
        loadImages();
        
        System.out.println("END INITIALIZE");
    }

    public void disableBtns() {
        App.btnStatus1 = false;
        App.btnStatus2 = false;
        App.btnStatus3 = false;
        App.btnStatus4 = false;
        App.btnStatus5 = false;
        App.btnStatus6 = false;
        App.btnStatus7 = false;
        App.btnStatus8 = false;
        App.btnStatus9 = false;
        App.btnStatus10 = false;
        App.btnStatus11 = false;
        App.btnStatus12 = false;
        System.out.println("END DISABLEBUTTONS");
    }

    public void enableBtns() {
        App.btnStatus1 = true;
        App.btnStatus2 = true;
        App.btnStatus3 = true;
        App.btnStatus4 = true;
        App.btnStatus5 = true;
        App.btnStatus6 = true;
        App.btnStatus7 = true;
        App.btnStatus8 = true;
        App.btnStatus9 = true;
        App.btnStatus10 = true;
        App.btnStatus11 = true;
        App.btnStatus12 = true;
        System.out.println("END ENABLEBUTTONS");
    }

    @FXML
    private void btnTurnRight(ActionEvent event) throws IOException {
        App.getNewField().turnRight();
        System.out.println(App.getNewField());
        System.out.println(App.getNewField().getRotation());
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
        if (App.btnStatus1 == true) {
            App.PfeilY1Oben(App.getNewField());
            disableBtns();
            App.setRoot("gameView");
        }

    }

    @FXML
    private void btn30insU(ActionEvent event) throws IOException {
        if (App.btnStatus2 == true) {
            App.PfeilY3Oben(App.getNewField());
            disableBtns();
            App.setRoot("gameView");
        }
    }

    @FXML
    private void btn50insU(ActionEvent event) throws IOException {
        if (App.btnStatus3 == true) {
            App.PfeilY5Oben(App.getNewField());
            disableBtns();
            App.setRoot("gameView");
        }
    }

    @FXML
    private void btn61insR(ActionEvent event) throws IOException {
        if (App.btnStatus4 == true) {
            App.PfeilX1Rechts(App.getNewField());
            disableBtns();
            App.setRoot("gameView");
        }
    }

    @FXML
    private void btn63insR(ActionEvent event) throws IOException {
        if (App.btnStatus5 == true) {
            App.PfeilX3Rechts(App.getNewField());
            disableBtns();
            App.setRoot("gameView");
        }
    }

    @FXML
    private void btn65insR(ActionEvent event) throws IOException {
        if (App.btnStatus6 == true) {
            App.PfeilX5Rechts(App.getNewField());
            disableBtns();
            App.setRoot("gameView");
        }
    }

    @FXML
    private void btn56insD(ActionEvent event) throws IOException {
        if (App.btnStatus7 == true) {
            App.PfeilY5Unten(App.getNewField());
            disableBtns();
            App.setRoot("gameView");
        }
    }

    @FXML
    private void btn36insD(ActionEvent event) throws IOException {
        if (App.btnStatus8 == true) {
            App.PfeilY3Unten(App.getNewField());
            disableBtns();
            App.setRoot("gameView");
        }
    }

    @FXML
    private void btn16insD(ActionEvent event) throws IOException {
        if (App.btnStatus9 == true) {
            App.PfeilY1Unten(App.getNewField());
            disableBtns();
            App.setRoot("gameView");
        }
    }

    @FXML
    private void btn01insL(ActionEvent event) throws IOException {
        if (App.btnStatus12 == true) {
            App.PfeilX1Links(App.getNewField());
            disableBtns();
            App.setRoot("gameView");
        }
    }

    @FXML
    private void btn03insL(ActionEvent event) throws IOException {
        if (App.btnStatus11 == true) {
            App.PfeilX3Links(App.getNewField());
            disableBtns();
            App.setRoot("gameView");
        }
    }

    @FXML
    private void btn05insL(ActionEvent event) throws IOException {
        if (App.btnStatus10 == true) {
            App.PfeilX5Links(App.getNewField());
            disableBtns();
            App.setRoot("gameView");
        }
    }

    @FXML
    private void btnEndTurn(ActionEvent event) throws IOException {
        App.curPlayer = App.curPlayer + 1;
        enableBtns();
        checkCurPlayer();
        App.setRoot("gameView");
    }

    private void checkCurPlayer() {
        if (App.curPlayer == 5) {
            App.curPlayer = 1;
        }
        System.out.println("END CHECKCURPLAYER");
    }

    
    public static void KeyEventW(){
        switch (App.curPlayer) {
            case 1:
                ivRedPlayer.setY(ivRedPlayer.getY() - 16);
                App.redPlayer.setPosY(App.redPlayer.getPosY() - 1);
                break;
            case 2:
                ivYellowPlayer.setY(ivYellowPlayer.getY() - 16);
                App.yellowPlayer.setPosY(App.yellowPlayer.getPosY() - 1);
                break;
            case 3:
                ivGreenPlayer.setY(ivGreenPlayer.getY() - 16);
                App.greenPlayer.setPosY(App.greenPlayer.getPosY() - 1);
                break;
            case 4:
                ivBluePlayer.setY(ivBluePlayer.getY() - 16);
                App.bluePlayer.setPosY(App.bluePlayer.getPosY() - 1);
                break;
            default:
                break;
        }
    }
    
    
    public static void KeyEventS(){
        switch (App.curPlayer) {
            case 1:
                ivRedPlayer.setY(ivRedPlayer.getY() + 16);
                App.redPlayer.setPosY(App.redPlayer.getPosY() + 1);
                break;
            case 2:
                ivYellowPlayer.setY(ivYellowPlayer.getY() + 16);
                App.yellowPlayer.setPosY(App.yellowPlayer.getPosY() + 1);
                break;
            case 3:
                ivGreenPlayer.setY(ivGreenPlayer.getY() + 16);
                App.greenPlayer.setPosY(App.greenPlayer.getPosY() + 1);
                break;
            case 4:
                ivBluePlayer.setY(ivBluePlayer.getY() + 16);
                App.bluePlayer.setPosY(App.bluePlayer.getPosY() + 1);
                break;
            default:
                break;
        }
    }
    
    /*
    
    
    @FXML
    void keyPressed(KeyEvent event) {
        
        //switch (event.getCode()) {
        if (event.getCode() == KeyCode.W) {
            //case W:
            System.out.println("----------------------------------------------------------------");
            switch (App.curPlayer) {
                case 1:
                    ivRedPlayer.setY(ivRedPlayer.getY() - 16);
                    App.redPlayer.setPosY(App.redPlayer.getPosY() - 1);
                    break;
                case 2:
                    ivYellowPlayer.setY(ivYellowPlayer.getY() - 16);
                    App.yellowPlayer.setPosY(App.yellowPlayer.getPosY() - 1);
                    break;
                case 3:
                    ivGreenPlayer.setY(ivGreenPlayer.getY() - 16);
                    App.greenPlayer.setPosY(App.greenPlayer.getPosY() - 1);
                    break;
                case 4:
                    ivBluePlayer.setY(ivBluePlayer.getY() - 16);
                    App.bluePlayer.setPosY(App.bluePlayer.getPosY() - 1);
                    break;
                default:
                    break;
            }
            //break;
            //case S:
            if (event.getCode() == KeyCode.S) {
                
                System.out.println("----------------------------------------------------------------");
                switch (App.curPlayer) {
                    case 1:
                        ivRedPlayer.setY(ivRedPlayer.getY() + 16);
                        App.redPlayer.setPosY(App.redPlayer.getPosY() + 1);
                        break;
                    case 2:
                        ivYellowPlayer.setY(ivYellowPlayer.getY() + 16);
                        App.yellowPlayer.setPosY(App.yellowPlayer.getPosY() + 1);
                        break;
                    case 3:
                        ivGreenPlayer.setY(ivGreenPlayer.getY() + 16);
                        App.greenPlayer.setPosY(App.greenPlayer.getPosY() + 1);
                        break;
                    case 4:
                        ivBluePlayer.setY(ivBluePlayer.getY() + 16);
                        App.bluePlayer.setPosY(App.bluePlayer.getPosY() + 1);
                        break;
                    default:
                        break;
                }
            }
            //break;
            //case A:
            if (event.getCode() == KeyCode.A) {
                System.out.println("----------------------------------------------------------------");
                switch (App.curPlayer) {
                    case 1:
                        ivRedPlayer.setX(ivRedPlayer.getX() - 16);
                        App.redPlayer.setPosY(App.redPlayer.getPosY() - 1);
                        break;
                    case 2:
                        ivYellowPlayer.setX(ivYellowPlayer.getX() - 16);
                        App.yellowPlayer.setPosY(App.yellowPlayer.getPosY() - 1);
                        break;
                    case 3:
                        ivGreenPlayer.setX(ivGreenPlayer.getX() - 16);
                        App.greenPlayer.setPosY(App.greenPlayer.getPosY() - 1);
                        break;
                    case 4:
                        ivBluePlayer.setX(ivBluePlayer.getX() - 16);
                        App.bluePlayer.setPosY(App.bluePlayer.getPosY() - 1);
                        break;
                    default:
                        break;
                }
            }
                
            //break;
           //case D:
                
            if (event.getCode() == KeyCode.D) {
                System.out.println("----------------------------------------------------------------");
                switch (App.curPlayer) {
                    case 1:
                        ivRedPlayer.setX(ivRedPlayer.getX() - 16);
                        App.redPlayer.setPosY(App.redPlayer.getPosY() - 1);
                        break;
                    case 2:
                        ivYellowPlayer.setX(ivYellowPlayer.getX() - 16);
                        App.yellowPlayer.setPosY(App.yellowPlayer.getPosY() - 1);
                        break;
                    case 3:
                        ivGreenPlayer.setX(ivGreenPlayer.getX() - 16);
                        App.greenPlayer.setPosY(App.greenPlayer.getPosY() - 1);
                        break;
                    case 4:
                        ivBluePlayer.setX(ivBluePlayer.getX() - 16);
                        App.bluePlayer.setPosY(App.bluePlayer.getPosY() - 1);
                        break;
                    default:
                        break;
                }
                //break;
            }
    }
    */
    


    

    public void checkBounds() {
        int x = 0;
        int y = 0;
        switch (App.curPlayer) {
            case 1:
                x = App.redPlayer.getPosX();
                y = App.redPlayer.getPosY();
                break;
            case 2:
                x = App.yellowPlayer.getPosX();
                y = App.yellowPlayer.getPosY();
                break;
            case 3:
                x = App.greenPlayer.getPosX();
                y = App.greenPlayer.getPosY();
                break;
            case 4:
                x = App.bluePlayer.getPosX();
                y = App.bluePlayer.getPosY();
                break;
            default:
                break;
        }


        System.out.println(x);
        System.out.println(y);

        FieldModel c = App.field[x][y];

        App.boundsUp = false;
        App.boundsRight = false;
        App.boundsDown = false;
        App.boundsLeft = false;

        boolean du = false;
        boolean ud = false;
        boolean lr = false;
        boolean rl = false;

        if (y != 6) {
            FieldModel d = App.field[x][y + 1];
            du = d.isUp();
        }
        if (y != 0) {
            FieldModel u = App.field[x][y - 1];
            ud = u.isDown();
        }
        if (x != 0) {
            FieldModel l = App.field[x - 1][y];
            lr = l.isRight();
        }
        if (x != 6) {
            FieldModel r = App.field[x + 1][y];
            rl = r.isLeft();
        }

        //Alle Fieldmodels die den Spieler Umgeben
        //Alle Booleans des Feldes wo der Spieler sich drauf befindet
        boolean cu = c.isUp();
        boolean cd = c.isDown();
        boolean cl = c.isLeft();
        boolean cr = c.isRight();

        //Alle Booleans der umgebenden Felder
       

        //guckt ob die Übergänge offen sind
        if (cu == true && ud == true) {
            App.boundsUp = true;
        }

        if (cd == true && du == true) {
            App.boundsDown = true;
        }

        if (cl == true && lr == true) {
            App.boundsLeft = true;
        }

        if (cr == true && rl == true) {
            App.boundsRight = true;
        }
        System.out.println("END CHECKBOUNDS");
    }

    public void loadImages() {
        tempList.clear();
        imageviews.clear();
        cardImageviewsR.clear();
        cardImageviewsY.clear();
        cardImageviewsG.clear();
        cardImageviewsB.clear();
        
        cardImageviewsR.add(ivRed1);
        cardImageviewsR.add(ivRed2);
        cardImageviewsR.add(ivRed3);
        cardImageviewsR.add(ivRed4);
        cardImageviewsY.add(ivYellow1);
        cardImageviewsY.add(ivYellow2);
        cardImageviewsY.add(ivYellow3);
        cardImageviewsY.add(ivYellow4);
        cardImageviewsG.add(ivGreen1);
        cardImageviewsG.add(ivGreen2);
        cardImageviewsG.add(ivGreen3);
        cardImageviewsG.add(ivGreen4);
        cardImageviewsB.add(ivBlue1);
        cardImageviewsB.add(ivBlue2);
        cardImageviewsB.add(ivBlue3);
        cardImageviewsB.add(ivBlue4);
        
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

        for(ImageView I : cardImageviewsR){
            I.setImage(App.redPlayer.getHand().get(0).getImgC());
        }
        for(ImageView I : cardImageviewsY){
            I.setImage(App.yellowPlayer.getHand().get(0).getImgC());
        }
        for(ImageView I : cardImageviewsG){
            I.setImage(App.greenPlayer.getHand().get(0).getImgC());
        }
        for(ImageView I : cardImageviewsB){
            I.setImage(App.bluePlayer.getHand().get(0).getImgC());
        }

        for (ImageView I : imageviews) {
            I.setImage(tempList.get(0).getImg());
            I.setRotate(tempList.get(0).getRotation());

            tempList.remove(0);
        }
    System.out.println("END LOADIMAGES");
    }
}
