package com.company;

/**
 * Created by jordi on 14/02/2018.
 */
public abstract class Figures {
    abstract public double area();
    public double compareTo(Figures in)
    {
        return this.area()-in.area();
    }
}
