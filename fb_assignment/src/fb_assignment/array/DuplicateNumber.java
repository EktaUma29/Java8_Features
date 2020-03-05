package fb_assignment.array;

public class DuplicateNumber {

	public static void main(String[] args) {

		int array[] = {2, 3, 5, 6, 5};
		int duplicate = 0;
		for(int i=0; i<array.length; i++) {
			
			duplicate = checkDuplicate(array, array[0]);
			
			
		}
		System.out.println("Duplicate: " +duplicate);
		
	}

	private static int checkDuplicate(int[] array, int k) {

		for(int i=0; i<array.length; i++) {
			
			if(array[i] == k) {
				return k;
			}
			
		}
		
		return 0;
	}

}
