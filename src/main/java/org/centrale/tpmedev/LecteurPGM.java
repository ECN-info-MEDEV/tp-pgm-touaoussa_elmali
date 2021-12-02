/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package org.centrale.tpmedev;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.StringTokenizer;

/**
 *
 * @author lmalix
 */
public class LecteurPGM {
    
    private String filePath;
    
    private BufferedReader reader;
    
    public LecteurPGM(String filePath) {
        try {
            this.filePath = filePath;
            this.reader = new BufferedReader(new FileReader(filePath));
        } catch (FileNotFoundException ex) {
            System.out.println("file not found!");
        }
    }
    
    public void printPGM() {
        try {
            String ligne = this.reader.readLine();
            while(ligne != null) {
                System.out.println(ligne);
                ligne = this.reader.readLine();
            }
            
        } catch (IOException ex) {
            System.err.println(ex.getMessage());
        }
     }   
    
    public ArrayList<Integer> histogrammePGM() {
        
        
        ArrayList<Integer> histo = new ArrayList<>();
        String ligne = "";
        try {
            this.reader.readLine();
            this.reader.readLine();
            
            String dimensions = this.reader.readLine();
            StringTokenizer tokens = new StringTokenizer(dimensions, "  ");
            int w = Integer.parseInt(tokens.nextToken());
            int h = Integer.parseInt(tokens.nextToken());
            
            int max_gray = Integer.parseInt(this.reader.readLine());
            
            // Initialiser le histogramme par des 0
            
            
            for(int i=0; i<max_gray; i++) {
                histo.add(0);
            }
            
            while(true) {
                if (ligne == null)  {
                    break;
                }
                ligne = this.reader.readLine();
                if (ligne != null)  {
                    tokens = new StringTokenizer(ligne, " ");
                }
                
                
                while(tokens.hasMoreElements()) {
                    int idx = Integer.parseInt(tokens.nextToken());
                    histo.add(idx, histo.get(idx)+1);
                }

            }
            
        } catch (IOException ex) {
            System.err.println(ex.getMessage());
        }
        
        return histo;
        
    }
        
    
    
    
    
}
