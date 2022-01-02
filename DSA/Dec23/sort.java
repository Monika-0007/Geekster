class Solution {
    public int[] sortArray(int[] arr) {
        for (int i = 0; i < arr.length; i++)   
        {  
            for (int j = i + 1; j < arr.length; j++)   
            {  
                int tmp = 0;  
                if (arr[i] > arr[j])   
                {  
                    tmp = arr[i];  
                    arr[i] = arr[j];  
                    arr[j] = tmp;  
                }  
            }  
        }
        return arr;
    }
}
