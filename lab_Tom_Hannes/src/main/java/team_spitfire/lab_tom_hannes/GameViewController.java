/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package team_spitfire.lab_tom_hannes;

import java.io.IOException;
import java.net.URL;
import java.util.ResourceBundle;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
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
    }

    @FXML
    private void btnTurnLeft(ActionEvent event) {
        App.getNewField().turnRight();
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
    @FXML
    void keyPressed(KeyEvent event) throws IOException {
        switch (event.getCode()) {
            case W:
                testPerson.setY(testPerson.getY() - 16);
                checkPersonCoord();
                break;
            case S:
                testPerson.setY(testPerson.getY() + 16);
                checkPersonCoord();
                break;
            case A:
                testPerson.setX(testPerson.getX() - 16);
                checkPersonCoord();
                break;
            case D:
                testPerson.setX(testPerson.getX() + 16);
                checkPersonCoord();
                break;

            default:
                break;
        }
    }
    */
    
    for(FieldModel F : App.list){
            if(F.getTyp() == "t"){
                if(F.isUp() == true && F.isRight() == true && F.isDown() == true){
                    
                }
                else if(F.isRight() == true && F.isDown() == true && F.isLeft() == true){
                    
                }
                else if(F.isDown() == true && F.isLeft() == true && F.isUp() == true){
                    
                }
                else(){
                    
                }
            }
            else if(F.getTyp() == "k"){
                
            }
            else if(F.getTyp() == "g"){
                
            }
            
        }       
}
