package sec03.exam02;

public class KoreanExample {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Korean k1 = new Korean("김승균", "01230123-1234234");
		System.out.println("k1.name: " + k1.name);
		System.out.println("k1.ssn: " + k1.ssn);
		
		System.out.println();
		
		Korean k2 = new Korean("하나", "5234234-234234");
		System.out.println("k2.name: " + k2.name);
		System.out.println("k2.ssn: " + k2.ssn);
	}

}
