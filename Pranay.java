class Bill{

String name;
int bno;
int call;
double amt;

Bill(){
this.name=null;
this.bno=0;
this.call=0;
}

Bill(String name,int bno,int call){
this.name=name;
this.bno=bno;
this.call=call;
}

void calculate(){
//Assuming 5rs per unit 
amt=5*this.call;
System.out.println("Amount to be pay is : "+amt);
}
}

public class Pranay{
public static void main (String args[]){
Bill b1=new Bill("pranay",8888,10);
b1.calculate();

}}
