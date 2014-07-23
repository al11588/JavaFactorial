
import
java.util.Scanner;
public
class test2
{
public static void main (String[]args)
{
Scanner inkey =
new Scanner (System.in);
int value;
boolean flag = true;
while (flag == true)
{
System.
out.println ("Please select one from the Menu:");
System.
out.println ("1. My Factorial ");
System.
out.println ("2. My Power ");
System.
out.println ("3. My Sum ");
System.
out.println ("4. Largest ");
System.
out.println ("5. Exit ");
value = inkey.nextInt ();
switch (value)
{
case 1:
System.
out.println (" Enter a value for a factorial to be calculated: ");
int x = inkey.nextInt();
MyFactorial(x);
try
{
Thread.sleep(5000);
}
catch(InterruptedException e)
{
System.
out.println ("error");
}
break;
case 2:
System.
out.println (" Enter positive base number and exponent: ");
int a = inkey.nextInt();
int b = inkey.nextInt();
MyPower(a,b);
try
{
Thread.sleep(5000);
}
catch(InterruptedException e)
{
System.
out.println ("error");
}
break;
case 3:
System.
out.println (" Enter digit to get the total value from 0: ");
int digit = inkey.nextInt();
MySum (digit);
try
{
Thread.sleep(5000);
}
catch(InterruptedException e)
{
System.
out.println ("error");
}
case 4:
System.out.println (" Enter 5 positive integers:");
int num1 = inkey.nextInt();
int num2 = inkey.nextInt();
int num3 = inkey.nextInt();
int num4 = inkey.nextInt();
int num5 = inkey.nextInt();
System.out.println (" Maximum number is = " + Largest (num1, num2, num3, num4, num5));
try
{
Thread.sleep(5000);
}
catch(InterruptedException e)
{
System.out.println ("error");
}
break;
case 5:
flag =
false;
break;
}
}
}
public static int MyFactorial (int y)
{
for (int fac=y-1; fac >= 1; fac--)
{
y = y*fac;
}
System.out.println("The result of the number you gave, the factorial is: " + y);
return (y);
}
public static double MyPower (int base, int exponent)
{
double powerresult = 0.0;
if (exponent==0)
{
powerresult=1;
}
else
if (exponent > 0)
{
powerresult = base;
for (int i = 1; i<exponent; i++)
{
powerresult=powerresult*base;
}
}
else
{
exponent = Math.abs(exponent);
powerresult=base;
for (int i=1; i<exponent; i++)
{
powerresult=powerresult*base;
}
powerresult = 1.0/powerresult;
}
System.out.println ("Answer is:" + powerresult);
return (powerresult);
}
public static int MySum (int num)
{
int result=0, sum=0;
for (int i=1; i<=num; i++)
{
result=result+i;
if (i%2==0)
sum=sum+i;
}
System.out.println("The result of the number you gave is: " +result);
System.out.println("And the even number of the above result is: " +sum);
return (result);
}
public static int Largest (int n1, int n2, int n3, int n4, int n5)
{
int max=n1;
max = n1;
if (n2>max)
max = n2;
if (n3>max)
max = n3;
if (n4>max)
max = n4;
if (n5>max)
max = n5;
return max;
}
}
