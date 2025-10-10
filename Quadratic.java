import java.util.Scanner;
public class Quadratic
public static void main(String args[]){
    Scanner sc=new Scanner(System.in);
    System.out.println("Enter co-efficient of a");
    double a=sc.nextDouble();
System.out.println("Enter co-efficient of b");
double b=sc.nextDouble();
System.out.println("Enter co-efficient of c");
double c=sc.nextDouble();
double d=b*b-4*a*c;
if(d>0)
{                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                          
double r1=(-b+Math.sqrt(d))/(2*a);
double r2=(-b+Math.sqrt(d))/(2*a);
System.out.println("the roots are real and distint");
System.out.println("Root1="+r1);
System.out.println("Root2="+r2);
}
else if(d==0)
{
double r1=-b/(2*a);
double r2=r1;
System.out.println("roots are equal and real");
System.out.println("Root1="+r1);
System.out.println("Root2="+r2);
}
else
{
double realpart=-b/(2*a);
double imgpart=Math.sqrt(-d)/(2*a);
System.out.println("the roots are complex");
System.out.println("root1="+realpart+"+"+imgpart+",");
System.out.println("root2="+realpart+"-"+imgpart+",");
}
}
}
