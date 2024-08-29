public class SumOfNaturalNum {
    public static int SumOfNumbers(int n){

        int sum = 0;

        for(int i = 1; i <= n; i++){

            sum = sum + i;
        }
        return sum;
    }

    public static void main(String args[]){

        int n = 6;

        System.out.println(" The sum of first " + n + " Natural numbers : " + SumOfNumbers(n));
    }
}
