ssimport java.util.*;
public class Year
{
public static void main(String[]args)
{
Scanner sc=new Scanner(System.in);
int Year=sc.nextInt();
if(Year % 4==0)
{
System.out.print("This is leap year");
} 
else
{
System.out.println("This is not leap year");
}
}
}
