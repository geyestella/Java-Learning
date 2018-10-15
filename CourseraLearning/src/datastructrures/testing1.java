package datastructrures;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.nio.charset.StandardCharsets;
import java.util.Scanner;
public class testing1 {
  
	public static int square(int x){
  x=x*x;
  return x;
	}
  
  public static void main(String[] args) throws IOException {
  Scanner scanner = new Scanner(System.in);
	int y = scanner.nextInt();
	System.out.println(square(y));
}
}