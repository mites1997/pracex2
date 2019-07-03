
//program to check if the factorial is within the range of int and float
package com.stackroute.pex2;

public class Factorialwithintandlong {
    public String printIntFactorials()
    {  //integer factorial

        int i  = 1;
        int fn = 1;
        String output="";
        while (true)
        {
            output=output+"\n"+fn;
            if (Integer.MAX_VALUE / fn < (i+1)) {
               output=output+"\nout of range";
               break;
            }
            i++;
            fn *= i;//factorial is counted
        }
        return output;

    }

    public String printLongFactorials()//long factorial
    {   String output="";
        long i  = 1L;
        long fn = 1L;
        while (true)
        {   output=output+"\n"+fn;

            if (Long.MAX_VALUE / fn < (i+1)) {
                output=output+"\nout of range";
                break;
            }
            i++;
            fn *= i;//long factorial is counted
        }
    return output;
    }
}


