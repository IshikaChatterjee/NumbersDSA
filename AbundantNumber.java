public class AbundantNumber {

    public static boolean isAbundant(int num){

        int sum = 0;

        for(int i = 1; i <= num / 2; i++){

            if(num % i == 0){
                sum = sum + i;
            }
        }

        return sum > num;
    }

    public static void main(String args[]){

        int n1 = 21;
        int n2 = 18;

        if(isAbundant(n1)){
            System.out.println(" YES it ia an Abundant number. ");

        }

        else {
            System.out.println(" No its not an Abundant number. ");
        }

        if(isAbundant(n2)){
            System.out.println(" YES it ia an Abundant number. ");

        }

        else {
            System.out.println(" No its not an Abundant number. ");
        }


        }
    }
    

