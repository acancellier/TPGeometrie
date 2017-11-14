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
public class Triangle extends Polygone{

  
    public Triangle() {
        points = new Point[3];
        for (int i = 0; i < points.length; i++) {
            points[i] = new Point();
        }

    }

    public Triangle(Point p1, Point p2, Point p3) {
        points = new Point[3];
        points[0] = p1;
        points[1] = p2;
        points[2] = p3;
    }

    public boolean estEquilateral() {
        Segment segment1 = new Segment(points[0], points[1]);
        Segment segment2 = new Segment(points[1], points[2]);
        Segment segment3 = new Segment(points[0], points[2]);
        double long1 = segment1.longueur();
        double long2 = segment2.longueur();
        double long3 = segment3.longueur();

        if (long1 == long2) {
            if (long2 == long3) {
                return true;
            } else {
                return false;
            }
        } else {
            return false;
        }
    }

    public boolean estIsocele() {
        Segment segment1 = new Segment(points[0], points[1]);
        Segment segment2 = new Segment(points[1], points[2]);
        Segment segment3 = new Segment(points[0], points[2]);
        double long1 = segment1.longueur();
        double long2 = segment2.longueur();
        double long3 = segment3.longueur();

        if (long1 == long2) {
            return true;
        }
        if (long1 == long3) {
            return true;
        }
        if (long3 == long2) {
            return true;
        }

        return false;

    }

    public boolean estRectangle() {
        Segment segment1 = new Segment(points[0], points[1]);
        Segment segment2 = new Segment(points[1], points[2]);
        Segment segment3 = new Segment(points[0], points[2]);
        double long1 = segment1.longueur();//AB
        double long2 = segment2.longueur();//BC
        double long3 = segment3.longueur();//AC

        if ((long1 * long1) - ((long2 * long2) + (long3 * long3))<0.01) {
                    return true;
                }
        if ((long2 * long2) - ((long1 * long1) + (long3 * long3))<0.01) {
                    return true;
                }
        if ((long3 * long3) - ((long2 * long2) + (long1 * long1))<0.01) {
                    return true;
                }
        return false;
    }

    public double aire() {
        Point M=Polygone.projection(points[0], points[1], points[2]);
        Segment base = new Segment(points[0], points[1]);
        Segment hauteur=new Segment(M,points[2]);
        
        double aire=(base.longueur()*hauteur.longueur())/2;
        return aire;
    }

    public double perimetre() {
        double somme = 0;
        Segment segment1 = new Segment(points[0], points[1]);
        Segment segment2 = new Segment(points[1], points[2]);
        Segment segment3 = new Segment(points[0], points[2]);

        somme += segment1.longueur();
        somme += segment2.longueur();
        somme += segment3.longueur();
        return somme;
    }
    
    public boolean estValide(){
        return true;
    }
    @Override
    public String toString() {
        return "Triangle{" + "points=" + points + '}';
    }

}
