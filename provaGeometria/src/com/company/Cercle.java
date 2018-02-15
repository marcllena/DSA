package com.company;
import java.lang.Math;
/**
 * Created by jordi on 14/02/2018.
 */
public class Cercle extends Figures
{
    private double r;
    public Cercle(double r)
    {
        this.r=r;
    }
    public void setR(double r)
    {
        this.r=r;
    }
    public double getR()
    {
        return this.r;
    }
    public double area()
    {
        double a;
        a = 2*Math.PI*this.r;
        return a;
    }
}
