package com.example.dummy;

import android.graphics.ColorSpace;

import java.util.ArrayList;

public class Constants {
    public static ArrayList<ModelClass> getEmployeeData()
    {
        // create an ArrayList of type Employee class
        ArrayList<ModelClass> friendList = new ArrayList<ModelClass>();
        ModelClass friend1 = new ModelClass("Chinmay Rai");
        friendList.add(friend1);

        ModelClass friend2 = new ModelClass("Ajay Singh");
        friendList.add(friend2);

        ModelClass friend3 = new ModelClass("Anmol Anand");
        friendList.add(friend3);

        ModelClass friend4 = new ModelClass("Gopal Bhargawa");
        friendList.add(friend4);

        ModelClass friend5 = new ModelClass("Rishabh Dev");
        friendList.add(friend5);

        ModelClass friend6 = new ModelClass("Chirag Lodhi");
        friendList.add(friend6);

        ModelClass friend7 = new ModelClass("Shivam Singh");
        friendList.add(friend7);

        ModelClass friend8 = new ModelClass("Mohan Yadav");
        friendList.add(friend8);

        ModelClass friend9 = new ModelClass("Arushi Yadav");
        friendList.add(friend9);

        ModelClass friend10 = new ModelClass("Happy Kaur");
        friendList.add(friend10);

        ModelClass friend11 = new ModelClass("Anand Tiwari");
        friendList.add(friend11);

        ModelClass friend12 = new ModelClass("Bilal Khan");
        friendList.add(friend12);

        ModelClass friend13 = new ModelClass("Rupali Singh");
        friendList.add(friend13);

        return friendList;
    }}
