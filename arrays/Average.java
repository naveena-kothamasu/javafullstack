import java.util.Scanner;
class Average{
public static void main(String[] args)
{
Scanner s=new Scanner(System.in);
System.out.println("enter the size of array");

float avg=0;
int sum=0;
int n=s.nextInt();
int a[]=new int[n];
System.out.println("enter the"+n+ "values:");
for( int i=0;i<n;i++)
{
a[i]=s.nextInt();
}
for(int i=0;i<n;i++)
{
sum+= a[i];
}
System.out.println("Addition is" +sum);
for(int i=0;i<n;i++){
avg=(sum/2);
}
System.out.println("Average value is:"+avg);
}
}


