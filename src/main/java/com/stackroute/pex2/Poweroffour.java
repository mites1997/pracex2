package com.stackroute.pex2;

public class Poweroffour
{
    public static String powerOfFour(int numbertobechecked)

    {
        if(numbertobechecked == 0)
            return "false";
        while(numbertobechecked != 1) //logic for checking power of four
        {
            if(numbertobechecked % 4 != 0)
                return "false";
            numbertobechecked = numbertobechecked / 4;
        }
        return "true";
    }
}
