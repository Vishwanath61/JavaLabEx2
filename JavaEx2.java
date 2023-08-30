/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package javaex2;

class Employee
{
    String name,design,dep;
    Float sal;
    int id;
    Employee(String nam,int empid,String desi,String depart,Float salary)
    {
        name=nam;
        sal=salary;
        dep=depart;
        design=desi;
        id=empid;
        display(name,dep,design,sal);
    }
    void display(String name,String dep,String design,Float salary)
    //void display()
    {
        if(dep=="CSE"||dep=="cse")
        {
            if(salary>10000)
            {
                System.out.println("Name:"+this.name+"\nDesignation:"+design+"\n");
            }
        }
    }
}

public class JavaEx2 
{
    
    public static void main(String[] args) 
    {
        Employee e1=new Employee("Vishwa",123,"prof","CSE",20000f);
        Employee e2=new Employee("Vishnu",124,"prof","ECE",8000f);
        Employee e3=new Employee("Udhaya",125,"prof","CSE",10000f);
        Employee e4=new Employee("SivaJB",126,"prof","CSE",25000f);
        Employee e5=new Employee("Nitheesh",127,"prof","CSE",11000f);
    }
    
}
