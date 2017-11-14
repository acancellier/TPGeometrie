/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Model;

/**
 *
 * @author csnd2342
 */
public class Carre extends Polygone{
    private Point[] points;
    
    
    public Carre(){
        points = new Point[4];
        for (int i = 0; i < points.length; i++) {
            points[i] = new Point();
        }
        
    }
    
    public Carre(Point p1,Point p2, Point p3, Point p4){
        points = new Point[4];
        points[0] = p1;
        points[1] = p2;
        points[2] = p3;
        points[3] = p4;
    }

    public Point getPoint(int index) {
        return points[index];
    }

    public void setPoint(int index, Point point) {
        points[index] = point;
    }


    public double longueur(){
        Segment cote = new Segment(points[0], points[1]);
        double lg=cote.longueur();
        return lg;
    }
    
    public double aire(){
        double aire;
        Segment cote1 = new Segment(points[0], points[1]);
        Segment cote2 = new Segment(points[0], points[3]);
        aire = cote1.longueur()*cote2.longueur();
        return aire;
    }
    
    public double perimetre(){
        double peri;
        Segment cote = new Segment(points[0], points[1]);
        
        peri = cote.longueur()*4;
        
        return peri;
    }
    public boolean estValide(){
        Segment s1= new Segment(points[0],points[1]);
        Segment s2= new Segment(points[1],points[2]);
        Segment s3= new Segment(points[2],points[3]);
        Segment s4= new Segment(points[3],points[0]);
        
        if(s1.estPerpendiculaire(s2)&&s2.estPerpendiculaire(s3)&&s3.estPerpendiculaire(s4)){
            if(s1.longueur()==s2.longueur()){
                return true;
            }
        }
        return false;
    }
    @Override
    public String toString() {
        return "Carre{" + "points=" + points + '}';
    }
}