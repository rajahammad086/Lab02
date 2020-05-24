// Author: Chris Fietkiewicz. Starter code for Lab #2.
// Raja Hammad Mehmood
// This program completes the methods provided which computes the sum using recursion. 
public class Question2 {
	
	/**
	 * shows the addition of the array list starting from the first position using recursion
	 * 
	 * @param1 is the array list
	 * @param2 is the index of the array given
	 * @return is the sum
	 */
	public static int forwardSum(int[] data, int index) {
if (index>0) {
	int sum=data[index]+forwardSum(data, index-1);
	System.out.println("Current sum is "+sum);
	return (sum);
            
            }
else {
	System.out.println("Current sum is "+(data[index]));
	return (data[index]);
}
	}
    
	/**
	 * shows the reverse addition of the array list starting from the last position using recursion
	 * 
	 * @param1 is the array list
	 * @param2 is the index of the array given
	 * @return is the sum
	 */
	public static int reverseSum(int[] data, int index) {
		if (index<data.length-1) {
			int sum=data[index]+reverseSum(data, index+1);
			System.out.println("Current sum is "+sum);
			return (sum);
		            
		            }
		else {
			System.out.println("Current sum is "+(data[index]));
			return (data[index]);
		}	
	}

	public static void main(String[] args) {
		int[] data = {10, 20, 30, 40};
		int s = forwardSum(data, data.length - 1);
		System.out.println("Final sum is " + s);
		System.out.println();
		s = reverseSum(data, 0);
		System.out.println("Final sum is " + s);
	}
}