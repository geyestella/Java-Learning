package datastructrures;


import java.util.*;

public class GCD {
  private static long gcd_clever(long a, long b) {
	  if(b>a) {
		  long terminal=a;
		  a=b;
		  b=terminal;
	  }
	  
    if (b==0) {return a;}
    long a1=a%b;

    return gcd_clever(b,a1);
  }

  public static void main(String args[]) {
    Scanner scanner = new Scanner(System.in);
    int a = scanner.nextInt();
    int b = scanner.nextInt();

    System.out.println(gcd_clever(a, b));
  }
}
