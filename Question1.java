// Author: Chris Fietkiewicz. Starter code for Lab #2.
// Raja Hammad Mehmood
// This program completes the methods provided which uses recursion to print a numbered list in normal and reverse order  
public class Question1 {
	/**
	 * writes a numerical list 
	 * 
	 * @param1 is the array list
	 * @param2 is the index of the array given
	 * 
	 */
	public static void startAtFront(String[] s, int index) {
		if(s.length>index) {
			System.out.print(index+1 +" . "+s[index]+"   ");
			startAtFront(s,index+1);
			
			
		}
		
	}
	/**
	 * writes a numerical list 
	 * 
	 * @param1 is the array list
	 * @param2 is the index of the array given
	 * 
	 */
	public static void startAtEnd(String[] s, int index) {
		if (index>=0) {
			 startAtEnd(s, index-1);
            System.out.print(index+1 +" . "+s[index]+"   ");
           
        }
	}

	public static void main(String[] args) {
		String[] s1 = {"Sunday", "Monday", "Tuesday", "Wednesday", "Thursday", "Friday", "Saturday"};
		startAtFront(s1, 0); // Start at front of array (index = 0)
		System.out.println();
		String[] s2 = {"Spring", "Summer", "Fall", "Winter"};
		startAtEnd(s2, s2.length - 1); // Start at end of array (index = length - 1)
	}
}