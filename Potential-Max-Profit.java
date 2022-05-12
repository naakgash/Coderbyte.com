import java.util.*;
import java.io.*;

class GrocerInvoiceCalculator{
    public static void main(String []argh)
    {
    	String challengeToken = "k5olhfwva1e";
    	int[] arr = new int[] {10,12,4,5,9};
    	int maxProfit = 0;
    	for(int j=0; j<arr.length-1; j++){
    	      int tempProfit = 0;;
    	      for(int i=0; i<arr.length-1; i++){
    	        if(arr[0]<arr[i+1]){
    	         tempProfit =  arr[i+1] - arr[0];
    	          if (tempProfit > maxProfit) maxProfit = tempProfit;
    	        }
    	      }
    	    System.arraycopy(arr, 1, arr, 0, arr.length-1); 
    	}
    	StringBuilder sb = new StringBuilder(challengeToken);
        sb.insert(0,maxProfit);
        System.out.println(sb.toString());
    }
}
