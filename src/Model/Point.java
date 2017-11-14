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
public class Point {
    private double x;
    private double y;
    private String nom;
    private final int numero;
    public static int cpt_num;
    
    public Point(){
        Random valeur = new Random();
        this.x = valeur.nextInt(500);
        this.y = valeur.nextInt(400);
        this.nom = "";
        ++cpt_num;
        this.numero = cpt_num;      
    }
    
    public Point(double x1,double y1){
        this.x = x1;
        this.y = y1;
        this.nom = "";
        ++cpt_num;
        this.numero = cpt_num;     
    }
    
    public Point(String n, double X , double Y ){
        this.x = X;
        this.y = Y;
        this.nom = n;
        ++cpt_num;
        this.numero = cpt_num;    
    }
    
        public double getX() {
        return x;
    }

    public void setX(double x) {
        this.x = x;
    }

    public double getY() {
        return y;
    }

    public void setY(double y) {
        this.y = y;
    }

    public String getNom() {
        return nom;
    }

    public void setNom(String nom) {
        this.nom = nom;
    }

    public int getNumero() {
        return numero;
    }


    @Override
    public String toString() {
        return "point{" + "x=" + x + ", y=" + y + ", nom=" + nom + ", numero=" + numero + '}';
    }
    
    
}