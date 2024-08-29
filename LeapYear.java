public class LeapYear {

    public static String isLeapYear(int y){

        if(y % 400 == 0){
            return "Yes";
        }
        else if(y % 100 == 0){
            return "No";
        }
        else if(y % 4 == 0){
            return "Yes";
        }

        else{
            return "No";
        }
    }

    public static void main(String[] args) {
        
        int y1 = 1996;

        System.out.println(isLeapYear(y1));
    }
    
}
