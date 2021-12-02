/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package org.centrale.tp3medev;

import java.awt.GridLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.IOException;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JButton;
import javax.swing.JDialog;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;

/**
 *
 * @author admin
 */
public class TraiterImage {

    public static void main(String[] args) throws IOException {

        String path = "Images Test PGM/baboon.pgm";
        LireImg img = new LireImg(path);

        JFrame frame = new JFrame("Tp traitement des images PGM");
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setSize(500, 500);
        frame.setVisible(true);

        // Définissez le panel de l'affichage de l'image
        JPanel panel = new JPanel();
        // Définir les boutons
        JButton btn1 = new JButton("Afficher de l'image PGM");
        btn1.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                img.lecture();
            }
        });
        panel.add(btn1);
        frame.setLayout(new GridLayout(2, 1));
        frame.add(panel);

        // Définissez le panel de l'affichage de l'histogramme
        panel = new JPanel();
        btn1 = new JButton("Afficher l'histogramme");
        btn1.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                System.out.println("Affichage de l'image :");
                List<Integer> histogramme = img.histogramme();
                for (int i = 0; i < histogramme.size(); i++) {
                    System.out.print("Le nombre de pixel avec un niveau de gris de " + (i + 1) + " est : ");
                    System.out.println(histogramme.get(i));
                }
            }
        });
        panel.add(btn1);
        frame.setLayout(new GridLayout(2, 1));
        frame.add(panel);

        
        // Définissez le panel de l'ecriture de l'image :
        panel = new JPanel();
        btn1 = new JButton("Ecrire une nouvelle image");
        btn1.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                try {
                    img.ecriture();
                } catch (IOException ex) {
                    Logger.getLogger(TraiterImage.class.getName()).log(Level.SEVERE, null, ex);
                }
            }
        });
        panel.add(btn1);
        frame.setLayout(new GridLayout(2, 1));
        frame.add(panel);
        
        // Définissez le panel de seuillage :
        panel = new JPanel();
        btn1 = new JButton("Seuiller l'image");
        btn1.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                System.out.println("Seuillage de l'image afficher, la sortie est stocke dans seuil.pgm");
                Utils ut = new Utils("seuil.pgm" , path);
                ut.seuillage(200);
            }
        });
        panel.add(btn1);
        frame.setLayout(new GridLayout(2, 1));
        frame.add(panel);
        
        // Affichage de la frame
        frame.pack();
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setSize(500, 500);
        frame.setVisible(true);
    }
}
