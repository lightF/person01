package sec02.exam06;

public class Test2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int total = 0;
		for (int i = 1; i <= 10; i++) {
		    total += i;
		    System.out.print(i);
		    if (i != 10) {
		        System.out.print("+");
		    }
		}
		System.out.println("=" + total);
	}

}
