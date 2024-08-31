public class LCMNumbers {

    public static int gcd(int a, int b){

        if(b == 0){

            return a;
        }

        return gcd(b, a%b);
    }
    
    public static void main(String args[]){

        int n1 = 6;
        int n2 = 9;

        
        int GCD = gcd(n1, n2);
        int lcm = (n1 * n2) / GCD;

        System.out.println(" The LCM of " + n1 + " and " + n2 + " is : " +lcm);
    }
}
