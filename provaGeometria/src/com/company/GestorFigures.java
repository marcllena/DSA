package com.company;

import java.util.Arrays;

/**
 * Created by jordi on 14/02/2018.
 */
public class GestorFigures {
    public static double suma(Figures[] fig)
    {
        double res=0;
        for(Figures el : fig)
        {
           res += el.area();
        }
        return res;
    }
    public static void ordre(Figures[] l)
    {
        Arrays.sort(l);
    }

}