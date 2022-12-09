import java.util.*;

class book{
String name;
String author;
double price;
int pages;
Scanner sc= new Scanner(System.in);
book(){
name="";
author="";
price=0.0;
pages=0;
}

void set(){
System.out.println("Enter name of the book");
name=sc.next();
System.out.println("Enter name of the author");
author=sc.next();
System.out.println("Enter price of the book");
price=sc.nextDouble();
System.out.println("Enter price of the book");
pages=sc.nextInt();
}


//tostring() is an inbuilt funtion in java and helps us to print values with much ease
//you dont have to call it when you use println it automatically goes there

public String toString()
{
String s="Name of the book is "+name+" and it is written by "+author+". The book costs "+price+" and has "+ pages+" pages";
return s;
}
}


class bookmain{
public static void main(String args[]){
Scanner sc= new Scanner(System.in);
System.out.println("Enter the number of books");
int n;
n=sc.nextInt();
book b[]=new book[n]; //this is how you create an array of class
for(int i=0;i<n;i++){
System.out.println("Enter details of book "+(i+1));
b[i]=new book();
b[i].set();
}
for(int i=0;i<n;i++){
System.out.println(b[i]);
}
}
}