/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package biblioteca;

/**
 *
 * @author peeet
 */
public class Penalizacion {
    private int fichaS;
    private int idMulta;

    public Penalizacion() {
    }

    public Penalizacion(int fichaS, int idMulta) {
        this.fichaS = fichaS;
        this.idMulta = idMulta;
    }

    public int getFichaS() {
        return fichaS;
    }

    public void setFichaS(int fichaS) {
        this.fichaS = fichaS;
    }

    public int getIdMulta() {
        return idMulta;
    }

    public void setIdMulta(int idMulta) {
        this.idMulta = idMulta;
    }
    
}
