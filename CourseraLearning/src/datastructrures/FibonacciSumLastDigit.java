package datastructrures;


import java.util.*;

public class FibonacciSumLastDigit {
    private static long getFibonacciSumNaive(long n) {
        if (n <= 1)
            return n;

        long previous = 0;
        long current  = 1;
        long sum      = 1;

        for (long i = 0; i < n - 1; ++i) {
            long tmp_previous = previous;
            previous = current;
            current = tmp_previous + current;
            sum += current;
        }

        return sum % 10;
    }
    
    private static long getFibonacciSumClever(int n)
    {
    	 int[] storage = new int[ (n+1)];
    	 long sum=0;
    	 storage[0]=0;
    	  if(n==0) {return storage[ n];}
    	  storage[1]=1;
    	  if(n==1) {return storage[ n];}
    	  for(int i=2;i<=n;i++)
    	  {
    		  if(i<=6)
    		  { storage[i]=storage[i-1]+storage[i-2];}
    		  else {
    		  storage[i]=(storage[i-1]+storage[i-2])%10;}
    	  }
    	  for(int i=0;i<=n;i++)
    	  {sum=sum+storage[i];}
    	  return sum%10;
    	  
    }
    public static void main(String[] args) {
      //  Scanner scanner = new Scanner(System.in);
     //   long n = scanner.nextLong();
    	for(int i=0;i<200;i++)
        {
    	long s = getFibonacciSumNaive(i);
        long t = getFibonacciSumClever(i);
        	
        	if(s!=t) {
        		 System.out.println("Wrong Answer");
        		 System.out.println(i);
       	      
        		 System.out.println(s);
        	        System.out.println(t);
        	        break;
        	}
        	else { System.out.println("Correct");
            }
       
    }
}
}

