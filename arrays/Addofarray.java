import java.util.Scanner;
class Addofarray
{
public static void main(String[]args){
Scanner s=new Scanner(System.in);
int a[]=new int[5];
System.out.println("enter the 5 values:");
for(int i=0;i<5;i++)
{
System.out.println("enter the value of"+(i+1)+":");
a[i]=s.nextInt();
}
for(int i=0;i<5;i++)
{
a[i]=a[i]+a[i+1]+a[i+2]+a[i+3]+a[i+4];
System.out.println("addition:"+a[i]);
}
}
}

