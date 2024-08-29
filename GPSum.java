public class GPSum {
   

        static double sumOfGP(double a, double r, int n) {
            double sum = 0.0;
            if (r == 1) {
                return n * a;
            }
           
         sum = a * (1 - Math.pow(r, n)) / (1 - r);
            return sum;
        }
    
        public static void main(String[] args) {
            
            double a1 = 1;
            double r1 = 0.5;
            int n1 = 3;
            System.out.println("Sum of the G.P. series: " + sumOfGP(a1, r1, n1)); 
    
           
            double a2 = 3;
            double r2 = 5;
            int n2 = 2;
            System.out.println("Sum of the G.P. series: " + sumOfGP(a2, r2, n2)); 
        }
    }
    

