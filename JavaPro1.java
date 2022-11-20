#import java.util.*;
#import java.lang.*;

class Simple{
 int length,breadth;
 void rectangle(){
  int Area;
  Area = length * breadth ;
  System.out.println("Area of Rectangle:"+Area);
 }
 public static void main(String [] args){
  Simple s=new Simple();
  s.rectangle();
 }
}
