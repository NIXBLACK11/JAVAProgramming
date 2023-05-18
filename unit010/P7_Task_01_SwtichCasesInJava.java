package unit01;

public class P7_Task_01_SwtichCasesInJava {

	public static void main(String[] args) {
		int choice = 3;

        switch (choice) {
            case 1:
                int year = java.util.Calendar.getInstance().get(java.util.Calendar.YEAR);
                System.out.println("Current year is: " + year);
                break;
            case 2:
                int month = java.util.Calendar.getInstance().get(java.util.Calendar.MONTH) + 1;
                System.out.println("Current month is: " + month);
                break;
            case 3:
                int day = java.util.Calendar.getInstance().get(java.util.Calendar.DAY_OF_MONTH);
                System.out.println("Current day is: " + day);
                break;
            case 4:
                System.out.println("Not applicable");
                break;
            default:
                System.out.println("Invalid choice");
                break;
        }

	}

}
