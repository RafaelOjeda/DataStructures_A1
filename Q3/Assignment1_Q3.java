/**************************************************************
 Purpose/Description: Finds the exponent of a number using exponentiation() with time O(logN)
 Author’s Panther ID:  6334830
 Certification:
 I hereby certify that this work is my own and none of it is the work of
 any other person.
 **************************************************************/
public class Assignment1_Q3 {

    public static long exponentiation(long x, int n) {
        if (n == 0) { // stopping point
            return 1;
        } else if (n == 1) { // stopping point
            return x;
        } else if (n % 2 == 1) { // Takes care of all odd nums
            return x * exponentiation(x * x, n/2);
        } else { // Takes care of all even nums
            return exponentiation(x * x, n/2);
        }
    }

    public static void main(String[] args) {
        System.out.println(exponentiation(10,3)); // Testing
    }
}
