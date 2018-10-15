package datastructrures;


import java.util.Scanner;

public class Change {
    private static int getChange(int m) {
       int a=0;
       int b=0;
       int c=0;    
       if (m>=4)
       {
    	   a=m/4;
    	   m=m%4;
       }
       else if (m>=3)
       {
    	   b=m/3;
    	   m=m%3;
       }
       else if (m<3)
       {
    	  c=m;
       }
        return a+b+c;
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int m = scanner.nextInt();
        System.out.println(getChange(m));

    }
}

