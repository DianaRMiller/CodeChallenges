import java.util.Arrays;
//HISTOGRAM
public class CodeChallenge {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int [] elements = {3,7,3,5,6,8,7,5,3,2,1,0,0,1,1,1,1,7,8,9,15};
		//SKETCH ON PAPER YOUR IDEA!!!!
		//count the frequency of elements inside the elements array
		//print the frequency of all elements
		//think about the largest number in this array
		
		//HINT:Find the max
		int max = -1000000;
		//Create an array of size= max+1
		for (int x : elements) {
			if (x>max)
				max=x;
		}
		//create an array call frequency(you can start from 0 to all positive numbers)
		//if negative you'll have to declare a int min = 10000000;
		int [] freq = new int[max+1];//max number is 15 + 1=16
		//we need a for loop to go into the elements array
		for (int x : elements) {
			freq [x]++;
		}
		for (int i=0; i<freq.length; i++) {
			System.out.println("Freq of " + i + " is = " + freq[i]);//print the frequency of elements in the array
		}
	}

}
