/**
 * SearchInStrings
 */
public class SearchInStrings {
    public static void main(String[] args) {
        String name = "PRANAV";
        char target = 'k';
        System.out.println(stringSearch(name, target));
        
    }
     
    static Boolean stringSearch(String str,int target){
        if(str.length()==0){
            return false;
        }
        for (int i = 0; i < str.length(); i++) {
            if(target ==str.charAt(i)){
                return true;
            }
            
        }
        return false;
    }

    
}