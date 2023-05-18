package unit01;

public class P2_Task02_ConstantsInJava {
	final static int GLOBAL_CONSTANT = 23;
	public static void main(String[] args) {
		final int LOCAL_CONSTANT = 24;
		
		//The final field P2_Task02_ConstantsInJava.GLOBAL_CONSTANT cannot be assigned
		GLOBAL_CONSTANT = 44;
		
		//The final local variable LOCAL_CONSTANT cannot be assigned. It must be blank and not using a compound assignment
		LOCAL_CONSTANT = 66;

	}

}
