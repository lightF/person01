package sec02.exam09;

public class LogicalOperatorExample {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int charCode = 'a';
		
		if((charCode>=65) & (charCode<-90)) {
			System.out.println("대문자이군요");
		}
		
		if((charCode>=97) && (charCode<122)) {
			System.out.println("소문자이군요");
		}
		//48~57
		if( !(charCode>=48) && !(charCode<57)) {
			System.out.println("0-9숫자이군요");
		}
		
		int value = 6;
		// | or 
		if((value%2==0) | (value%3==0)) {
			System.out.println("2 또는 3의 배수이군요");
		}
		
		if((value%2==0) || (value%3==0)) {
			System.out.println("2 또는 3의 배수이군요");
		}
	}

}