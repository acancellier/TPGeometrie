/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Javametrie;

import Model.*;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;

/**
 *
 * @author Babs
 */
public class MainRentree {

    private BufferedWriter writer;
    private String nom;
    private String prenom;
    
    public void run() throws IOException {
        nom = "";
        prenom = "";
        Scanner sc = new Scanner(System.in);
        System.out.print("Votre nom : ");
        nom = sc.nextLine();
        System.out.print("Votre prenom : ");
        prenom = sc.nextLine();
        int nbTest = 0;
        int nbTestSuccess = 0;
        /*
            Le fichier est envoyé sur le disque Réception, vous ne pouvez pas réécrire sur ce fichier une fois qu'il a été crée
            Commentez la ligne ci-dessous, décommentez celle suivante et mettez un chemin approprié
         */
        String filename = "C:/Users/Julien/Documents/" + nom + "_" + prenom + ".txt";
        //String filename = "C:/VOTRE CHEMIN/" + nom + "_" + prenom + ".txt";

        System.out.println(filename);
        writer = new BufferedWriter(new FileWriter(new File(filename), true));
        writer.write(nom + " " + prenom + "\n\n");

        // Point
        // Segment
        // Carré
        // Rectangle
        // Losange
        // Triangle
        // Cercle
        
        /// CLASSES ///
        bPrint("####### CLASSES #######");
        try {
            nbTest++;
            Point p = new Point();
            bPrint("+ Point: Classe Point ok");
            nbTestSuccess++;
        } catch (Exception e) {
            bPrint("- Point: Pas de classe");
        }
        try {
            nbTest++;
            Segment s = new Segment();
            bPrint("+ Segment: Classe Segment ok");
            nbTestSuccess++;
        } catch (Exception e) {
            bPrint("- Segment: pas de classe");
        }
        try {
            nbTest++;
            Carre c = new Carre();
            bPrint("+ Carre: Classe Carre ok");
            nbTestSuccess++;
        } catch (Exception e) {
            bPrint("- Carre: Pas de classe");
        }
        try {
            nbTest++;
            Rectangle r = new Rectangle();
            bPrint("+ Rectangle: Classe Rectangle ok");
            nbTestSuccess++;
        } catch (Exception e) {
            bPrint("- Rectangle: Pas de classe");
        }
        try {
            nbTest++;
            Losange l = new Losange();
            bPrint("+ Losange: Classe Losange ok");
            nbTestSuccess++;
        } catch (Exception e) {
            bPrint("- Losange: Pas de classe");
        }
        try {
            nbTest++;
            Triangle t = new Triangle();
            bPrint("+ Triangle: Classe Triangle ok");
            nbTestSuccess++;
        } catch (Exception e) {
            bPrint("- Triangle: Pas de classe");
        }
        try {
            nbTest++;
            Cercle c = new Cercle();
            bPrint("+ Cercle: Classe Cercle ok");
            nbTestSuccess++;
        } catch (Exception e) {
            bPrint("- Cercle: Pas de classe");
        }
        /// - CLASSES - ///

        /// CONSTRUCTEURS ///
        bPrint("####### CONSTRUCTEURS #######");
        try {
            nbTest++;
            Point p = new Point(7.5, -8.2);
            bPrint("+ Point: Point(double, double) ok");
            nbTestSuccess++;
        } catch (Exception e) {
            bPrint("- Point: Pas de constructeur Point(double, double)");
        }
        try {
            nbTest++;
            Point p = new Point("P1", 7.5, -8.2);
            bPrint("+ Point: Point(String, double, double) ok");
            nbTestSuccess++;
        } catch (Exception e) {
            bPrint("- Point: Pas de constructeur Point(String, double, double)");
        }
        try {
            nbTest++;
            Point p1 = new Point(2.5, 5.5);
            Point p2 = new Point(5.5, 5.5);
            Segment s = new Segment(p1, p2);
            bPrint("+ Segment: Segment(Point, Point) ok");
            nbTestSuccess++;
        } catch (Exception e) {
            bPrint("- Point: Pas de constructeur Segment(Point, Point)");
        }
        try {
            nbTest++;
            Point p1 = new Point(2.5, 5.5);
            Point p2 = new Point(5.5, 5.5);
            Segment s = new Segment(p1, p2);
            bPrint("+ Segment: Segment(Point, Point) ok");
            nbTestSuccess++;
        } catch (Exception e) {
            bPrint("- Point: Pas de constructeur Segment(Point, Point)");
        }
        try {
            nbTest++;
            Point p1 = new Point(0, 0);
            Point p2 = new Point(0, 5);
            Point p3 = new Point(5, 5);
            Point p4 = new Point(5, 0);
            Carre c = new Carre(p1, p2, p3, p4);
            bPrint("+ Carre: Carre(Point, Point, Point, Point) ok");
            nbTestSuccess++;
        } catch (Exception e) {
            bPrint("- Carre: Pas de constructeur Carre(Point, Point, Point, Point)");
        }
        try {
            nbTest++;
            Point p1 = new Point(0, 0);
            Point p2 = new Point(0, 7);
            Point p3 = new Point(3, 7);
            Point p4 = new Point(3, 0);
            Rectangle r = new Rectangle(p1, p2, p3, p4);
            bPrint("+ Rectangle: Rectangle(Point, Point, Point, Point) ok");
            nbTestSuccess++;
        } catch (Exception e) {
            bPrint("- Rectangle: Pas de constructeur Rectangle(Point, Point, Point, Point)");
        }
        try {
            nbTest++;
            Point p1 = new Point(3, 0);
            Point p2 = new Point(0, 4);
            Point p3 = new Point(3, 8);
            Point p4 = new Point(6, 4);
            Losange l = new Losange(p1, p2, p3, p4);
            bPrint("+ Losange: Losange(Point, Point, Point, Point) ok");
            nbTestSuccess++;
        } catch (Exception e) {
            bPrint("- Losange: Pas de constructeur Losange(Point, Point, Point, Point)");
        }
        try {
            nbTest++;
            Point p1 = new Point(0, 0);
            Point p2 = new Point(0, 4);
            Point p3 = new Point(3, 0);
            Triangle t = new Triangle(p1, p2, p3);
            bPrint("+ Triangle: Triangle(Point, Point, Point) ok");
            nbTestSuccess++;
        } catch (Exception e) {
            bPrint("- Triangle: Pas de constructeur Triangle(Point, Point, Point)");
        }
        try {
            nbTest++;
            Cercle c = new Cercle(new Point(), 5.5);
            bPrint("+ Cercle: Cercle(Point, double) ok");
            nbTestSuccess++;
        } catch (Exception e) {
            bPrint("- Cercle: Pas de constructeur Cercle(Point, double)");
        }
        /// - CONSTRUCTEURS - ///

        /// GETTERS ///
        bPrint("####### GETTERS #######");
        try {
            nbTest++;
            Point p = new Point(7.5, -8.2);
            double x = p.getX();
            if (x == 7.5) {
                bPrint("+ Point: getter sur X ok");
                nbTestSuccess++;
            } else {
                bPrint("- Point: getter sur X mauvais");
            }
        } catch (Exception e) {
            bPrint("- Point: Pas de getter sur X");
        }
        try {
            nbTest++;
            Point p = new Point(7.5, -8.2);
            double y = p.getY();
            if (y == -8.2) {
                bPrint("+ Point: getter sur Y ok");
                nbTestSuccess++;
            } else {
                bPrint("- Point: getter sur Y mauvais");
            }
        } catch (Exception e) {
            bPrint("- Point: Pas de getter sur Y");
        }
        try {
            nbTest++;
            Point p = new Point("p1", 7.5, -8.2);
            String s = p.getNom();
            if ("p1".equals(s)) {
                bPrint("+ Point: getter sur nom ok");
                nbTestSuccess++;
            } else {
                bPrint("- Point: getter sur nom mauvais");
            }
        } catch (Exception e) {
            bPrint("- Point: Pas de getter sur nom");
        }
        try {
            nbTest++;
            Point p = new Point(7.5, -8.2);
            int s = p.getNumero();
            bPrint("+ Point: Getter sur numero ok");
            nbTestSuccess++;
        } catch (Exception e) {
            bPrint("- Point: Pas de getter sur numero");
        }
        try {
            nbTest++;
            Point p1 = new Point(0, 0);
            Point p2 = new Point(0, 5);
            Point p3 = new Point(5, 5);
            Point p4 = new Point(5, 0);
            Carre c = new Carre(p1, p2, p3, p4);
            Point p = c.getPoint(1);
            bPrint("+ Carre: Getter ok");
            nbTestSuccess++;
        } catch (Exception e) {
            bPrint("- Carre: Pas de getter");
        }   
        /// - GETTERS - ///

        /// SETTERS ///
        bPrint("####### SETTERS #######");
        try {
            nbTest++;
            Point p = new Point(7.5, -8.2);
            p.setX(9.56);
            double x = p.getX();
            if (x == 9.56) {
                bPrint("+ Point: setter sur X ok");
                nbTestSuccess++;
            } else {
                bPrint("- Point: setter sur X mauvais");
            }
        } catch (Exception e) {
            bPrint("- Point: Pas de setter sur X");
        }
        try {
            nbTest++;
            Point p = new Point(7.5, -8.2);
            p.setY(-12.5);
            double y = p.getY();
            if (y == -12.5) {
                bPrint("+ Point: setter sur Y ok");
                nbTestSuccess++;
            } else {
                bPrint("- Point: setter sur Y mauvais");
            }
        } catch (Exception e) {
            bPrint("- Point: Pas de setter sur Y");
        }
        try {
            nbTest++;
            Point p = new Point("p2", 7.5, -8.2);
            p.setNom("p2");
            String s = p.getNom();
            if ("p2".equals(s)) {
                bPrint("+ Point: setter sur nom ok");
                nbTestSuccess++;
            } else {
                bPrint("- Point: setter sur nom mauvais");
            }
        } catch (Exception e) {
            bPrint("- Point: Pas de setter sur nom");
        }
        try {
            nbTest++;
            Point p = new Point(7.5, -8.2);
            int s = p.setNumero(7);
            bPrint("- Point: Setter sur numero ne doit pas exister");
        } catch (Exception e) {
            bPrint("+ Point: Pas de setter sur numero");
            nbTestSuccess++;
        }
        try {
            nbTest++;
            Point p1 = new Point(0, 0);
            Point p2 = new Point(0, 5);
            Point p3 = new Point(5, 5);
            Point p4 = new Point(8, 0);
            Point p5 = new Point(5, 0);
            Carre c = new Carre(p1, p2, p3, p4);
            c.setPoint(3, p5);
            bPrint("+ Carre: Setter ok");
            nbTestSuccess++;
        } catch (Exception e) {
            bPrint("- Carre: Pas de Setter");
        }    
        /// - SETTERS - ///

        /// LONGUEUR ///
        bPrint("####### LONGUEUR #######");
        try {
            nbTest++;
            Point p1 = new Point(0, 0);
            Point p2 = new Point(3, 0);
            Segment s1 = new Segment(p1, p2);
            double r = s1.longueur();
            if (r == 3) {
                bPrint("+ Segment:  longueur() 0 ok");
                nbTestSuccess++;
            } else {
                bPrint("- Segment:  longueur() 0 mauvais");
            }
        } catch (Exception e) {
            bPrint("- Segment: Pas de methode longueur()");
        }
        try {
            nbTest++;
            Point p1 = new Point(0, 0);
            Point p2 = new Point(-3, -3);
            Segment s1 = new Segment(p1, p2);
            double r = s1.longueur();
            if (r - 3 * Math.sqrt(2) < 0.001) {
                bPrint("+ Segment:  longueur() 1 ok");
                nbTestSuccess++;
            } else {
                bPrint("- Segment:  longueur() 1 mauvais");
            }
        } catch (Exception e) {
            bPrint("- Segment: Pas de methode longueur()");
        }
        try {
            nbTest++;
            Point p1 = new Point(4, 3);
            Point p2 = new Point(4, 12);
            Segment s1 = new Segment(p1, p2);
            double r = s1.longueur();
            if (r == 9) {
                bPrint("+ Segment:  longueur() 2 ok");
                nbTestSuccess++;
            } else {
                bPrint("- Segment:  longueur() 2 mauvais");
            }
        } catch (Exception e) {
            bPrint("- Segment: Pas de methode longueur()");
        }
        try {
            nbTest++;
            Point p1 = new Point(0, 0);
            Point p2 = new Point(0, 5);
            Point p3 = new Point(5, 5);
            Point p4 = new Point(5, 0);
            Carre c = new Carre(p1, p2, p3, p4);
            double r = c.longueur();
            if (r == 5) {
                bPrint("+ Carre: longueur() ok");
                nbTestSuccess++;
            } else {
                bPrint("- Carre: longueur() mauvais");
            }
        } catch (Exception e) {
            bPrint("- Carre: Pas de methode longueur()");
        }
        try {
            nbTest++;
            Point p1 = new Point(0, 0);
            Point p2 = new Point(0, 7);
            Point p3 = new Point(3, 7);
            Point p4 = new Point(3, 0);
            Rectangle r = new Rectangle(p1, p2, p3, p4);
            double res = r.longueur();
            if (res == 7) {
                bPrint("+ Rectangle: longueur() ok");
                nbTestSuccess++;
            } else {
                bPrint("- Rectangle: longueur() mauvais");
            }
        } catch (Exception e) {
            bPrint("- Rectangle: Pas de methode longueur()");
        }
        try {
            nbTest++;
            Point p1 = new Point(0, 0);
            Point p2 = new Point(0, 7);
            Point p3 = new Point(3, 7);
            Point p4 = new Point(3, 0);
            Rectangle r = new Rectangle(p1, p2, p3, p4);
            double res = r.largeur();
            if (res == 3) {
                bPrint("+ Rectangle: largeur() ok");
                nbTestSuccess++;
            } else {
                bPrint("- Rectangle: largeur() mauvais");
            }
        } catch (Exception e) {
            bPrint("- Rectangle: Pas de methode largeur()");
        }
        try {
            nbTest++;
            Point p1 = new Point(3, 0);
            Point p2 = new Point(0, 4);
            Point p3 = new Point(3, 8);
            Point p4 = new Point(6, 4);
            Losange l = new Losange(p1, p2, p3, p4);
            double res = l.longueur();
            if (res == 5) {
                bPrint("+ Losange: longueur() ok");
                nbTestSuccess++;
            } else {
                bPrint("- Losange: longueur() mauvais");
            }
        } catch (Exception e) {
            bPrint("- Losange: Pas de methode longueur()");
        }
        /// - LONGUEUR - ///

        /// TOSTRING ///
        bPrint("####### TOSTRING #######");
        try {
            nbTest++;
            Point p = new Point("p2", 7.5, -8.2);
            String s = p.toString();
            bPrint("+ Point: toString ok");
            nbTestSuccess++;
        } catch (Exception e) {
            bPrint("- Point: Pas de toString");
        }
        try {
            nbTest++;
            Point p1 = new Point(2.5, 5.5);
            Point p2 = new Point(5.5, 8.5);
            Segment s1 = new Segment(p1, p2);
            String r = s1.toString();
            bPrint("+ Segment: toString ok");
            nbTestSuccess++;
        } catch (Exception e) {
            bPrint("- Segment: Pas de toString");
        }
        try {
            nbTest++;
            Point p1 = new Point(0, 0);
            Point p2 = new Point(0, 5);
            Point p3 = new Point(5, 5);
            Point p4 = new Point(5, 0);
            Carre c = new Carre(p1, p2, p3, p4);
            String r = c.toString();
            bPrint("+ Carre: toString ok");
            nbTestSuccess++;
        } catch (Exception e) {
            bPrint("- Carre: Pas de toString");
        }
        try {
            nbTest++;
            Point p1 = new Point(0, 0);
            Point p2 = new Point(0, 7);
            Point p3 = new Point(3, 7);
            Point p4 = new Point(3, 0);
            Rectangle r = new Rectangle(p1, p2, p3, p4);
            String res = r.toString();
            bPrint("+ Rectangle: toString ok");
            nbTestSuccess++;
        } catch (Exception e) {
            bPrint("- Rectangle: Pas de toString");
        }
        try {
            nbTest++;
            Point p1 = new Point(5, 0);
            Point p2 = new Point(0, 2);
            Point p3 = new Point(5, 4);
            Point p4 = new Point(10, 2);
            Losange l = new Losange(p1, p2, p3, p4);
            String res = l.toString();
            bPrint("+ Losange: toString ok");
            nbTestSuccess++;
        } catch (Exception e) {
            bPrint("- Losange: Pas de toString");
        }
        try {
            nbTest++;
            Point p1 = new Point(0, 0);
            Point p2 = new Point(0, 4);
            Point p3 = new Point(3, 0);
            Triangle t = new Triangle(p1, p2, p3);
            String res = t.toString();
            bPrint("+ Triangle: toString ok");
            nbTestSuccess++;
        } catch (Exception e) {
            bPrint("- Triangle: Pas de toString");
        }
        try {
            nbTest++;
            Point p1 = new Point(0, 0);
            Cercle c = new Cercle(p1, 5.5);
            String res = c.toString();
            bPrint("+ Cercle: toString ok");
            nbTestSuccess++;
        } catch (Exception e) {
            bPrint("- Cercle: Pas de toString");
        }
        /// - TOSTRING - ///
        
        
        /// PARALELLE ///
        bPrint("####### PARALELLE #######");
        try {
            nbTest++;
            Point p1 = new Point(0, 0);
            Point p2 = new Point(3, 0);
            Segment s1 = new Segment(p1, p2);
            Point p3 = new Point(2, 2);
            Point p4 = new Point(-5, 2);
            Segment s2 = new Segment(p3, p4);
            boolean r = s1.estParallele(s2);
            if (r) {
                bPrint("+ Segment:  estParallele(Segment) 1 ok");
                nbTestSuccess++;
            } else {
                bPrint("- Segment:  estParallele(Segment) 1 mauvais");
            }
        } catch (Exception e) {
            bPrint("- Segment: Pas de methode estParallele(Segment)");
        }
        try {
            nbTest++;
            Point p1 = new Point(0, 0);
            Point p2 = new Point(0, 6);
            Segment s1 = new Segment(p1, p2);
            Point p3 = new Point(2, 2);
            Point p4 = new Point(2, 0);
            Segment s2 = new Segment(p3, p4);
            boolean r = s1.estParallele(s2);
            if (r) {
                bPrint("+ Segment:  estParallele(Segment) 2 ok");
                nbTestSuccess++;
            } else {
                bPrint("- Segment:  estParallele(Segment) 2 mauvais");
            }
        } catch (Exception e) {
            bPrint("- Segment: Pas de methode estParallele(Segment)");
        }
        try {
            nbTest++;
            Point p1 = new Point(2.5, 5.5);
            Point p2 = new Point(5.5, 7.5);
            Segment s1 = new Segment(p1, p2);
            Point p3 = new Point(8, 1);
            Point p4 = new Point(14, 5);
            Segment s2 = new Segment(p3, p4);
            boolean r = s1.estParallele(s2);
            if (r) {
                bPrint("+ Segment:  estParallele(Segment) 3 ok");
                nbTestSuccess++;
            } else {
                bPrint("- Segment:  estParallele(Segment) 3 mauvais");
            }
        } catch (Exception e) {
            bPrint("- Segment: Pas de methode estParallele(Segment)");
        }
        /// - PARALELLE - ///
        
        /// PERPENDICULAIRE ///
        bPrint("####### PERPENDICULAIRE #######");
        try {
            nbTest++;
            Point p1 = new Point(0, 0);
            Point p2 = new Point(5, 0);
            Segment s1 = new Segment(p1, p2);
            Point p3 = new Point(5, -2);
            Point p4 = new Point(0, 12);
            Segment s2 = new Segment(p3, p4);
            boolean r = s1.estPerpendiculaire(s2);
            if (!r) {
                bPrint("+ Segment:  estPerpendiculaire(Segment) 0 ok");
                nbTestSuccess++;
            } else {
                bPrint("- Segment:  estPerpendiculaire(Segment) 0 mauvais");
            }
        } catch (Exception e) {
            bPrint("- Segment: Pas de methode estPerpendiculaire(Segment)");
        }
        try {
            nbTest++;
            Point p1 = new Point(0, 0);
            Point p2 = new Point(5, 0);
            Segment s1 = new Segment(p1, p2);
            Point p3 = new Point(0, 0);
            Point p4 = new Point(0, 12);
            Segment s2 = new Segment(p3, p4);
            boolean r = s1.estPerpendiculaire(s2);
            if (r) {
                bPrint("+ Segment:  estPerpendiculaire(Segment) 1 ok");
                nbTestSuccess++;
            } else {
                bPrint("- Segment:  estPerpendiculaire(Segment) 1 mauvais");
            }
        } catch (Exception e) {
            bPrint("- Segment: Pas de methode estPerpendiculaire(Segment)");
        }
        try {
            nbTest++;
            Point p1 = new Point(2.5, 5.5);
            Point p2 = new Point(5.5, 8.5);
            Segment s1 = new Segment(p1, p2);
            Point p3 = new Point(8, 1);
            Point p4 = new Point(13, 6);
            Segment s2 = new Segment(p3, p4);
            boolean r = s1.estPerpendiculaire(s2);
            if (!r) {
                bPrint("+ Segment:  estPerpendiculaire(Segment) 2 ok");
                nbTestSuccess++;
            } else {
                bPrint("- Segment:  estPerpendiculaire(Segment) 2 mauvais");
            }
        } catch (Exception e) {
            bPrint("- Segment: Pas de methode estPerpendiculaire(Segment)");
        }
        /// - PERPENDICULAIRE - ///
        
        
        /// AIRE ///
        bPrint("####### AIRE #######");
        try {
            nbTest++;
            Point p1 = new Point(2.5, 5.5);
            Point p2 = new Point(5.5, 8.5);
            Segment s1 = new Segment(p1, p2);
            double r = s1.aire();
            bPrint("+ Segment: aire() ok");
            nbTestSuccess++;
        } catch (Exception e) {
            bPrint("- Segment: Pas de methode aire()");
        }
        try {
            nbTest++;
            Point p1 = new Point(0, 0);
            Point p2 = new Point(0, 5);
            Point p3 = new Point(5, 5);
            Point p4 = new Point(5, 0);
            Carre c = new Carre(p1, p2, p3, p4);
            double r = c.aire();
            if (r == 25) {
                bPrint("+ Carre: aire() ok");
                nbTestSuccess++;
            } else {
                bPrint("- Carre: aire() mauvais");
            }
        } catch (Exception e) {
            bPrint("- Carre: Pas de methode aire()");
        }
        try {
            nbTest++;
            Point p1 = new Point(0, 0);
            Point p2 = new Point(0, 7);
            Point p3 = new Point(3, 7);
            Point p4 = new Point(3, 0);
            Rectangle r = new Rectangle(p1, p2, p3, p4);
            double res = r.aire();
            if (res == 21) {
                bPrint("+ Rectangle: aire() ok");
                nbTestSuccess++;
            } else {
                bPrint("- Rectangle: aire() mauvais");
            }
        } catch (Exception e) {
            bPrint("- Rectangle: Pas de methode aire()");
        }
        try {
            nbTest++;
            Point p1 = new Point(3, 0);
            Point p2 = new Point(0, 4);
            Point p3 = new Point(3, 8);
            Point p4 = new Point(6, 4);
            Losange l = new Losange(p1, p2, p3, p4);
            double res = l.aire();
            if (res == 24) {
                bPrint("+ Losange: aire() ok");
                nbTestSuccess++;
            } else {
                bPrint("- Losange: aire() mauvais");
            }
        } catch (Exception e) {
            bPrint("- Losange: Pas de methode aire()");
        }
        try {
            nbTest++;
            Point p1 = new Point(0, 0);
            Point p2 = new Point(0, 4);
            Point p3 = new Point(3, 0);
            Triangle t = new Triangle(p1, p2, p3);
            double res = t.aire();
            if (res == 10) {
                bPrint("+ Triangle: aire() ok");
                nbTestSuccess++;
            } else {
                bPrint("- Triangle: aire() mauvais");
            }
        } catch (Exception e) {
            bPrint("- Triangle: Pas de methode aire()");
        }
        try {
            nbTest++;
            Cercle c = new Cercle(new Point(), 5.5);
            double p = c.aire();
            if (Math.abs(p - Math.PI * 5.5 * 5.5) < 0.001) {
                bPrint("+ Cercle: aire ok");
                nbTestSuccess++;
            } else {
                bPrint("- Cercle: aire mauvais");
            }
        } catch (Exception e) {
            bPrint("- Cercle: Pas de méthode aire");
        }
        /// - AIRE - ///
        
        /// PERIMETRE ///    
        bPrint("####### PERIMETRE #######");
        try {
            nbTest++;
            Point p1 = new Point(2.5, 5.5);
            Point p2 = new Point(5.5, 8.5);
            Segment s1 = new Segment(p1, p2);
            double r = s1.perimetre();
            bPrint("+ Segment: perimetre() ok");
            nbTestSuccess++;
        } catch (Exception e) {
            bPrint("- Segment: Pas de methode perimetre()");
        }
        try {
            nbTest++;
            Point p1 = new Point(0, 0);
            Point p2 = new Point(0, 5);
            Point p3 = new Point(5, 5);
            Point p4 = new Point(5, 0);
            Carre c = new Carre(p1, p2, p3, p4);
            double r = c.perimetre();
            if (r == 20) {
                bPrint("+ Carre: perimetre() ok");
                nbTestSuccess++;
            } else {
                bPrint("- Carre: perimetre() mauvais");
            }
        } catch (Exception e) {
            bPrint("- Carre: Pas de methode perimetre()");
        }
        try {
            nbTest++;
            Point p1 = new Point(0, 0);
            Point p2 = new Point(0, 7);
            Point p3 = new Point(3, 7);
            Point p4 = new Point(3, 0);
            Rectangle r = new Rectangle(p1, p2, p3, p4);
            double res = r.perimetre();
            if (res == 20) {
                bPrint("+ Rectangle: perimetre() ok");
                nbTestSuccess++;
            } else {
                bPrint("- Rectangle: perimetre() mauvais");
            }
        } catch (Exception e) {
            bPrint("- Rectangle: Pas de methode perimetre()");
        }
        try {
            nbTest++;
            Point p1 = new Point(3, 0);
            Point p2 = new Point(0, 4);
            Point p3 = new Point(3, 8);
            Point p4 = new Point(6, 4);
            Losange l = new Losange(p1, p2, p3, p4);
            double res = l.perimetre();
            if (res == 20) {
                bPrint("+ Losange: perimetre() ok");
                nbTestSuccess++;
            } else {
                bPrint("- Losange: perimetre() mauvais");
            }
        } catch (Exception e) {
            bPrint("- Losange: Pas de methode perimetre()");
        }
        try {
            nbTest++;
            Point p1 = new Point(0, 0);
            Point p2 = new Point(0, 4);
            Point p3 = new Point(3, 0);
            Triangle t = new Triangle(p1, p2, p3);
            double res = t.perimetre();
            if (res == 12) {
                bPrint("+ Triangle: perimetre() ok");
                nbTestSuccess++;
            } else {
                bPrint("- Triangle: perimetre() mauvais");
            }
        } catch (Exception e) {
            bPrint("- Triangle: Pas de methode perimetre()");
        }
        try {
            nbTest++;
            Cercle c = new Cercle(new Point(), 5.5);
            double p = c.perimetre();
            if (Math.abs(p - Math.PI * 2 * 5.5) < 0.001) {
                bPrint("+ Cercle: perimetre ok");
                nbTestSuccess++;
            } else {
                bPrint("- Cercle: perimetre mauvais");
            }
        } catch (Exception e) {
            bPrint("- Cercle: Pas de méthode perimetre");
        }
        /// - PERIMETRE ///
        
        
        /// HERITAGE ///
        bPrint("####### HERITAGE #######");
        try {
            nbTest++;
            Point p1 = new Point(2.5, 5.5);
            Point p2 = new Point(5.5, 8.5);
            Segment s1 = new Segment(p1, p2);
            String r = s1.getClass().getSuperclass().toString();
            if (r.equals("class Model.Polygone")) {
                bPrint("+ Segment: héritage ok");
            } else {
                bPrint("- Segment: héritage mauvais");
            }
            nbTestSuccess++;
        } catch (Exception e) {
            bPrint("- Segment: Erreur héritage");
        }
        try {
            nbTest++;
            Point p1 = new Point(0, 0);
            Point p2 = new Point(0, 5);
            Point p3 = new Point(5, 5);
            Point p4 = new Point(5, 0);
            Carre c = new Carre(p1, p2, p3, p4);
            String r = c.getClass().getSuperclass().toString();
            if (r.equals("class Model.Polygone")) {
                bPrint("+ Carre: héritage ok");
            } else {
                bPrint("- Carre: héritage mauvais");
            }
            nbTestSuccess++;
        } catch (Exception e) {
            bPrint("- Carre: Erreur héritage");
        }        
        try {
            nbTest++;
            Point p1 = new Point(0, 0);
            Point p2 = new Point(4, 7);
            Point p3 = new Point(3, 7);
            Point p4 = new Point(3, 11);
            Rectangle c = new Rectangle(p1, p2, p3, p4);
            String r = c.getClass().getSuperclass().toString();
            if (r.equals("class Model.Polygone")) {
                bPrint("+ Rectangle: héritage ok");
            } else {
                bPrint("- Rectangle: héritage mauvais");
            }
            nbTestSuccess++;
        } catch (Exception e) {
            bPrint("- Rectangle: Erreur héritage");
        } try {
            nbTest++;
            Point p1 = new Point(5, 0);
            Point p2 = new Point(0, 2);
            Point p3 = new Point(5, 4);
            Point p4 = new Point(10, 2);
            Losange l = new Losange(p1, p2, p3, p4);
            String r = l.getClass().getSuperclass().toString();
            if (r.equals("class Model.Polygone")) {
                bPrint("+ Losange: héritage ok");
            } else {
                bPrint("- Losange: héritage mauvais");
            }
            nbTestSuccess++;
        } catch (Exception e) {
            bPrint("- Rectangle: Erreur héritage");
        }
        try {
            nbTest++;
            Point p1 = new Point(0, 0);
            Point p2 = new Point(0, 4);
            Point p3 = new Point(3, 0);
            Triangle t = new Triangle(p1, p2, p3);
            String r = t.getClass().getSuperclass().toString();
            if (r.equals("class Model.Polygone")) {
                bPrint("+ Triangle: héritage ok");
            } else {
                bPrint("- Triangle: héritage mauvais");
            }
            nbTestSuccess++;
        } catch (Exception e) {
            bPrint("- Triangle: Erreur héritage");
        }
        try {
            nbTest++;
            Point p1 = new Point(0, 0);
            Cercle c = new Cercle(p1, 5.5);
            String r = c.getClass().getSuperclass().toString();
            if (r.equals("class Model.Polygone")) {
                bPrint("+ Cercle: héritage ok");
            } else {
                bPrint("- Cercle: héritage mauvais");
            }
            nbTestSuccess++;
        } catch (Exception e) {
            bPrint("- Cercle: Erreur héritage");
        }
        /// - HERITAGE ///
        
        
        /// ESTVALIDE ///
        bPrint("####### VALIDITE #######");
        try {
            nbTest++;
            Point p1 = new Point(0, 0);
            Point p2 = new Point(0, 7);
            Point p3 = new Point(3, 7);
            Point p4 = new Point(3, 0);
            Carre r = new Carre(p1, p2, p3, p4);
            boolean res = r.estValide();
            if (!res) {
                bPrint("+ Carre: estValide() 1 ok");
                nbTestSuccess++;
            } else {
                bPrint("- Carre: estValide() 1 mauvais");
            }
        } catch (Exception e) {
            bPrint("- Carre: Pas de methode estValide()");
        }        
        try {
            nbTest++;
            Point p1 = new Point(0, 0);
            Point p2 = new Point(0, 7);
            Point p3 = new Point(3, 7);
            Point p4 = new Point(3, 0);
            Rectangle r = new Rectangle(p1, p2, p3, p4);
            boolean res = r.estValide();
            if (res) {
                bPrint("+ Rectangle: estValide() 0 ok");
                nbTestSuccess++;
            } else {
                bPrint("- Rectangle: estValide() 0 mauvais");
            }
        } catch (Exception e) {
            bPrint("- Rectangle: Pas de methode estValide()");
        }
        try {
            nbTest++;
            Point p1 = new Point(0, 0);
            Point p2 = new Point(4, 7);
            Point p3 = new Point(3, 7);
            Point p4 = new Point(3, 11);
            Rectangle r = new Rectangle(p1, p2, p3, p4);
            boolean res = r.estValide();
            if (!res) {
                bPrint("+ Rectangle: estValide() 1 ok");
                nbTestSuccess++;
            } else {
                bPrint("- Rectangle: estValide() 1 mauvais");
            }
        } catch (Exception e) {
            bPrint("- Rectangle: Pas de methode estValide()");
        }
        try {
            nbTest++;
            Point p1 = new Point(0, 0);
            Point p2 = new Point(0, 7);
            Point p3 = new Point(7, 7);
            Point p4 = new Point(7, 0);
            Losange r = new Losange(p1, p2, p3, p4);
            boolean res = r.estValide();
            if (res) {
                bPrint("+ Losange: estValide() 0 ok");
                nbTestSuccess++;
            } else {
                bPrint("- Losange: estValide() 0 mauvais");
            }
        } catch (Exception e) {
            bPrint("- Losange: Pas de methode estValide()");
        }
        try {
            nbTest++;
            Point p1 = new Point(0, 0);
            Point p2 = new Point(0, 7);
            Point p3 = new Point(3, 7);
            Point p4 = new Point(3, 0);
            Losange r = new Losange(p1, p2, p3, p4);
            boolean res = r.estValide();
            if (!res) {
                bPrint("+ Losange: estValide() 1 ok");
                nbTestSuccess++;
            } else {
                bPrint("- Losange: estValide() 1 mauvais");
            }
        } catch (Exception e) {
            bPrint("- Losange: Pas de methode estValide()");
        }
        try {
            nbTest++;
            Point p1 = new Point(0, 0);
            Point p2 = new Point(0, 3);
            Point p3 = new Point(3, 0);
            Triangle t = new Triangle(p1, p2, p3);
            boolean res = t.estValide();
            if (res) {
                bPrint("+ Triangle: estValide() 0 ok");
                nbTestSuccess++;
            } else {
                bPrint("- Triangle: estValide() 0 mauvais");
            }
        } catch (Exception e) {
            bPrint("- Triangle: Pas de methode estValide()");
        }
        try {
            nbTest++;
            Cercle c = new Cercle(new Point(), 5.5);
            boolean res = c.estValide();
            if (res) {
                bPrint("+ Cercle: estValide() 0 ok");
                nbTestSuccess++;
            } else {
                bPrint("- Cercle: estValide() 0 mauvais");
            }
        } catch (Exception e) {
            bPrint("- Cercle: Pas de methode estValide()");
        }
        try {
            nbTest++;
            Point p1 = new Point(0, 0);
            Point p2 = new Point(0, 3);
            Point p3 = new Point(3, 0);
            Triangle t = new Triangle(p1, p2, p3);
            boolean res = t.estIsocele();
            if (res) {
                bPrint("+ Triangle: estIsocele() ok");
                nbTestSuccess++;
            } else {
                bPrint("- Triangle: estIsocele() mauvais");
            }
        } catch (Exception e) {
            bPrint("- Triangle: Pas de methode estIsocele()");
        }
        try {
            nbTest++;
            Point p1 = new Point(0, 0);
            Point p2 = new Point(0, 3);
            Point p3 = new Point(3, 0);
            Triangle t = new Triangle(p1, p2, p3);
            boolean res = t.estRectangle();
            if (res) {
                bPrint("+ Triangle: estRectangle() ok");
                nbTestSuccess++;
            } else {
                bPrint("- Triangle: estRectangle() mauvais");
            }
        } catch (Exception e) {
            bPrint("- Triangle: Pas de methode estRectangle()");
        }
        try {
            nbTest++;
            Point p1 = new Point(0, 0);
            Point p2 = new Point(0, 3);
            Point p3 = new Point(3, 0);
            Triangle t = new Triangle(p1, p2, p3);
            boolean res = t.estEquilateral();
            if (!res) {
                bPrint("+ Triangle: estEquilateral() ok");
                nbTestSuccess++;
            } else {
                bPrint("- Triangle: estEquilateral() mauvais");
            }
        } catch (Exception e) {
            bPrint("- Triangle: Pas de methode estEquilateral()");
        }
        /// - ESTVALIDE ///
        
        bPrint("\n####### RESULTATS #######");
        bPrint("Nombre total de tests: " + nbTest);
        bPrint("Nombre total de tests passés: " + nbTestSuccess);
        bPrint("Note sur 20 : " + (double) nbTestSuccess * 20 / nbTest);

        writer.close();
    }
    
    public void bPrint(String s) throws IOException {
        System.out.println(s);
        writer.write(s+"\n");
    }
}
