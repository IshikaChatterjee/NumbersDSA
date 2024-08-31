public class GCDNumbers {

    public static int FindGCD(int a, int b){

        if(a == 0){

            return b;
        }

        while(a > 0 && b > 0){

            if(a > b){

                a = a % b;
            }

            else {
                b = b % a;
            }

        }

        return a;
    }

    public static void main(String args[]){

        int n1 = 20;
        int n2 = 15;

        //int gcd = FindGCD(n1, n2);

        System.out.println(" GCD of " + n1 + " and " + n2 + " is : " +FindGCD(n1, n2));
        //System.out.println(" GCD of " + n1 + " and " + n2 + " is : " +gcd);

    }
    
}
