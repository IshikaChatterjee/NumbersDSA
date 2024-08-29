public class PrimeNumberRange {

    static boolean isPrime(int n){

        if(n == 1 || n == 0){
            return false;
        }

        for(int i = 2; i <= Math.sqrt(n); i++){
            if(n % i == 0){
                return false;
            }
        }
        return true;
    }

    public static void PrintPrimeBetweenRange(int a, int b){

        System.out.println(" Prime numbers between given range are as follows : ");
        for(int i = a; i <= b; i++){
            if(isPrime(i)){
                System.out.print(i + " ");
            }
        }
    }

    public static void main(String args[]){

        int a = 5 , b = 15;

       // System.out.println(" Prime numbers between given range are as follows : ");  // we can write it here also gives same output
        
        PrintPrimeBetweenRange(a,b);

    }
    
}
