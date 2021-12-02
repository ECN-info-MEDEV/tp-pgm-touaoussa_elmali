/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package org.centrale.tpmedev;

import java.util.ArrayList;

/**
 *
 * @author lmalix
 */
public class TpMedevMain {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        LecteurPGM lecteur = new LecteurPGM("coins.pgm");
        
        ArrayList<Integer> histo = lecteur.histogrammePGM();
        System.out.println(histo);
        
    }
    
}
