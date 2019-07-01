package com.stackroute.pex2;

public class Checkevenwithbooleanreturn {
    public boolean isEven(int numbertobechecked)
    {

        if(numbertobechecked<0) //error condition
        return false;
        if(numbertobechecked%2==0)//even check
        {
            return true;
        }
        else
        {
            return false;
        }
    }
}
