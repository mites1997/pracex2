//Check if the string is palindrome and return string msg

package com.stackroute.pex2;

public class Reverseinput

{

public String checkpalin(String stringtobechecked)
    {
        String reversedstring = "";
        if(stringtobechecked==null) //null string is checked
        {
            return "cannot be reversed";
        }


        for(int i = stringtobechecked.length() - 1; i >= 0; i--)
        {
            reversedstring= reversedstring + stringtobechecked.charAt(i); //string is concatenated from the last
        }

        if(reversedstring.equals(stringtobechecked))
        {
            return "palindrome"; //palindrome condition
        }
        else
        {
            return "not palindrome";//non palindrome condition
        }

    }

}
