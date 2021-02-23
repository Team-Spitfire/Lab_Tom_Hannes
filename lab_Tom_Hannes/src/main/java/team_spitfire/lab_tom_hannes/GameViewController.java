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
    
   
    ArrayList<ImageView> imageviews;
    ArrayList<Image> images;
    ArrayList<Integer> rotations;
    
    

    /**
     * Initializes the controller class.
     */
    @Override
    public void initialize(URL url, ResourceBundle rb) {
        
        imageviews = new ArrayList<ImageView> ();
        images = new ArrayList<Image> ();
        rotations = new ArrayList<Integer> ();
        addToList();
        checkTileOri();
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

    public void addToList(){
        imageviews.add(iv0_1);
        imageviews.add(iv0_3);
        imageviews.add(iv0_5);
        imageviews.add(iv1_1);
        imageviews.add(iv1_2);
        imageviews.add(iv1_3);
        imageviews.add(iv1_4);
        imageviews.add(iv1_5);
        imageviews.add(iv2_1);
        imageviews.add(iv2_3);
        imageviews.add(iv2_5);
        imageviews.add(iv3_1);
        imageviews.add(iv5_2);
        imageviews.add(iv5_3);
        imageviews.add(iv5_4);
        imageviews.add(iv5_5);
        imageviews.add(iv5_6);
        imageviews.add(iv6_1);
        imageviews.add(iv6_3);
        imageviews.add(iv6_5);
    }
    
    public void checkTileOri() {
        
        for(FieldModel F : App.list) {
            //Image i = F.getImage();
            //int r = F.getRotation();
            //if(F.getImage().getUrl() != "file:src/main/resources/team_spitfire/lab_tom_hannes/balck.png"){
                images.add(F.getImage());
                rotations.add(F.getRotation());     
            //}
            //else{
            //}
        }
        
        for(ImageView I : imageviews) {
            I.setImage(images.get(0));
            I.setRotate(rotations.get(0));
            images.remove(0); 
            rotations.remove(0);
        }
    }    
}

