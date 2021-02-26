/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package team_spitfire.lab_tom_hannes;

import java.io.File;
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
    private int schatz;
    private Image img;
    private int rotation;
    private int i = 0;

    public FieldModel(boolean up, boolean right, boolean down, boolean left, int schatz, Image img, int rotation) {
        this.up = up;
        this.right = right;
        this.down = down;
        this.left = left;
        this.schatz = schatz;
        this.img = img;
        this.rotation = rotation;
    }

    

    

    

    //Karte wird nach links gedreht (booleabs für Öffnungen werden geändert)
    public void turnLeft() {
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
    public void turnRight() {
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

    public void setUp(boolean up) {
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

    public int getSchatz() {
        return schatz;
    }

    public void setSchatz(int schatz) {
        this.schatz = schatz;
    }

    public Image getImg() {
        return img;
    }

    public void setImg(Image img) {
        this.img = img;
    }


    public int getRotation() {
        return rotation;
    }

    public void setRotation(int rotation) {
        this.rotation = rotation;
    }

}
