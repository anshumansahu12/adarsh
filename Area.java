import java.util.*;
class Area{

public double area(double s){
  return s*s;
}
public  double area(double r){
  return 3.14*r*r;
}

public  double area(double l , double b){
  return l*b;
}
public static void main(String args[]){
Scanner in = new Scanner(System.in);
System.out.println("Enter a Square");
int s=in.nextDouble();
System.out.println("Enter a redius");
int r=in.nextDouble();
System.out.println("Enter a Rectangle");
int l=in.nextDouble();

int b=in.nextDouble();

Area obj=new Area();
int n=obj.area(s);
int b=obj.area(r);
int v=obj.area(l,b);
System.out.println(n);
}

}
