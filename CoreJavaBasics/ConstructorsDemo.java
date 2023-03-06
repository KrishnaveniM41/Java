package CoreJavaBasics;

import java.util.*;
class Person
{
int Age;
String Name,Gender;
Person(String n,String g ,int a)
{
Name=n;
Gender=g;
Age=a;
}
void show()
{
System.out.println("Name:"+Name+"\nAge: "+Age+"\nGender: "+Gender);
}
}
class Employee extends Person
{
String Company;
Employee (String n,String g,int a,String c)
{
super(n,g,a);
Company = c;
}
void cshow()
{
System.out.println("Company:" +Company);
}
}
class Programmer extends Employee
{
int Salary;
Programmer(String n,String g,int a,String c,int s)
{
super (n,g,a,c);
Salary=s;
}
void sshow()
{
System.out.println("Salary: "+Salary);
}
}


public class ConstructorsDemo {

public static void main(String[] args) {
// TODO Auto-generated method stub
Programmer pp=new Programmer("Bincy","Female",20,"Google",25000000);
pp.show();
        pp.cshow();
        pp.sshow();

}

}

