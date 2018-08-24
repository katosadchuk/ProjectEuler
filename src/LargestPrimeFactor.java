
public class LargestPrimeFactor {
	
	public static int largestPrime(long num){
		int largestPrime = 1;
		
		while(num % 2 == 0){
			largestPrime = 2;
			num = num/2;
		} 

		for(int i = 3; i <=num; i+=2){
			while(num % i == 0){
				largestPrime = i;
				num = num/i;

			}
		}

		return largestPrime;
	}
	
	public static void main(String args[]){
		System.out.println(largestPrime(23));
		System.out.println(largestPrime(2334));
		System.out.println(largestPrime(333));
		System.out.println(largestPrime(104));
		System.out.println(largestPrime(5));
		System.out.println(largestPrime(99));
		System.out.println(largestPrime(8));
	}
}
