/* Problem Statement: Given a range of numbers, find all the palindrome numbers in the range.

Note: A palindromic number is a number that remains the same when its digits are reversed.OR  a palindrome is a number that reads the same forward and backward Eg: 121,1221, 2552

Examples:

Example 1:
Input: min = 10 , max = 50
Output: 11 22 33 44
Explanation: 11, 22, 33, 44 will remain the same when they read from forward or backward.

Example2:
Input: min = 100 , max = 150
Output: 101 111 121 131 141
Explanation: 11, 22, 33, 44 will remain the same when they read from forward or backward. */

public class Palindromerange{

    public static boolean isPalindrome(int n){

        int reverse = 0;
        int num = n;

        while(num != 0){
            int digit = num % 10;
            reverse = reverse * 10 + digit;
            num = num / 10;

         }
         if(n == reverse){
            return true;
         }
         return false;
        }

        public static void main(String args[]){
            int min = 100;
            int max = 150;
                System.out.println("Palindrome numbers in the given range are as follows:");
            for(int i = min; i <= max; i++){
                if(isPalindrome(i)){
                        System.out.print(i + " ");
                }
            }


        }
    }
