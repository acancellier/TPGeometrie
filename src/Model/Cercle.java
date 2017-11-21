/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Model;

import java.awt.Graphics;
import java.util.Random;

/**
 *
 * @author csnd2342
 */
public class Cercle extends Polygone {

    private double rayon;

    public Cercle() {
        points = new Point[1];
        this.rayon = 10;
    }

    public Cercle(Point centre, double rayon) {
        points = new Point[1];
        this.points[0] = centre;
        this.rayon = rayon;
    }

    public double getRayon() {
        return rayon;
    }

    public void setRayon(double rayon) {
        this.rayon = rayon;
    }

    public double perimetre() {
        return Math.PI * rayon * 2;
    }

    public double aire() {
        return Math.PI * rayon * rayon;
    }

    public boolean estValide() {
        return true;
    }

    @Override
    public void draw(Graphics g) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public String toString() {
        return "Cercle{" + "rayon=" + rayon + '}';
    }

}
