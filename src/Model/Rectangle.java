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
public class Rectangle extends Polygone{

    private Point[] points;

    public Rectangle() {
        points = new Point[4];
        for (int i = 0; i < points.length; i++) {
            points[i] = new Point();
        }
    }

    public Rectangle(Point p1, Point p2, Point p3, Point p4) {
        points = new Point[4];
        points[0] = p1;
        points[1] = p2;
        points[2] = p3;
        points[3] = p4;
    }

    public Point getPoint1(int index) {
        return points[index];
    }

    public void setPoint1(int index, Point point) {
        this.points[index] = point;
    }

    public double longueur() {
        Segment segment = new Segment(points[0], points[1]);
        double lg = segment.longueur();
        return lg;
    }

    public double largeur() {
        Segment segment = new Segment(points[1], points[2]);
        double lg = segment.longueur();
        return lg;
    }
     public double aire(){
        double aire;
        aire = longueur()*largeur();
        return (float) aire;
    }
    
    public double perimetre(){
        return (longueur()*2+largeur()*2);
    }
    
    public boolean estValide(){
        Segment s1= new Segment(points[0],points[1]);
        Segment s2= new Segment(points[1],points[2]);
        Segment s3= new Segment(points[2],points[3]);
        Segment s4= new Segment(points[3],points[0]);
        
        if(s1.estPerpendiculaire(s2)&&s2.estPerpendiculaire(s3)&&s3.estPerpendiculaire(s4)){
            if(s1.longueur()==s3.longueur()&&s2.longueur()==s4.longueur()){
                return true;
            }
        }
        return false;
    }

    @Override
    public String toString() {
        return "Rectangle{" + "points=" + points + '}';
    }

}
