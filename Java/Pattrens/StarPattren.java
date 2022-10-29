/**
 * StarPattren
 */
public class StarPattren {
    public static void main(String[] args) {
        // pattren1(4);
        // pattren2(4);
        // pattren3(4);
        // pattren4(5);
        // pattren5(5);
        // pattren6(5);
        // pattren7(4);
        pattren8(4);
        
    }
    /*
    *
    * * 
    * * *
    * * * *
    */
    static void pattren1(int n){
        for (int i = 0; i < n; i++) {
            for (int j = 0; j <=i ; j++) {
                System.out.print("*");
                
            }
            System.out.println();
        }

    }    
    /*
    ****
    ***
    **
    *
    */
    static void pattren2(int n){
        for (int i = n; i>0; i--) {
            for (int j = 0; j < i; j++) {
                System.out.print("*");
                
            }
            System.out.println();
            
        }
    }
    /*
    1
    1 2
    1 2 3
    1 2 3 4
    1 2 3 4 5
    */
    static void pattren3(int n){
        for (int i = 1; i <=n; i++) {
            for (int j = 1; j <= i; j++) {
                System.out.print(j);
                System.out.print(" ");
                
            }
            System.out.println();
            
        }

    }
    /*
    *
    **
    ***
    ****
    *****
    ****
    ***
    **
    *
    */
    static void pattren4(int n){
        // for (int i = 0; i < n; i++) {
        //     for (int j = 0; j <=i ; j++) {
        //         System.out.print("*");
                
        //     }
        //     System.out.println();
        // }
        // pattren2(n-1);
        for (int i = 1; i < 2*n; i++) {
            if(i>n){
                for (int j = 1; j <=(2*n)-i; j++) {
                    System.out.print("*");
                    
                }

            }
            else{
                for (int j = 1; j <=i; j++) {
                    System.out.print("*");    
                }
            }
            System.out.println();

            
        }
        
        

    }
    /*
         *
        * *
       * * *
      * * * *
     * * * * *
      * * * *
       * * *
        * *
         *
    */
    static void pattren5(int n){
        for (int i = 1; i < 2*n; i++) {
            if(i>n){
                for (int j = 1; j <=i-n; j++) {
                    System.out.print(" ");
                    
                }
                for (int j = 1; j <=(2*n)-i; j++) {
                    System.out.print("* ");
                    
                }

            }
            else{
                for (int j = 1; j <=n-i; j++) {
                    System.out.print(" ");
                    
                }
                for (int j = 1; j <=i; j++) {
                    System.out.print("* ");    
                }

            }
            System.out.println();

            
        }

    }
    /*
            1
          2 1 2
        3 2 1 2 3
      4 3 2 1 2 3 4
    5 4 3 2 1 2 3 4 5

    */
    static void pattren6(int n){
        for (int i = 1; i <= n; i++) {
            for (int j = 1; j <=n-i; j++) {
                System.out.print("  ");
                
            }
            for (int j = i; j>0; j--) {
                System.out.print(j );    
                System.out.print(" ");
            }
            for (int j = 2; j <=i; j++) {
                System.out.print(j ); 
                System.out.print(" "); 
                
            }

            System.out.println();
        }

    }
    /*
         1
        212
       32123
      4321234
       32123
        212
         1

    */
    static void pattren7(int n){
        for (int i = 1; i < 2*n; i++) {
            if(i>n){
                for (int j = 1; j <=i-n; j++) {
                    System.out.print(" ");
                    
                }
                for (int j = (2*n)-i; j>0; j--) {
                    System.out.print(j );    
                    // System.out.print(" ");
                }
                for (int j = 2; j <=(2*n)-i ; j++) {
                    System.out.print(j ); 
                    // System.out.print(" "); 
                    
                }

            }
            else{
                for (int j = 1; j <=n-i; j++) {
                    System.out.print(" ");
                    
                }
                for (int j = i; j>0; j--) {
                    System.out.print(j );    
                    // System.out.print(" ");
                }
                for (int j = 2; j <=i; j++) {
                    System.out.print(j ); 
                    // System.out.print(" "); 
                    
                }

            }
            System.out.println();
            
        }

    }
    /*
         4 4 4 4 4 4 4  
         4 3 3 3 3 3 4   
         4 3 2 2 2 3 4   
         4 3 2 1 2 3 4   
         4 3 2 2 2 3 4   
         4 3 3 3 3 3 4   
         4 4 4 4 4 4 4  
    */
    static void pattren8(int n){
        for (int i = 0; i <= 2*n; i++) {
            for (int j = 0; j <= 2*n; j++) {
                int atEveryIndex = n-Math.min(Math.min(i, j), Math.min(2*n-i, 2*n-j));
                System.out.print(atEveryIndex);
                
            }
            System.out.println();

            
        }

    }

}