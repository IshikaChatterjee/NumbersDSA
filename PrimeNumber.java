public class PrimeNumber{
    static boolean isPrime(int n){

        if(n == 1 || n == 0){
            return false;
        }

        else if(n == 2){
            return true;
        }

        else if(n % 2 == 0){
            return false;
        }

        for(int i = 3; i <= Math.sqrt(n); i += 2){
            if(n % i == 0){
                return false;
            }
        }
            return true;
    }

    public static void main(String args[]){

        int n1 = 5;
        int n2 = 6;

        System.out.println(isPrime(n1));
        System.out.println(isPrime(n2));
    }
}