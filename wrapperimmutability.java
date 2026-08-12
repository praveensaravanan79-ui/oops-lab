import java.util.Scanner;
public class wrapperimmutability{
public static void main(String[] args)
{
  Scanner sc = new Scanner(System.in);
  System.out.println("Enter number1 in int:");
  int num1 = sc.nextInt();
  int num2 = num1;
  num1 = num1+5;
  
  System.out.println("Num1:"+num1);
  System.out.println("Num2:"+num2);
  System.out.println("Are num1 and num2 same object?" +(num1==num2));

  System.out.println("Enter number1 in double:");
  double d1 = sc.nextDouble();
  double d2 = d1;
  d1 = d1*2;
 
  System.out.println("Num1:"+d1);
  System.out.println("Num2:"+d2);
  System.out.println("Are d1 and d2 same object?" +(d1==d2));
 }
}

