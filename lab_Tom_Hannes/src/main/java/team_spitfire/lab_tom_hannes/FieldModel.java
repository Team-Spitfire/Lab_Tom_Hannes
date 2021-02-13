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
    private boolean oben;
    private boolean rechts;
    private boolean unten;
    private boolean links;

    public FieldModel(boolean oben, boolean rechts, boolean unten, boolean links) {
        this.oben = oben;
        this.rechts = rechts;
        this.unten = unten;
        this.links = links;
    }

    
    public boolean isOben() {
        return oben;
    }

    public void setOben(boolean oben) {
        this.oben = oben;
    }

    public boolean isRechts() {
        return rechts;
    }

    public void setRechts(boolean rechts) {
        this.rechts = rechts;
    }

    public boolean isUnten() {
        return unten;
    }

    public void setUnten(boolean unten) {
        this.unten = unten;
    }

    public boolean isLinks() {
        return links;
    }

    public void setLinks(boolean links) {
        this.links = links;
    }
    
    
}
