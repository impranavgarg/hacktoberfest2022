
/**
 * Hello
 */
import java.util.Scanner;



public class Hello {

    public static void main(String[] args) {
       

        Scanner s = new Scanner(System.in);
        String str = s.next();
        int a = s.nextInt();
        int b = s.nextInt();
        int c = s.nextInt();
        int result = ((a + b + c)/3) ;
        System.out.println(str);
        System.out.print(result);

        
    }
}