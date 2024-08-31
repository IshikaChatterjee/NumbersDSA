public class HarshadNumber {

    public static void main(String args[]){

        int n = 378;
        int temp = n;
        int sum = 0;

        while(temp != 0){
            sum =  sum + temp % 10;
            temp = temp / 10;
        }

        if(n % sum  == 0){
            System.out.println(" YES it is a Harshad number. ");
        }

        else{
            System.out.println(" NO it is not a Harshad number. "); 
        }



    }
    
}
