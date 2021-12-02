/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package org.centrale.tp3medev;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;
import java.util.StringTokenizer;

/**
 *
 * @author lmalix
 *
 */
public class Utils {

    private String filepath;

    /**
     * le BufferedWriter
     */
    private BufferedWriter writer;
    private BufferedReader reader;

    /**
     * Constructeur
     *
     * @param filepath le nom de fichier
     */
    public Utils(String filepath, String originFilepath) {
        try {
            int i = 0;
            File f = new File(filepath);
            while (f.exists()) {
                f = new File(filepath.split(".txt")[0] + (i++) + ".txt");
            }
            this.filepath = f.getAbsolutePath();
            this.writer = new BufferedWriter(new FileWriter(f.getAbsolutePath()));
        } catch (IOException e) {
            System.out.println(e.getMessage());
        }

        try {

            this.reader = new BufferedReader(new FileReader(originFilepath));
        } catch (FileNotFoundException ex) {
            System.out.println("file not found!");
        }

    }

    /**
     * Ecrire une ligne
     *
     * @param ligne la ligne
     */
    public void ecrireLigne(String ligne) {
        try {
            this.writer.write(ligne + " \n");
        } catch (IOException e) {
            System.out.println(e.getMessage());
        }
    }

    public void seuillage(int seuil) {

        try {
            ecrireLigne(this.reader.readLine());
            ecrireLigne(this.reader.readLine());
            ecrireLigne(this.reader.readLine());
            ecrireLigne(this.reader.readLine());
            
            
            String ligne = "";
            StringTokenizer tokens = null;
            while(true) {
                if (ligne == null)  {
                    break;
                }
                ligne = this.reader.readLine();
                if (ligne != null)  {
                    tokens = new StringTokenizer(ligne, " ");
                }
                
                String oneLine = "";
                while(tokens.hasMoreElements()) {
                    int pix = Integer.parseInt(tokens.nextToken());
                    if(pix < seuil) {
                        oneLine = oneLine+"0  ";
                    }
                    else {
                        oneLine = oneLine+Integer.toString(pix)+"  ";
                    }
                }
                
                ecrireLigne(oneLine);
            }
        } catch (IOException ex) {
            System.out.println(ex.getMessage());
        }

    }

}
