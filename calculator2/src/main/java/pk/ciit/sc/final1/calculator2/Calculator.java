package pk.ciit.sc.final1.calculator2;

import java.rmi.AccessException;

public class Calculator {

	    public int findMax(int num1, int num2, int num3) {
		int[] arr = { num1, num2, num3 };
		int max = 0;
		for (int i = 1; i < arr.length; i++) {
		if (arr[i] > max)
		max = arr[i];
		}
		return max;
		}
	
	
		public int square(int num) throws IllegalArgumentException {
		int result = 0;
		if (num > 0 && num < 10) {
		result = num * num;
		} else
		throw new IllegalArgumentException();
		return result;
		}
		
		public int cube (int num1){
			
			return num1*num1*num1;
		}
		
		public int devide(int num1 ,int num2 ) throws ArithmeticException {
			
			if(num2==0){
				
				throw new ArithmeticException("divid by zero not passible");
			}
			return num1/num2;
				
		}
		
		
}
