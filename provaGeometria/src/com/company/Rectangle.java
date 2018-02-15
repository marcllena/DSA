package com.company;

/**
 * Created by jordi on 14/02/2018.
 */
public class Rectangle extends Figures
{
    private double l1;
    private double l2;
    public void setL1(double l1)
    {
        this.l1=l1;
    }
    public void setL2(double l2)
    {
        this.l2=l2;
    }
    public double getL1()
    {
        return this.l1;
    }
    public double getL2()
    {
        return this.l2;
    }
    public double area()
    {
        double a;
        a = l1*l2;
        return a;
    }
}
