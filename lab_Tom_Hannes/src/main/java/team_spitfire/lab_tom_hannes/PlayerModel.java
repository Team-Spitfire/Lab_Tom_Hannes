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
    private String name;
    private int punkte;
    ArrayList<CardModel> hand = new ArrayList<CardModel> ();

    public PlayerModel(String name, int punkte) {
        this.name = name;
        this.punkte = punkte;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getPunkte() {
        return punkte;
    }

    public void setPunkte(int punkte) {
        this.punkte = punkte;
    }
    
    


    
}
