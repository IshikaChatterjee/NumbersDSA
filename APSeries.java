public class APSeries {

   public static int APSum(int n, int a, int d){

        int sum = 0;                                           // we can use float instead of int too
        sum = ( n / 2) * ( 2 * a + (n - 1) * d);
        return sum;
    }

    public static void main(String args[]){

        int n1 = 4;
        int a1 = 2;
        int d1 = 2;

        System.out.println(" Sum Of AP Series is : " + APSum(n1, a1, d1));
    }
    
} 


/*public static float APSum(float n, float a, float d){

    float sum = 0;                                           // we can use float instead of int too
    sum = ( n / 2) * ( 2 * a + (n - 1) * d);
    return sum;
}

public static void main(String args[]){

    float n1 = 4;
    float a1 = 2;
    float d1 = 2;

    System.out.println(" Sum Of AP Series is : " + APSum(n1, a1, d1));
}

}

*/
