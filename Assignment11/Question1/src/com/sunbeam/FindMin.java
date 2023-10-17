package com.sunbeam;
import java.util.Arrays;
public class FindMin {
	
	 static <T extends Number> T findMin(T[] arr ) {
		T min= arr[0];
		for (int i=1;i<=arr.length;i++)
			if (min.doubleValue()>arr[i].doubleValue())
				min=arr[i];
		return min;
	}
      static void main(String [] args) {
    	  Integer[] arr1= {22,55,77,11,33};
    	  Integer min1=findMin(arr1);
    	  System.out.println("min1="+min1);
    	  
    	  Double[] arr2= {2.2,5.5,7.7,1.1,3.3};
    	  Double min2=findMin(arr2);
    	  System.out.println("min2="+min2);
      }
}
