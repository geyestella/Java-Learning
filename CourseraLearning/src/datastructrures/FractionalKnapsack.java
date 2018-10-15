package datastructrures;

import java.util.Arrays;
import java.util.Scanner;

public class FractionalKnapsack {
    private static double getOptimalValue(double capacity, double[] values, double[] weights) {
        double value = 0;
        double[] density= new double[values.length];
        double maxdensity=0;
        double a=0;
        int maxdensityid;
        int l;
        //write your code here
    	for(int j=0;j<values.length;j++)
    	{       		
    	density[j] = values[j]/weights[j];    		
    	}
        for(int i=0;i<values.length;i++)
        {
        	maxdensity = 0;
        	if (capacity == 0 ) return value;
           	for(int k=0;k<values.length;k++)
        	{
           		if(weights[k]>0)
           		{
        		maxdensity = Math.max(maxdensity, density[k]);
           		}
        	}
        	for(l=0;l<values.length;l++)
        	{
           		if(density[l]==maxdensity)
           			break;
        	}
           	maxdensityid = l;
        	a=Math.min(weights[maxdensityid],capacity);
        	value=value+a*maxdensity;
        	weights[maxdensityid]=weights[maxdensityid]-a;
        	capacity=capacity-a;
        }
        
        return value;
    }

    public static void main(String args[]) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        double capacity = scanner.nextInt();
        double[] values = new double[n];
        double[] weights = new double[n];
        for (int i = 0; i < n; i++) {
            values[i] = scanner.nextInt();
            weights[i] = scanner.nextInt();
        }
        System.out.println(getOptimalValue(capacity, values, weights));
    }
} 
