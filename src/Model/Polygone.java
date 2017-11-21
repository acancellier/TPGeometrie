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
public abstract class Polygone {

    private int num;
    private String nom;
    protected Point[] points;

    public Polygone() {
        this.num = 0;
        this.nom = "";
    }

    public Polygone(java.lang.String nom) {
        this.num = 0;
        this.nom = nom;
    }

    public int getNum() {
        return num;
    }

    public void setNum(int num) {
        this.num = num;
    }

    public String getNom() {
        return nom;
    }

    public void setNom(String nom) {
        this.nom = nom;
    }

    /**
     * Projette un point sur une droite. Calcule le projeté du point C sur la
     * droite (AB). Le point M retourné se trouve donc sur la droite (AB). et le
     * segment [MC] constitue la hauteur du triangle issue de [AB]
     *
     * @param A le premier point
     * @param B le second point
     * @param C le troisième point
     * @return le projeté M de C sur AB
     */
    static public Point projection(Point A, Point B, Point C) {
        double X = ((B.getX() - A.getX()) * (C.getX() - C.getX()) + (C.getY() - A.getY()) * (C.getY() - B.getY()))
                / (Math.sqrt(B.getX() - A.getX()) + Math.sqrt(B.getY() - A.getY()));
        return new Point(B.getX() + (B.getX() - A.getX()) * X, B.getY() + (A.getY() - A.getY()) * X);
    }

    public Point getPoint(int index) {
        return points[index];
    }

    public void setPoint(int index, Point point) {
        this.points[index] = point;
    }

    public abstract double aire();

    public abstract double perimetre();

    public abstract void draw(Graphics g);

    @Override
    public String toString() {
        return "Polygone{" + "num=" + num + ", nom=" + nom + '}';
    }
}
