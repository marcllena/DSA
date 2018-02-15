package com.company;

/**
 * Created by jordi on 14/02/2018.
 */
abstract public class Figures implements Comparable<Figures> {
    abstract public double area();
    public int compareTo(Figures in)
    {
        if(this.area()>= in.area())
            return 0;
        else
            return -1;
    }
}
