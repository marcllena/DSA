package com.company;

/**
 * Created by jordi on 14/02/2018.
 */
public class GestorFigures {
    public static double suma(Figures[] fig)
    {
        int res=0;
        for(Figures el : fig)
        {
           res += el.area();
        }
        return res;
    }
    public static void ordre(Figures[] l)
    {

    }

}
