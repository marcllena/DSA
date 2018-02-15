package com.company;
import java.util.Arrays;

import static com.company.GestorFigures.*;

public class Main {

    public static void main(String[] args)
    {
        double radi = 2;
        double costat1 = 4;
        double costat2 = 5;
        double base = 3;
        double h = 2;
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
        System.out.println("Hola, el total de les arees es: "+suma+". El ordre es el seguent: "+ Arrays.toString(figs));

    }
}
