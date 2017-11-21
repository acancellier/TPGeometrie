/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Javametrie;

/**
 *
 * @author Anthony
 */
import Model.Point;
import Model.Rectangle;
import Model.Carre;
import Model.Cercle;
import Model.Losange;
import Model.Polygone;
import Model.Segment;
import Model.Triangle;
import View.Fenetre;
import java.io.IOException;

public class Javametrie {

    public static void main(String[] args) throws IOException {
        /*MainRentree mr=new MainRentree();
        mr.run();*/
        Fenetre f = new Fenetre();     
        Rectangle r = new Rectangle (
                new Point(50,50),
                new Point(50,250),
                new Point(150,250),
                new Point(150,50));
        f.addFigure(r);
        f.setVisible(true);
    }

}
