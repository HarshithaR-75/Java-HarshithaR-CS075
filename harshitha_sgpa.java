import java.util.*;
class Student{
  String usn,name;
  int credits[]= new int[10];
  int marks[]=new int[10];
  int total_credits=0;
  int sum=0;
  int n;
  Double SGPA;
  void initialize(String usn, String name)
  {
   this.name=name;
   this.usn=usn;
  }

  void display()
 {
  System.out.println("Student name is:"+ name);
  System.out.println("Student usn is:"+ usn);
 }
  
 void calculate(int credits[], int marks[])
 {
  for(i=0;i<n;i++)
  { 
   total_credits=total_credits+credits[i];
   if(marks>=90 && marks<=100)
   {
     sum=sum+credits[i]*10;
   }
   if(marks>=80 && marks<=89)
   {
     sum=sum+credits[i]*9;
   }
  if(marks>=70 && marks<=79)
   {
     sum=sum+credits[i]*8;
   }
   if(marks>=60 && marks<=69)
   {
     sum=sum+credits[i]*7;
   }
     if(marks>=55 && marks<=59)
   {
     sum=sum+credits[i]*6;
   }
     if(marks>=50 && marks<=54)
   {
     sum=sum+credits[i]*5;
   }
     if(marks>=40 && marks<=49)
   {
     sum=sum+credits[i]*4;
   }
    if(marks>=0 && marks<=39)
   {
     sum=sum+credits[i]*0;
   }
    SGPA= (double)sum/total_credits;
   System.out.println("Total Credits=" + total_credits);
   System.out.println("SGPA=" + SGPA);

 }
 }


class Score
{
 public static void main(String args[])
{
 Scanner sc=new Scanner(System.in);
 Student s1=new Student();
 System.out.println("Enter Student name");
 name=sc.next();
 System.out.println("Enter Student USN");
 usn=sc.next();
 System.out.println("Enter the number of subjects");
 n=sc.nextInt();
 System.out.println("Enter credits of all subjects");
 for(i=0;i<n;i++)
 {
   credits[i]=sc.nextInt();
 }
 System.out.println("Enter marks of all subjects");
 for(i=0;i<n;i++)
 {
   marks[i]=sc.nextInt();
 }
 
 s1.initialize(name,usn);
 s1.display();
 s1.calculate(credits, marks);
}
}

  

  