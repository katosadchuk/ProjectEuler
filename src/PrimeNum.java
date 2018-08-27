/*
What is the 10 001st prime number?

*/

public class PrimeNum {

    public static long findPrime(int val){
        long prime = 13;
        int index;

        for(index = 6; index <= val; index++){
            prime += 2;
            for(int i = 2; i < Math.sqrt(prime); i++){
                if(prime % i == 0){
                    prime+=2;
                    i = 2;
                }
            }
        }






        return prime;
    }


    public static void main(String[] args) {
        System.out.println(findPrime(10001));
    }
}