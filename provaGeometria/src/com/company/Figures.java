package com.company;

/**
 * Created by jordi on 14/02/2018.
 */
public abstract class Figures {
    public void area()
    {
    }
    public double compareTo(Figures in)
    {
        return this.area()-in.area();
    }
}
