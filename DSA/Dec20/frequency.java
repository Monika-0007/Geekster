import java.util.Arrays;
class practice {
	    public static int frequency(int[] arr, int target) {
	    	Arrays.sort(arr);
	    	int count=0;
	    	for(int i =0;i<arr.length;i++)
	    	{
	    		if(arr[i]==target)
	    			count++;
	    	}
	       return count; 
	    }
}
