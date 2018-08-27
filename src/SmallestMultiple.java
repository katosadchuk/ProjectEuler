/*
2520 is the smallest number that can be divided by each of the numbers from 1 to 10 without any remainder.

What is the smallest positive number that is evenly divisible by all of the numbers from 1 to 20?

(LCM of 1-20)
a*b = gcd(a, b) * lcm(a, b)
*/

public class SmallestMultiple {

    public static long gcd(long x, long y){
        if(x == 0|| y == 0){
            return Math.max(x, y);
        } else if(x == y){
            return x;
        } else if( x > y) {
            return gcd(x%y, y);
        } else {
            return gcd(x, y%x);
        }
    }

   
    public static void main(String args[]){
        long ans = 2520;
 
        for(long i = 11; i <=20; i++){
           ans *= i /gcd(i,  ans);
            
            }

        System.out.println(ans);
        }
       

    }
