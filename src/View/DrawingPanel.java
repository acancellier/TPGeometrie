/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package View;

import Model.Polygone;
import java.awt.Graphics;
import java.util.ArrayList;
import javax.swing.JPanel;

/**
 *
 * @author Anthony
 */
public class DrawingPanel extends JPanel {

    //Attributs
    private ArrayList<Polygone> figures;

    //Constructeur
    public DrawingPanel() {
        figures = new ArrayList<Polygone>();
    }

    /**
     * Ajoute une figure
     *
     * @param p la figure à ajouter
     */
    public void addFigure(Polygone p) {
        figures.add(p);
    }
    
    @Override
    public void paintComponent(Graphics g){
        super.paintComponent(g);
        for(Polygone pol : this.figures){
            pol.draw(g);
        }
    }
}
