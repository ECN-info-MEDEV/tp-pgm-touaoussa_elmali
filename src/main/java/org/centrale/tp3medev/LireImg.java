/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package org.centrale.tp3medev;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Scanner;
import java.util.StringTokenizer;

/**
 *
 * @author admin
 */
public class LireImg {
    private String source;
    
    public LireImg(String s){
        this.source = s;
    }
    
    public void lecture(){
        try{
            String ligne;
            BufferedReader fichier = new BufferedReader(new FileReader(source));
            ligne = fichier.readLine();
            while (ligne != null){
                System.out.println(ligne);
                ligne = fichier.readLine();
            }
            fichier.close();
        } catch (Exception e){
            e.printStackTrace();;
        }
    }
    
    public void ecriture() throws IOException{
        BufferedWriter bufferedWriter = null;
        try{
            Scanner sc = new Scanner(System.in);
            System.out.println("Enterer le nom de fichier a enregistrer (avec extension .pgm)");
            String src = sc.next();
            bufferedWriter = new BufferedWriter(new FileWriter(src));
            bufferedWriter.write("P2\n");
            bufferedWriter.write("#\n");
            System.out.println("Entrer la longueur de l'image");
            String longueur = sc.next();
            System.out.println("Entrer la largeur de l'image");
            String largeur = sc.next();
            bufferedWriter.write(longueur + " " + largeur + "\n");
            bufferedWriter.write("255\n");
            String valpixel;
            for(int i=0; i<Integer.parseInt(largeur); i++){
                for(int j=0; j<Integer.parseInt(longueur); j++){
                    System.out.println("Entrer la valeur du pixel " + (i+1) + "," + (j+1));
                    valpixel = sc.next();
                    bufferedWriter.write(valpixel + " ");
                }
                bufferedWriter.write("\n");
                
            }
            
            
            
        } catch (FileNotFoundException ex){
            ex.printStackTrace();
        }
        finally {
            try{
                if (bufferedWriter != null){
                    bufferedWriter.flush();
                    bufferedWriter.close();
                }
            }
            catch (IOException ex){
                ex.printStackTrace();
            }
        }
    }
    
    
    
    
    public ArrayList<Integer> tokenizerLigne(String ligne){
        ArrayList<Integer> motLigne = new  ArrayList<>();
        String delimiteurs = " ,.;";
        StringTokenizer tokenizer = new StringTokenizer(ligne, delimiteurs);
        while(tokenizer.hasMoreTokens()){
            String mot = tokenizer.nextToken();
            motLigne.add(Integer.parseInt(mot));
        }
        return motLigne;
    }
    
    public List<Integer> histogramme(){
        ArrayList<Integer> valeursLigne = new  ArrayList<>();
        ArrayList<Integer> hist = new ArrayList<>();
        // Initialisation de la liste :
        for(int i=0; i<255; i++){
            hist.add(0);
        }
        int count = 0;
        try{
            String ligne;
            BufferedReader fichier = new BufferedReader(new FileReader(source));
            ligne = fichier.readLine();
            count += 1;
            while (ligne != null){
                
                if (count>4){
                    
                    valeursLigne = tokenizerLigne(ligne);
                    for(Integer val:valeursLigne){
                        
                        hist.set(val, hist.get(val)+1);
                    }
                }
                ligne = fichier.readLine();
                count += 1;
                
            }
            fichier.close();
        } catch (Exception e){
            e.printStackTrace();;
        }
        return hist;
    }
    
}
