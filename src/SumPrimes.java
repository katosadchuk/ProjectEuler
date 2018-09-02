import java.util.ArrayList;

/*
Find the sum of all the primes below two million.
*/

public class SumPrimes {

    public static long find(long limit){
       ArrayList<Integer> primes = new ArrayList<Integer>();
       long sum = 0;
       primes.add(2);
       primes.add(3);
    
       for(int i = 5; i < limit; i+= 2){
           for(int j = 2; j <= Math.sqrt(i); j++){
               if(i % j == 0){
                    i+= 2;
                    break;
               }
           }
           primes.add(i);
           
       }
       for(int i = 0; i < primes.size(); i++){
           int x = primes.get(i);
           sum += x;
       }


       return sum;
    }


    public static void main(String args[]){
       
        System.out.println(find(2000000));

    }
}