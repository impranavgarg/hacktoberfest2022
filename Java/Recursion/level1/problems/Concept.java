package problems;

public class Concept {
    public static void main(String[] args) {
        fun(5);

    }
    static  void  fun(int n) {
        if(n==0){
            return;

        }
        System.out.println(n);
//        fun(n--);
//        fun(n--);
//        n-- vs --n
//        pass n then subtract vs subtract first pass after that
        fun(--n);
    }


}
