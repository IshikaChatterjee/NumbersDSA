public class factorial {

    public static int factorial(int X){

        int fact = 1;
        for(int i = 1; i <=  X; i++){
            fact = fact * i;
        }
            return fact;
    }

    public static void main(String args[]){

        int X1 = 5;
        int X2 = 3;

        System.out.println(" The factorial of " + X1 + " is : " + factorial(X1));
        System.out.println(" The factorial of " + X2 + " is : " + factorial(X2));
    }
    
}
