import java.util.ArrayList;
import java.util.List;
import java.util.Stack;

public class MultiplesThreeFive {

	public static void main(String args[]){
		Stack<Integer> stack = new Stack<Integer>();
		int sum = 0;
		for(int i = 1; i < 1000000; i++){
			if(i%3 == 0 || i%5 == 0){
				stack.push(i);
			}
		}
		while(!stack.isEmpty()){
			sum = sum + stack.pop();
		}
		System.out.println(sum);
		
		
		//int x = 12;
		//System.out.println("Hi" + x);
	}
}
