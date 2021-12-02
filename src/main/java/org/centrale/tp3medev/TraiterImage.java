/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package org.centrale.tp3medev;

import java.io.IOException;
import java.util.List;

/**
 *
 * @author admin
 */
public class TraiterImage {

    public static void main(String[] args) throws IOException {
        String path = "Images Test PGM/baboon.pgm";
        
        // Lire l'image
        LireImg img = new LireImg(path);
        //img.lecture();
        
        // Ecrire des images PGM :
        img.ecriture();
        
        // Calculer l'histogramme :
        System.out.println("Affichage de l'histogramme :");
        List<Integer> histogramme = img.histogramme();
        for(int i=0;i<histogramme.size(); i++){
            System.out.print("Le nombre de pixel avec un niveau de gris de " + (i+1) + " est : ");
            System.out.println(histogramme.get(i));
        }
    }
}
