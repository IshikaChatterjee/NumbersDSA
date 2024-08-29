public class PerfectNumber {

    static boolean isPerfect(int n){

        int sum = 0;

        for(int i = 1; i <= n-1; i++){
            if(n % i == 0){
                sum = sum + i;
            
        }

    }

    if(sum == n){
        return true;
    }
    else{
        return false;
    }
    
}

public static void main(String args[]){

    int n1 = 3;

    System.out.println(isPerfect(n1));
}
}


// Another Approach

/*static boolean isPerfect(int n) {
    int sum = 0;
    for (int i = 1; i <= n - 1; i++) {
        if (n % i == 0)
        sum = sum + i;
    }
    if (sum == n)
      return true;
    else return false;
  }

  public static void main(String[] args) {

    boolean ex1 = isPerfect(6);
    boolean ex2 = isPerfect(15);
    

    if (ex1 == true) {
      System.out.println("6 is a perfect Number");
    } else System.out.println("6 is a perfect Number");

    if (ex2 == true) {
      System.out.println("15 is a perfect Number");
    } else System.out.println("15 is not a perfect Number");


  }
} */
