package com.company;
import java.lang.Math;
/**
 * Created by jordi on 14/02/2018.
 */
public class Cercle extends Figures
{
    private double r;
    public double area()
    {
        double a;
        a = 2*Math.PI*r;
        return a;
    }
}
