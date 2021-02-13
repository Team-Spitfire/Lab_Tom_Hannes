/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package team_spitfire.lab_tom_hannes;

/**
 *
 * @author hanne
 */
public class FieldModel {
    private boolean up;
    private boolean right;
    private boolean down;
    private boolean left;

    public FieldModel(boolean up, boolean right, boolean down, boolean left) {
        this.up = up;
        this.right = right;
        this.down = down;
        this.left = left;
    }

    
    //Karte wird nach links gedreht (booleabs für Öffnungen werden geändert)
    public void turnLeft(){
        setUp(isLeft());
        setRight(isUp());
        setDown(isRight());
        setLeft(isDown());
    }
    
    //Karte wird nach rechts gedreht (booleabs für Öffnungen werden geändert)
    public void turnRight(){
        setUp(isRight());
        setRight(isDown());
        setDown(isLeft());
        setLeft(isUp());
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
