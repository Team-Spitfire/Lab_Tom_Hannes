/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package team_spitfire.lab_tom_hannes;

import java.io.IOException;
import java.net.URL;
import java.util.ResourceBundle;
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
    private ImageView iv2_2;
    @FXML
    private ImageView iv2_3;
    @FXML
    private ImageView iv2_4;
    @FXML
    private ImageView iv2_5;
    @FXML
    private ImageView iv2_6;
    @FXML
    private ImageView iv2_7;
    @FXML
    private ImageView iv3_2;
    @FXML
    private ImageView iv3_4;
    @FXML
    private ImageView iv3_6;
    @FXML
    private ImageView iv4_1;
    @FXML
    private ImageView iv4_2;
    @FXML
    private ImageView iv4_3;
    @FXML
    private ImageView iv4_4;
    @FXML
    private ImageView iv4_5;
    @FXML
    private ImageView iv4_6;
    @FXML
    private ImageView iv4_7;
    @FXML
    private ImageView iv5_2;
    @FXML
    private ImageView iv5_4;
    @FXML
    private ImageView iv5_6;
    @FXML
    private ImageView iv6_1;
    @FXML
    private ImageView iv6_2;
    @FXML
    private ImageView iv6_3;
    @FXML
    private ImageView iv6_4;
    @FXML
    private ImageView iv6_5;
    @FXML
    private ImageView iv6_6;
    @FXML
    private ImageView iv6_7;
    @FXML
    private ImageView iv7_2;
    @FXML
    private ImageView iv7_4;
    @FXML
    private ImageView iv7_6;
    @FXML
    private ImageView ivNewCard;

    /**
     * Initializes the controller class.
     */
    @Override
    public void initialize(URL url, ResourceBundle rb) {
        // TODO
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
}
