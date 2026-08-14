package Aug_13_2026;

import java.util.Arrays;

class Sorting{
   
    static int[] bubblesort(int[] arr, int n){
        boolean swapped=false;
        for(int i=0;i<n;i++){
            for(int j=0;j<n-i-1;j++){
                if(arr[j]>arr[j+1]){

                
                int temp=arr[j];
                arr[j]=arr[j+1];
                arr[j+1]=temp;
                }
              
            }
          
        }
        return arr;
    }


    public static void main(String[] args) {
        int[] arr={10,11,20,21,30,31,41,40,-1};
        // System.out.println(Arrays.toString(bubblesort(arr,arr.length)));
        // System.out.println(Arrays.toString(arr));
        System.out.println(Arrays.toString(bubblesort(arr,arr.length)));
        
    }
}