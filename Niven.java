import java.util.*;
class Niven
{
public static void main(String args[])
{
Scanner in=new Scanner(System.in);
System.out.println("Enter a number");
int n = in.nextInt();
int sum=0,num=n;
while(n>0)
{
int no=n%10;
sum=sum+no;
n=n/10;
}
if(num%sum==0)
{
System.out.println(num+"is a Niven Number");
}
else
{
System.out.println(num+"is not Niven Number");
}
}
}
