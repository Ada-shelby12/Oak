
import java.io.*;
class prime
{
public static void main(String args[])
{
int  i,j;
if(args.length<2)
{
System.out.println("no command line arguments");
return;
}
int num1=Integer.parseInt(args[0]);
int num2=Integer.parseInt(args[1]);
System.out.println("prime no between: "+num1 +" and : " +num2);
for(i=num1;i<num2;i++)
{
for(j=2;j<i;j++)
{
int n=i%j;
if(n==0)
{
break;
}
}
if(i==j)
{               
System.out.println("The prime No :"+i);
}
}
}
}