//initialize one class and display the data in another class
package com.stackroute.pex2;

public class Initializeanddisplaywithotherclass {
    public class Member {

        String name;  //memeber variables named
        int age;
        double salary;
    }

    Member obj = new Member();


    public void initializeData(String nameValue, int ageValue, double salaryValue) {

        obj.name = nameValue; //member variables initialised
        obj.age = ageValue;
        obj.salary = salaryValue;

    }

    public String displayData() {
        if((obj.name!=null)&&(obj.age>0)&&(obj.salary>0))
            return ("Members Name: "+obj.name + " Members age: "+obj.age+" Members salary: "+obj.salary); //data is displayed
            else
                return "invalid input";  //input is invalid

    }






}
