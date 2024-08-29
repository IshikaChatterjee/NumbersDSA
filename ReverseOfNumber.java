public class ReverseOfNumber {

    public static int Reverse(int n){

        int reverse = 0;

        while(n != 0){

            int digit = n % 10;
            reverse = reverse * 10 + digit;
            n = n / 10;
        }

        return reverse;
    }

    public static void main(String args[]) {
        
        int n1 = 472;
        int n2 = 470;

        System.out.println(" The Reverse of a the given number is : " + Reverse(n1));
        System.out.println(" The Reverse of a the given number is : " + Reverse(n2));
    
    }
    
}
