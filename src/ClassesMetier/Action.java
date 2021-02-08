/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ClassesMetier;

import java.util.ArrayList;

/**
 *
 * @author jacqu
 */
public class Action
{
    // A vous de jouer
    private int IdAction;
    private String NomAction;
    private double CoursReel;
    private double PrixAchat;
    private int QuantiteAchete;
    private ArrayList<Trader> mesTraders;
   

    /**
     * @return the NumAction
     */
    
    public Action( int unId,String unNom, double unCour, double unPrix, int uneQuantite)
    {
        IdAction= unId;
       NomAction  = unNom;
        CoursReel =unCour;
        PrixAchat = unPrix;
       QuantiteAchete=  uneQuantite;
       mesTraders = new ArrayList<>();
    }
    public int getNumAction() {
        return IdAction;
    }

    /**
     * @return the NomAction
     */
    public String getNomAction() {
        return NomAction;
    }

    /**
     * @return the CoursReel
     */
    public double getCoursReel() {
        return CoursReel;
    }

    /**
     * @return the PrixAchat
     */
    public double getPrixAchat() {
        return PrixAchat;
    }

    /**
     * @return the QuantiteAchete
     */
    public int getQuantiteAchete() {
        return QuantiteAchete;
    }

    /**
     * @param QuantiteAchete the QuantiteAchete to set
     */
    public void setQuantiteAchete(int QuantiteAchete) {
        this.QuantiteAchete = QuantiteAchete;
    }

    /**
     * @return the mesTraders
     */
    public ArrayList<Trader> getMesTraders() {
        return mesTraders;
    }

    /**
     * @return the LesActions
     */
   

    /**
     * @return the LesAction
     */
  
    
    
    
    
}
