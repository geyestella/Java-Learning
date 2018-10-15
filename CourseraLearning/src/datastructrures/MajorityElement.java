package datastructrures;
import java.util.*;
import java.io.*;

public class MajorityElement {
    private static int getMajorityElement(int[] a, int left, int right) {
        if (left == right) {
            return -1;
        }
        if (left + 1 == right) {
            return a[left];
        }
        int maj_index=0;
        int count =1;
        for(int i=0;i<right;i++) {
        	if(a[i]==a[maj_index]) count++;
        	else count--;
        	if(count==0) {maj_index=i;count=1;}
        }
        count=0;
        for(int i=0;i<right;i++) {
        	if(a[i]==a[maj_index]) count++;
        }
        if (count>a.length/2) return 1;
        else {return 0;}
    }

    public static void main(String[] args) {
        FastScanner scanner = new FastScanner(System.in);
        int n = scanner.nextInt();
        int[] a = new int[n];
        for (int i = 0; i < n; i++) {
            a[i] = scanner.nextInt();
        }
        
            System.out.println(getMajorityElement(a, 0, a.length));
       
    }
    static class FastScanner {
        BufferedReader br;
        StringTokenizer st;

        FastScanner(InputStream stream) {
            try {
                br = new BufferedReader(new InputStreamReader(stream));
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
}

