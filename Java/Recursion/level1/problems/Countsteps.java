package problems;

public class Countsteps {
    public static void main(String[] args) {
        System.out.println(numberOfSteps(302104));
//        numberOfSteps(400054);
//        System.out.println(count);
    }

    static int count = 0;
    static int numberOfSteps(int n) {
        if(n==0){
//            System.out.println(count);
            return  count;
        }

        if(n%2==0){
            count = count +1;
            return numberOfSteps(n/2);
        }
        else{
            count = count +1;
            return numberOfSteps(n-1);

        }

    }

}
