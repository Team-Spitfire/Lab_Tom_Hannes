/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package team_spitfire.lab_tom_hannes;

import java.io.File;
import java.io.IOException;
import java.net.URL;
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
    
    private static int x = 0;
    private static int y = 0;
    private static String X = String.valueOf(x);
    private static String Y = String.valueOf(y);
    private static String Z = "iv_" + X + "_" + Y; 

    /**
     * Initializes the controller class.
     */
    @Override
    public void initialize(URL url, ResourceBundle rb) {
        // TODO
    }

    @FXML
    private void btnTurnRight(ActionEvent event) {
        App.getNewField().turnRight();
        ivNewField.setRotate(+45);
    }

    @FXML
    private void btnTurnLeft(ActionEvent event) {
        App.getNewField().turnRight();
        ivNewField.setRotate(-45);
    }

    @FXML
    private void btn10insU(ActionEvent event) {
        App.PfeilY1Oben(App.getNewField());
    }

    @FXML
    private void btn30insU(ActionEvent event) {
        App.PfeilY3Oben(App.getNewField());
    }

    @FXML
    private void btn50insU(ActionEvent event) {
        App.PfeilY5Oben(App.getNewField());
    }

    @FXML
    private void btn61insR(ActionEvent event) {
        App.PfeilX1Rechts(App.getNewField());
    }

    @FXML
    private void btn63insR(ActionEvent event) {
        App.PfeilX3Rechts(App.getNewField());
    }

    @FXML
    private void btn65insR(ActionEvent event) {
        App.PfeilX5Rechts(App.getNewField());
    }

    @FXML
    private void btn56insD(ActionEvent event) {
        App.PfeilY5Unten(App.getNewField());
    }

    @FXML
    private void btn36insD(ActionEvent event) {
        App.PfeilY3Unten(App.getNewField());
    }

    @FXML
    private void btn16insD(ActionEvent event) {
        App.PfeilY1Unten(App.getNewField());
    }

    @FXML
    private void btn01insL(ActionEvent event) {
        App.PfeilX1Links(App.getNewField());
    }

    @FXML
    private void btn03insL(ActionEvent event) {
        App.PfeilX3Links(App.getNewField());
    }

    @FXML
    private void btn05insL(ActionEvent event) {
        App.PfeilX5Links(App.getNewField());
    }

    /**
    * @FXML void keyPressed(KeyEvent event) throws IOException { switch
    * (event.getCode()) { case W: testPerson.setY(testPerson.getY() - 16);
    * checkPersonCoord(); break; case S: testPerson.setY(testPerson.getY() +
    * 16); checkPersonCoord(); break; case A: testPerson.setX(testPerson.getX()
    * - 16); checkPersonCoord(); break; case D:
    *testPerson.setX(testPerson.getX() + 16); checkPersonCoord(); break;
    *
    * default: break; } }
    */
    public void checkTileOri(FieldModel f) {
        int x = 0;
        int y = 0;
        
         for(FieldModel F : App.list) {
                
            for(int a = 0; a <= 6; a++){
                y = y + 1;
                for (int b = 0; b <= 6; b++) {
                    x = x + 1;       
                    
                    
                    
                    
                    if(x != 0 && y != 0 || x != 2 && y != 0 || x != 4 && y != 0 || x != 6 && y != 0 || x != 0 && y != 2 || x != 2 && y != 2 || x != 4 && y != 2 || x != 6 && y != 2 ||x != 0 && y != 4 || x != 2 && y != 4 || x != 4 && y != 4 || x != 6 && y != 4 || x != 0 && y != 6 || x != 2 && y != 6 || x != 4 && y != 6 || x != 6 && y != 6){
                        if (F.getTyp() == "t") {
                       
                            if (F.isUp() == true && F.isRight() == true && F.isDown() == true) {
                                iv1_2.setRotate(45);
                            } 
                            else if (F.isRight() == true && F.isDown() == true && F.isLeft() == true) {
                                iv1_2.setRotate(90);
                            } 
                            else if (F.isDown() == true && F.isLeft() == true && F.isUp() == true) {
                                iv1_2.setRotate(-45);
                            } 
                            else {
                                iv1_2.setRotate(0);
                            }
                        }     
                    
                        else if (F.getTyp() == "k") {
                            File file = new File("src/main/resources/team_spitfire/lab_tom_hannes/turn.png");
                            Image image = new Image(file.toURI().toString());
                            iv1_2.setImage(image);

                            if (F.isUp() ==  false && F.isRight() == true && F.isDown() == true) {

                                iv1_2.setRotate(45);
                            } 
                            else if (F.isRight() == true && F.isDown() == true && F.isLeft() == true) {
                                iv1_2.setRotate(90);
                            } 
                            else if (F.isDown() == true && F.isLeft() == true && F.isUp() == true) {
                                iv1_2.setRotate(-45);
                            } 
                            else {
                                iv1_2.setRotate(0);
                            }
                        } 
                        else if (F.getTyp() == "g") {
                            File file = new File("src/main/resources/team_spitfire/lab_tom_hannes/straight.png");
                            Image image = new Image(file.toURI().toString());
                            iv1_2.setImage(image);

                            if (F.isUp() == true && F.isRight() == true && F.isDown() == true) {
                                iv1_2.setRotate(45);
                            } 
                            else if (F.isRight() == true && F.isDown() == true && F.isLeft() == true) {
                                iv1_2.setRotate(90);
                            } 
                            else if (F.isDown() == true && F.isLeft() == true && F.isUp() == true) {
                                iv1_2.setRotate(-45);
                            } 
                            else {
                                iv1_2.setRotate(0);
                            }
                        }
                    }
                }
            }
        }
    }
        
}

