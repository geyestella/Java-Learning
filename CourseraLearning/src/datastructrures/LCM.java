package datastructrures;


import java.util.*;

public class LCM {
	 public static long gcd_clever(long a, long b) {
		  if(b>a) {
			  long terminal=a;
			  a=b;
			  b=terminal;
		  }
		  
	    if (b==0) {return a;}
	    long a1=a%b;

	    return gcd_clever(b,a1);
	  }

	private static long lcm_naive(long a, long b) {
		 if(b>a) {
			  long terminal=a;
			  a=b;
			  b=terminal;
		  }
    return a*b/gcd_clever(a,b);
  }

  public static void main(String args[]) {
    Scanner scanner = new Scanner(System.in);
    int a = scanner.nextInt();
    int b = scanner.nextInt();

    System.out.println(lcm_naive(a, b));
  }
}
