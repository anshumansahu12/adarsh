import java.io.*;
import java.util.*;
class Prime 
{
int n;
Prime()
{
n=0;
}
void input(int x)
{
n=x;
}
void display()
{
int c=0;

for(int i=1;i<=n;i++)
{
if(n%i==0)
{
i++;
}
else if(c==2)
{
System.out.println(n+"is a prime number");
}
else
{
System.out.println(n+" is not an prime number");
}
}
Public static void main(string args[])
{
Scanner.in=new scanner(system.in);
System.out.println("Enter the number");
int num=in.nextInt();
prime.obj=new prime();
obj.input(num);
obj.Display();
}
}

