abstract class Shape{


  int dim1,dim2;


     Shape(int x,int y)
     {

          dim1=x;
          dim2=y;
      }


    Shape(int z)
    {
      dim1=z;
    }


 abstract double printarea();
 
 }



 class Rectangle extends Shape{

    
         Rectangle(int x,int y)
        {

            super(x,y);
         }
       


         double printarea()     
       {
           return  dim1*dim2;
        }

 }



class triangle extends Shape{

            
           triangle(int x,int y)
           {

                super(x,y);
            }


           double printarea()     
       {
           return  0.5*(dim1*dim2);
        }

          
  }


class circle extends Shape{

            
           circle(int z)
           {

                super(z);
            }


           double printarea()     
       {
           return  3.14*dim1*dim1;
        }


  }



 class abst{


   public static void main(String args[])

    {

          Rectangle r1=new Rectangle(15,30);
          triangle t1=new triangle(20,50);
          circle c1=new circle(10);

           Shape f;

           f=r1;  
           double a1=f.printarea();
           System.out.println("Area of Rectangle is"+" "+a1);
              
           f=t1;  
           double a2=f.printarea();
           System.out.println("Area of triangle is"+" "+a2);  

           f=c1;
           double a3=f.printarea();
           System.out.println("Area of circle is"+" "+a3); 
          
         

    }
 } 
