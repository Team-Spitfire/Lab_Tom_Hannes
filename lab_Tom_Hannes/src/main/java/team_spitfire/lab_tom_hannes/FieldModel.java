/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package team_spitfire.lab_tom_hannes;

import javafx.scene.image.Image;

/**
 *
 * @author hanne
 */
public class FieldModel {
    private boolean up;
    private boolean right;
    private boolean down;
    private boolean left;
    private String path;
    private Image image;

    public FieldModel(boolean up, boolean right, boolean down, boolean left, String path) {
        this.up = up;
        this.right = right;
        this.down = down;
        this.left = left;
        this.path = path;
        createImage();  
    }
    
    private void createImage() {
        Image image1 = new Image(path);
        setImage(image1);
    }
     
    //Karte wird nach links gedreht (booleabs für Öffnungen werden geändert)
    public void turnLeft(){
        boolean U = isUp();
        boolean R = isRight();
        boolean D = isDown();
        boolean L = isLeft();
        
        
        setUp(R);
        setRight(D);
        setDown(L);
        setLeft(U);
    }
    
    //Karte wird nach rechts gedreht (booleabs für Öffnungen werden geändert)
    public void turnRight(){
        boolean U = isUp();
        boolean R = isRight();
        boolean D = isDown();
        boolean L = isLeft();
        
        setUp(L);
        setLeft(D);
        setDown(R);
        setRight(U);  
    }

    public boolean isUp() {
        return up;
    }

    public void setUp(boolean Up) {
        this.up = up;
    }

    public boolean isRight() {
        return right;
    }

    public void setRight(boolean right) {
        this.right = right;
    }

    public boolean isDown() {
        return down;
    }

    public void setDown(boolean down) {
        this.down = down;
    }

    public boolean isLeft() {
        return left;
    }

    public void setLeft(boolean left) {
        this.left = left;
    }

    public String getPath() {
        return path;
    }

    public void setPath(String path) {
        this.path = path;
    }

    public Image getImage() {
        return image;
    }

    public void setImage(Image image) {
        this.image = image;
    }

   
    
    
    
    
    
    
    
}
