import java.util.Arrays;

class Searchin2Darray {
    public static void main(String[] args) {
        int [][] array = {{1,5,6,8},{15,14,18,17},{85,87,84,45,82}};
        int target = 87;
        int[] ans  = search(array, target);
        System.out.println(Arrays.toString(ans));
        
    }


    static int[] search(int[][] arr, int target){

        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr[i].length; j++) {
                if(arr[i][j]== target){
                    return new int[]{i,j};

                }

                
            }
            
            
        }
        // return null;
        return new int[]{-1,-1};
    }
    
}
