class Solution {
    public void sortColors(int[] array)
    {
        int n=array.length;
        for (int i = 1; i < n; i++)  
        {  
            int j = i;  
            int a = array[i];  
            while ((j > 0) && (array[j-1] > a))   
            {
                array[j] = array[j-1];  
                j--;  
            }
            array[j] = a;       
        } 
        for(int i=0;i<array.length;i++)
        {
        System.out.print(array[i]);
        }
    }  
}
