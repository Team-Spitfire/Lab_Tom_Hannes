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
import javafx.scene.control.Button;
import javafx.scene.image.Image;
import javafx.scene.image.ImageView;
import javafx.scene.input.KeyEvent;
import static team_spitfire.lab_tom_hannes.App.imageviews;
import static team_spitfire.lab_tom_hannes.App.tempList;

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

    

    /**
     * Initializes the controller class.
     */
    @Override
    public void initialize(URL url, ResourceBundle rb) {

        App.checkBounds();
        App.loadImages();
        
        for (ImageView I : imageviews) {
            I.setImage(tempList.get(0).getImg());
            I.setRotate(tempList.get(0).getRotation());
            tempList.remove(0);
        }
        
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
    }

    public void addImageViews() {
        App.imageviews.add(iv0_1);
        App.imageviews.add(iv0_3);
        App.imageviews.add(iv0_5);
        App.imageviews.add(iv1_0);
        App.imageviews.add(iv1_1);
        App.imageviews.add(iv1_2);
        App.imageviews.add(iv1_3);
        App.imageviews.add(iv1_4);
        App.imageviews.add(iv1_5);
        App.imageviews.add(iv1_6);
        App.imageviews.add(iv2_1);
        App.imageviews.add(iv2_3);
        App.imageviews.add(iv2_5);
        App.imageviews.add(iv3_0);
        App.imageviews.add(iv3_1);
        App.imageviews.add(iv3_2);
        App.imageviews.add(iv3_3);
        App.imageviews.add(iv3_4);
        App.imageviews.add(iv3_5);
        App.imageviews.add(iv3_6);
        App.imageviews.add(iv4_1);
        App.imageviews.add(iv4_3);
        App.imageviews.add(iv4_5);
        App.imageviews.add(iv5_0);
        App.imageviews.add(iv5_1);
        App.imageviews.add(iv5_2);
        App.imageviews.add(iv5_3);
        App.imageviews.add(iv5_4);
        App.imageviews.add(iv5_5);
        App.imageviews.add(iv5_6);
        App.imageviews.add(iv6_1);
        App.imageviews.add(iv6_3);
        App.imageviews.add(iv6_5);
        App.imageviews.add(ivNewField);
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
    private void btnEndTurn(ActionEvent event) {
        App.curPlayer = App.curPlayer + 1;
        enableBtns();
        checkCurPlayer();
    }

    private void checkCurPlayer() {
        if (App.curPlayer == 5) {
            App.curPlayer = 1;
        }

    }

    void keyPressed(KeyEvent event) throws IOException {
        System.out.println("----------------------------------------------------------------");
        switch (event.getCode()) {
            case W:

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
                break;
            case S:

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

                break;
            case A:

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
                break;
            case D:
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
                break;
        }
    }    
}
