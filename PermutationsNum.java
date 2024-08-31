public class PermutationsNum {

    public static int factorial(int n){

        int fact = 1;
        for(int i = 1; i <= n; i++){
            fact = fact * i;
        }
        return fact;
    }

    public static int Permutation(int N, int R){

        if(R > N){
            return 0; 
        }

        
            return factorial(N) / factorial(N-R); 
        
    
        }
        public static void main(String args[]){

            int N1 = 6;
            int R1 = 4;

            int permu = Permutation(N1, R1);

            System.out.println(" Permuation is : " +permu);
            System.out.println(permu);
        }
}
