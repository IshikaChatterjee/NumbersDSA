public class EvenorOdd {

    static String EvenOdd(int n){

        if(n % 2 == 0){
            return "Even";
        }
        else if(n % 2 != 0){
            return "Odd";
        }

        else
        return "Error";
    }

    public static void main(String args[]){

        int n1 = 4;
        int n2 = 5;
        System.out.println( n1 + " is " + EvenOdd(n1));
        System.out.println( n2 + " is " + EvenOdd(n2));

    }


    
}
