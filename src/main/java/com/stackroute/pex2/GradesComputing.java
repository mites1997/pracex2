package com.stackroute.pex2;

import java.util.Scanner;




    public class GradesComputing {


        public String studentDetails(int NumberOfStudent, int[] NGrades) {
            if(NumberOfStudent<0  || NumberOfStudent >100)
                return "Wrong Input"; //wrong input for student no

            if(NGrades.length!=NumberOfStudent)
            {
                return "Wrong Input"; //no of students exceeds the specified value
            }

            for (int i =0;i<NumberOfStudent;i++)
            {
                if(NGrades[i]<0 || NGrades[i]>100)
                {
                    return "Wrong Input"; //range of marks is wrong
                }
            }

            String Result="";

            double tot=0;

            for (int i =0;i<NumberOfStudent;i++)
            {
                tot = tot + NGrades[i];
            }

            String avg = avg(tot,NumberOfStudent);

            int min = min(NGrades,NumberOfStudent);
            int max = max(NGrades,NumberOfStudent);

            Result = "The average is "+avg+" The minimum is "+min+" The maximum is "+max;

            return Result;
        }

        public static String avg(double total,int N){

            String s="";
            return s+(total/N); //average is calculated
        }

        public static int min(int[] NGrades, int N)
        {
            int min= NGrades[0];
            for (int i=1;i<N;i++)
            {
                if(NGrades[i]<min)
                {
                    min = NGrades[i];
                }
            }

            return min; //min marks is calculated
        }

        public static int max(int[] NGrades, int N)
        {
            int max= NGrades[0];
            for (int i=1;i<N;i++)
            {
                if(NGrades[i]>max)
                {
                    max = NGrades[i];
                }
            }

            return max; //max marks is calculated
        }


        }

