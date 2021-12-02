
import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import org.centrale.tp3medev.TraiterImage;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author admin
 */
public class LireImg {
    private String source;
    
    public LireImg(String s){
        this.source = s;
        lecture();
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

}
