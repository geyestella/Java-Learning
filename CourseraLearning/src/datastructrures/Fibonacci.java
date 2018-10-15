package datastructrures;


import java.util.Scanner;

public class Fibonacci {
  private static long calc_fib(int n) {
  long[] storage = new long[n+1];
  storage[0]=0;
  if(n==0) {return storage[n];}
  storage[1]=1;
  if(n==1) {return storage[n];}
  for(int i=2;i<=n;++i)
  {
	  storage[i]=storage[i-1]+storage[i-2];
  }
 
  return storage[n];
  }

  public static void main(String args[]) {
    Scanner in = new Scanner(System.in);
    int n = in.nextInt();

    System.out.println(calc_fib(n));
  }
}
