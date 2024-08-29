public class PalindromeChecker {

    public static boolean isPalindrome(int n) {

		 
        int originalNum = n;
        int reversedNum = 0;

        while (n != 0) {
            int digit = n % 10;
            reversedNum = reversedNum * 10 + digit;
            n /= 10;
        }

        if(originalNum == reversedNum){
            return true;
        }
        return false;
    }

    public static void main(String[] args) {
      
        int n1 = 51415;
       // int n2 = 2345;
  

        System.out.println(isPalindrome(n1));  // Output : true
       // System.out.println(isPalindrome(n1)); // Output: false
      
       
    } 
}
