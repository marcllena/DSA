package com.company;
import static com.company.GestorFigures.*;

public class Main {

    public static void main(String[] args)
    {
        int radi = 2;
        int costat1 = 4;
        int costat2 = 5;
        int base = 3;
        int h = 2;
        Cercle cerc = new Cercle(radi);
        Rectangle rect = new Rectangle(costat1, costat2);
        Quadrat quadr = new Quadrat(costat1);
        Triangle triang = new Triangle(base, h);
        Figures[] figs = new Figures[4];
        figs[0] = cerc;
        figs[1] = rect;
        figs[2] = quadr;
        figs[3] = triang;
        double suma;
        suma = suma(figs);
        ordre(figs);

    }
}
