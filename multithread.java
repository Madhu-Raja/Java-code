System.out.println("Main Thread and Generated Number is " + num); 
if (num % 2 == 0) 
{ 
Thread t1 = new Thread(new even(num)); 
t1.start(); 
} 
else 
{ 
Thread t2 = new Thread(new odd(num)); 
t2.start(); 
} 
Thread.sleep(1000); 
System.out.println("--------------------------------------"); 
} 
} 
catch (Exception ex) 
{ 
System.out.println(ex.getMessage()); 
} 
} 
} 
public class multithreadprog 
{ 
public static void main(String[] args) 
{ 
A a = new A(); 
a.start(); 
} 
} 
output
Main Thread and Generated Number is 6
New Thread 6 is EVEN and Square of 6 is: 36
--------------------------------------
Main Thread and Generated Number is 54
New Thread 54 is EVEN and Square of 54 is: 2916
--------------------------------------
Main Thread and Generated Number is 20
New Thread 20 is EVEN and Square of 20 is: 400
--------------------------------------
Main Thread and Generated Number is 69
New Thread 69 is ODD and Cube of 69 is: 328509
--------------------------------------
Main Thread and Generated Number is 55
New Thread 55 is ODD and Cube of 55 is: 166375
--------------------------------------
