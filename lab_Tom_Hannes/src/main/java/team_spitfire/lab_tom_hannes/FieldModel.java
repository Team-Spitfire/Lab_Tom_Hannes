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
    private String pngName;
    private File file = new File("src/main/resources/team_spitfire/lab_tom_hannes/" + pngName);
    private Image image = new Image(file.toURI().toString());
    private int rotation;

    public FieldModel(boolean up, boolean right, boolean down, boolean left, int schatz, String pngName, int rotation) {
        this.up = up;
        this.right = right;
        this.down = down;
        this.left = left;
        this.schatz = schatz;
        this.pngName = pngName;
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

    public String getPngName() {
        return pngName;
    }

    public void setPngName(String pngName) {
        this.pngName = pngName;
    }


    public File getFile() {
        return file;
    }

    public void setFile(File file) {
        this.file = file;
    }

    public Image getImage() {
        return image;
    }

    public void setImage(Image image) {
        this.image = image;
    }

    public int getRotation() {
        return rotation;
    }

    public void setRotation(int rotation) {
        this.rotation = rotation;
    }
    

}
