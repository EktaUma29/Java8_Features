package fb_assignment.array;

public class MissingNumber {

	public static void main(String[] args) {

		int array[] = {3, 7, 9, 10 };
		int number = 0, k=0;
		
		for(int i=0; i<array.length; i++) {
			if(array[i]!=k++)
				number = k;
		}
		
		System.out.println("missing number: "+ number);

	}

}
