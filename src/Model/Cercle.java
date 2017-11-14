/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Model;

import java.util.Random;

/**
 *
 * @author csnd2342
 */
public class Cercle extends Polygone{
    private Point centre;
    private double rayon;

    public Cercle() {
        centre= new Point();
        Random valeur = new Random();
        this.rayon= valeur.nextInt(20)-10;
    }

    public Cercle(Point centre, double rayon) {
        this.centre = centre;
        this.rayon = rayon;
    }
    

    public Point getCentre() {
        return centre;
    }

    public void setCentre(Point centre) {
        this.centre = centre;
    }

    public double getRayon() {
        return rayon;
    }

    public void setRayon(double rayon) {
        this.rayon = rayon;
    }
    public double perimetre(){
        return Math.PI*rayon*2;
    }
    public double aire(){
        return Math.PI*rayon*rayon;
    }
    public boolean estValide(){
    return true;
    }
    @Override
    public String toString() {
        return "Cercle{" + "centre=" + centre + ", rayon=" + rayon + '}';
    }
    
}
