package com.company;

/**
 * Created by jordi on 14/02/2018.
 */
public class Triangle extends Figures
{
    private double b;
    private double h;
    public Triangle(double base, double h)
    {
        this.setB(base);
        this.setH(h);
    }
    public void setB(double l1)
    {
        this.b=l1;
    }
    public void setH(double l2)
    {
        this.h=l2;
    }
    public double getB()
    {
        return this.b;
    }
    public double getH()
    {
        return this.h;
    }

    public double area()
    {
        double a;
        a = (this.getB()*this.getH())/2;
        return a;
    }
}
