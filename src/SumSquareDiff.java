/*

The sum of the squares of the first ten natural numbers is,

1^2 + 2^2 + ... + 10^2 = 385
The square of the sum of the first ten natural numbers is,

(1 + 2 + ... + 10)^2 = 55^2 = 3025
Hence the difference between the sum of the squares of the first ten natural numbers and the square of the sum is 3025 − 385 = 2640.

Find the difference between the sum of the squares of the first one hundred natural numbers and the square of the sum.

*/

public class SumSquareDiff{

    public static double calculate(int upperbound){
        double ans = 0;

        double sum = (upperbound * (upperbound + 1))/2;
        double sumOfSquares = (upperbound * (upperbound + 1) * (2*upperbound + 1))/6;


        ans = Math.pow(sum, 2) - sumOfSquares;

        return ans;
    }

    public static void main(String ars[]){
        System.out.println(calculate(100));
    } 
}