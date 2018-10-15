package datastructrures;
import java.util.*;
import java.io.*;

public class MaxPairwiseProduct {
    static long getMaxPairwiseProduct(long[] numbers) {
        int n = numbers.length;

        int max_index1=-1;
        
        for (int i = 0; i < n; ++i) {
            if((max_index1==-1)||(numbers[i]>numbers[max_index1]))
                    max_index1=i;
        }
        int max_index2=-1;
        for (int j = 0; j < n; ++j) {
            if((j!=max_index1)&&((max_index2==-1)||(numbers[j]>numbers[max_index2])))
                    max_index2=j;
        }
       return numbers[max_index1]*numbers[max_index2];
    }
    static long getMaxPairwiseProductSlow(long[] numbers) {
    	long max_product = 0;
        int n = numbers.length;

        for (int first = 0; first < n; ++first) {
            for (int second = first + 1; second < n; ++second) {
                max_product = Math.max(max_product,numbers[first] * numbers[second]);
            }
        }

        return max_product;
    }
    
    public static void main(String[] args) {
    while(true) {
    	int n = (int) (Math.random()*100+2);
    	System.out.println(n);
    	long[] randomgroup = new long[n];
    	for(int i=0;i<n;i++)
    	{
    		randomgroup[i]=(int)(Math.random()*100+2);
    	}
    	for(int i=0;i<n;i++)
    	{
    		System.out.print(randomgroup[i]+" ");
    	}
    	System.out.println("");
    	long res1=getMaxPairwiseProduct(randomgroup);
    	long res2=getMaxPairwiseProductSlow(randomgroup);
    	if(res1!=res2)
    	{
    		System.out.println("Wrong Answer!");
    		System.out.print(res1);
    		System.out.print(res2);
    		break;
    	}
    	else {
    		System.out.println("OK");
    	}
    }
    }
    	
    	
    	
    	
    	
    	
    }
     /*   FastScanner scanner = new FastScanner(System.in);
        int n = scanner.nextInt();
        long[] numbers = new long[n];
        for (int i = 0; i < n; i++) {
            numbers[i] = scanner.nextInt();
        }
        System.out.println(getMaxPairwiseProduct(numbers));
    }

    static class FastScanner {
        BufferedReader br;
        StringTokenizer st;

        FastScanner(InputStream stream) {
            try {
                br = new BufferedReader(new
                    InputStreamReader(stream));
            } catch (Exception e) {
                e.printStackTrace();
            }
        }

        String next() {
            while (st == null || !st.hasMoreTokens()) {
                try {
                    st = new StringTokenizer(br.readLine());
                } catch (IOException e) {
                    e.printStackTrace();
                }
            }
            return st.nextToken();
        }

        int nextInt() {
            return Integer.parseInt(next());
        }
    }
*/
