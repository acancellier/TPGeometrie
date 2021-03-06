/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Model;

import java.awt.Graphics;

/**
 *
 * @author csnd2342
 */
public class Segment extends Polygone{

    public Segment(){
        points = new Point[2];
        points[0] = new Point();
        points[1] = new Point();                
    }
    
    public Segment(Point p1,Point p2){
        points = new Point[2];
        this.points[0] = p1;
        this.points[1] = p2;                
    }
    
    public double longueur(){
         
        double a = Math.abs(((points[0].getX() - points[1].getX())*(points[0].getX() - points[1].getX())));
        double b = Math.abs(((points[0].getY() - points[1].getY())*(points[0].getY() - points[1].getY())));
        double longueur = Math.sqrt(a + b);
        return longueur;
    }
    

    public boolean estParallele(Segment s) 
    {
        double coef1 = Math.abs((points[1].getY() - points[0].getY())  / (points[1].getX() - points[0].getX()));
        double coef2 = Math.abs((s.points[1].getY() - s.points[0].getY())/(s.points[1].getX() - s.points[0].getX()));
        
        
        if (coef1 == coef2) 
        {
            return true;
        } 
        else 
        {
            return false;
        }
    }
    
    public boolean estPerpendiculaire(Segment s)
    {
        double vec1X = (points[1].getX() - points[0].getX());
        double vec1Y = (points[1].getY() - points[0].getY());
        
        double vec2X = (s.points[1].getX() - s.points[0].getX());
        double vec2Y = (s.points[1].getY() - s.points[0].getY());
        
        if(vec1X * vec2X + vec1Y * vec2Y == 0)
        {
            return true;
        }
        else
        {
            return false;
        }
                
    }
    
    public double aire(){
        return 0;
    }
    
    public double perimetre(){
        return this.longueur();
    }
    
    public Point versVecteur(Segment s){
        Point vecteur= new Point();
        double vec1X = (points[1].getX() - points[0].getX());
        double vec1Y = (points[1].getY() - points[0].getY());
        
        double vec2X = (s.points[1].getX() - s.points[0].getX());
        double vec2Y = (s.points[1].getY() - s.points[0].getY());
        
        vecteur.setX(vec2X-vec1X);
        vecteur.setY(vec2Y-vec1Y);
        return vecteur;
    }
    @Override
    public String toString() {
        return "Segment{" + "points=" + points + '}';
    }

    @Override
    public void draw(Graphics g) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
}