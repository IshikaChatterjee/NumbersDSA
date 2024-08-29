public class PositiveOrNegative {

    static String CheckNumber(int n){

        if(n > 0){
            return "Positive";
        }

        else if(n < 0){
            return "Negative";
        }

        else {
            return "zero";
        }
    }

    public static void main(String[] args) {
        
        int n1 = 6;
        int n2 = -2;

        System.out.println( n1 + " : " + CheckNumber(n1));
        System.out.println( n2 + " : " + CheckNumber(n2));
    }
    
}
