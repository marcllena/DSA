package com.company;

/**
 * Created by jordi on 14/02/2018.
 */
public class Triangle extends Figures
{
    private double a;
    private double h;

    public void setA(double l1)
    {
        this.a=a;
    }
    public void setH(double l2)
    {
        this.h=h;
    }
    public double getA()
    {
        return this.a;
    }
    public double getH()
    {
        return this.h;
    }

    public double area()
    {
        double a=0;
        a = (a*h)/2;
        return a;
    }
}
