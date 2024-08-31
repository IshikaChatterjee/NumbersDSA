public class HarshadNumber1 {
    public static boolean isHarshad(int n){

        int temp = n;
        int sum = 0;

        while(temp > 0){
            sum =  sum + temp % 10;
            temp = temp / 10;
        }

        return (n % sum == 0);
    }

    public static void main(String[] args) {
        
        int n1 = 378;
        int n2 = 379;

        if(isHarshad(n1)){
            System.out.println(" YES it ia a Harshad number. ");

        }

        else {
            System.out.println(" No its not a Harshad number. ");
        }

        if(isHarshad(n2)){
            System.out.println(" YES it ia a Harshad number. ");

        }

        else {
            System.out.println(" No its not a Harshad number. ");
        }

    }
    
}
