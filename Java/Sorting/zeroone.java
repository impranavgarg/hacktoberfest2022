import java.util.Arrays;

public interface zeroone {
    public static void main(String[] args) {
        int[] arr = {1,1,0,0,1,0};
        sort(arr);
        System.out.println(Arrays.toString(arr));

        
    }
    static void sort(int[] arr){
        // while ()
        for (int i = 0; i < arr.length; i++) {
            if(arr[i]==0){

            }
            else if(arr[i]==1){
                for (int j = arr.length-1; j>i; j--) {
                    if(arr[j]==0){
                        int temp = arr[i];
                        arr[j]= arr[i];
                        arr[i]= temp;
                        // break;

                    }
                    else if(arr[i]==arr[j]){
                        
                    }
                    

                    
                }

            }

            
            
        }
    }
    static void sort2(int[] arr){
        for (int i = 0; i < arr.length; i++) {
            if(arr[i]>arr[i+1]){
                int temp = arr[i];
                arr[i+1]= arr[i];
                arr[i]= temp;

            }
            
        }
    }
    
}
