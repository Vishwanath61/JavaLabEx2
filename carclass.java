/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package javaex2;

import java.util.*;

class owner
{
    String name,city,prof;
    owner(String nam,String cit,String profe)
    {
        name=nam;
        city=cit;
        prof=profe;  
    }
    
    String getname()
    {
        return name;
    }
    
    String getcity()
    {
        return city;
    }
    
    String getprofession()
    {
        return prof;
    }
    
    public String toString()
    {
        return "\nName:"+name+"\nCity:"+city+"\nProf:"+prof; 
    }
}

class car 
{
    int regno,seat,model;
    String brand,color;
    owner own;
    car(int reg,String col,int s,String br,int mod,owner o)
    {
        regno=reg;
        color=col;
        seat=s;
        brand=br;
        model=mod;
        own=o;
    }
    
    int getregno()
    {
        return regno; 
    }
    
    String getcolor()
    {
        return color;
    }
    
    String getbrand()
    {
        return brand;
    }
    
    int getmodel()
    {
        return model;
    }
    
    public String toString()
    {
        return "\nRegistration number:"+regno+"\nColor:"+color+"\nNumber of seats:"+seat+"\nBrand:"+brand+"\nModel:"+model+own;
    }
}

public class carclass 
{

    public static void main(String[] args) 
    {
        owner o[]=new owner[5];
        car c[]=new car[5];
        o[0]=new owner("Vishwa","Madurai","Software Engineer");
        c[0]=new car(8055,"Black",4,"Ferari",201,o[0]);
        o[1]= new owner("Vishnu","Madurai","Police");
        c[1]=new car(7642,"Brown",4,"Tata",212,o[1]);
        o[2]= new owner("Siva","Madurai","CEO");
        c[2]=new car(7777,"White",6,"Rolls Royers",123,o[2]);
        o[3]= new owner("Udhaya","Madurai","Doctor");
        c[3]=new car(7839,"Red",6,"MG Hector",174,o[3]);
        o[4]= new owner("Nitheesh","Madurai","Engineer");
        c[4]=new car(7295,"Blue",4,"Inova",155,o[4]);
        for(int i=0;i<o.length;i++)
        {
            System.out.println(c[i]);   
        }
    }  
}

    

