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
public class CardModel {
    private int itemCardInt;
    private Image imgC;

    public CardModel(int itemCardInt) {
        this.itemCardInt = itemCardInt;
        this.imgC = imgC;
    }

    public int getItemCardInt() {
        return itemCardInt;
    }

    public void setItemCardInt(int itemCardInt) {
        this.itemCardInt = itemCardInt;
    }

    public Image getImgC() {
        return imgC;
    }

    public void setImgC(Image imgC) {
        this.imgC = imgC;
    }
    
    
}
