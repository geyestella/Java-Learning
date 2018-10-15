package datastructrures;

import java.util.*;

public class FibonacciLastDigit {
    private static int getFibonacciLastDigitNaive(int n) {
    	 int[] storage = new int[n+1];
    	 storage[0]=0;
    	  if(n==0) {return storage[n];}
    	  storage[1]=1;
    	  if(n==1) {return storage[n];}
    	  for(int i=2;i<=n;i++)
    	  {
    		  if(i<=6)
    		  { storage[i]=storage[i-1]+storage[i-2];}
    		  else {
    		  storage[i]=(storage[i-1]+storage[i-2])%10;}
    	  }
    	 
    	  return storage[n];
    	  }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
       int n = scanner.nextInt();
     
        
        int c = getFibonacciLastDigitNaive(n);
        System.out.println(c);
        
    }
}

