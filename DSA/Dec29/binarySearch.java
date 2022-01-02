class practice 
{
	 public static int search(int arr[], int first, int last, int key)
	 { 
		 if(last>=first)
		 {
			 int mid = first + (last - first)/2;  
	         if (arr[mid] == key)
	         {  
	         return mid;  
	         }  
	         if (arr[mid] > key)
	         {  
	            return search(arr, first, mid-1, key);  
	         }
	         else
	         {  
	            return search(arr, mid+1, last, key);
	         }  
	      }  
		 return -1;  
	}  
	 public static void main(String[] args)
	 {
		int arr[] = {14,19,16,25,03,67,10};  
        int key = 10;  
        int last=arr.length-1;  
        int result = search(arr,0,last,key);  
        if(result == -1) 
        {
            System.out.println("Element not found!");
        }
        else 
        { 
        	System.out.println("Element found at index: "+result); 
        }
	}
}
