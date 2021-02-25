/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package team_spitfire.lab_tom_hannes;

import java.util.ArrayList;

/**
 *
 * @author hanne
 */
public class PlayerModel {
    
    private int punkte;
    private int posX;
    private int posY;
    ArrayList<CardModel> hand = new ArrayList<CardModel> ();

    public PlayerModel(int punkte, int posX, int posY) {
        this.punkte = punkte;
        this.posX = posX;
        this.posY = posY;
    }

    

    public int getPunkte() {
        return punkte;
    }

    public void setPunkte(int punkte) {
        this.punkte = punkte;
    }

    public int getPosX() {
        return posX;
    }

    public void setPosX(int posX) {
        this.posX = posX;
    }

    public int getPosY() {
        return posY;
    }

    public void setPosY(int posY) {
        this.posY = posY;
    }

    public ArrayList<CardModel> getHand() {
        return hand;
    }

    public void setHand(ArrayList<CardModel> hand) {
        this.hand = hand;
    }
    
    


    
}
