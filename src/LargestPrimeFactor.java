
public class LargestPrimeFactor {
	
	public static int largestPrime(long num){
		int largestPrime = 1;
		
		for(int i=2; i <= num; i++){
			if(num % i == 0){
				for(int l = 1; l <= Math.sqrt(i); l++){
                    if (i % l == 0){
                        break;
                    } else
                    	 while(num%i==0){
                             num=num/i;
                             largestPrime = i;
                    	 }
                     
				}
			}
		
		}
		return largestPrime;
	}
	
	public static void main(String args[]){
		System.out.println(largestPrime(15));
	}
}
