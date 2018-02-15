package com.company;

public class Quadrat extends Rectangle
{
    public Quadrat(double l)
    {
        super.setL1(l);
        super.setL2(l);
    }
    public double area()
    {
        double a;
        a = super.getL1()*super.getL2();
        return a;
    }
}
