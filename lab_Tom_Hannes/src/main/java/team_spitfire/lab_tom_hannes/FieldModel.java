/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package team_spitfire.lab_tom_hannes;

import javafx.scene.image.ImageView;

/**
 *
 * @author hanne
 */
public class FieldModel {
    private boolean up;
    private boolean right;
    private boolean down;
    private boolean left;
    private ImageView pic;

    public FieldModel(boolean up, boolean right, boolean down, boolean left) {
        this.up = up;
        this.right = right;
        this.down = down;
        this.left = left;
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
    
    
    
    
    
    
    
}
