package datastructrures;

import java.util.Scanner;



public class palindrome {
  public static void reverseuntilpalindrome(int x){
    int iteration_time = 0;
    int sum_palindrome = 0;
    int reverse_digit = 0;
    while (true){
      iteration_time++;
      reverse_digit = reverse(x);
      sum_palindrome = x + reverse_digit;
      if(isPalindrome(sum_palindrome)==true) break;
      x = sum_palindrome;
    }
    System.out.println(iteration_time+" "+sum_palindrome);
  }
  public static int reverse(int x){
     int result = 0;
     int new_result = 0;
     while(x>0){
     new_result = result * 10 + x % 10;
     x /= 10;
     if (new_result/10 != result){ 
       return 0;
     } 
     result = new_result;
     }
     return result;
	}
  public static boolean isPalindrome(int x) {
	   if(x<0 || (x!=0 && x%10 == 0)) return false;
	   int sum=0;
	   while(x>sum)
	   {
	     sum = sum*10 + x%10;
	     x = x/10;
	   }
	   return (x==sum) || (x==sum/10);
  }
  public static void main(String[] args) {
    Scanner scanner = new Scanner(System.in);
    int m = scanner.nextInt();
    reverseuntilpalindrome(m);
    }
}
