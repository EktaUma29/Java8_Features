package core.java.question;

public class Check {

	static int counter = 0;
	public static void main(String[] args) { 
		
		Check c = new Check();
		
		for(int i=0; ; i++, c.fun()){
		    System.out.println("VALUE OF I: " + i);
		if(i>1)
		break;
		}
		System.out.println("cou nter: " + counter);
		
	}

	private int fun() {
		
		
		return counter++;
	}
}
