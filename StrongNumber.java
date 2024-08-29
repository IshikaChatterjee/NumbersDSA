public class StrongNumber {
    public static int Factorial(int N){

        int fact = 1;
        for(int i = 1; i <= N; i++){

            fact = fact * i;
        }
        return fact;
    }

    public static int StrongNum(int num){

        int sum = 0;

        while(num != 0){
            int digit = num % 10;
            sum = sum + Factorial(digit);
            num = num / 10;
        }
        return sum;
    }

    public static void main(String args[]){

        int num1 = 145;
        //int num1 = 26;
        int answer = StrongNum(num1);

      if (answer == num1 && num1 != 0) {

         System.out.println("YES");
      } 
      else {
         System.out.println("NO");
      }

    }
}
