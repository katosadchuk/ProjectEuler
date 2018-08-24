import java.util.ArrayList;
import java.util.List;
import java.util.Stack;

public class MultiplesThreeFive {

	public static int sumMult(int below){
		Stack<Integer> stack = new Stack<Integer>();
		int sum = 0;
		for(int i = 1; i < below; i++){
			if(i%3 == 0 || i%5 == 0){
				stack.push(i);
			}
		}
		while(!stack.isEmpty()){
			sum = sum + stack.pop();
		}
		return sum;
	}

	public static void main(String args[]){
		System.out.println(sumMult(10));
		
		
		
	}
}
