package sec03.exam01;

public class PromotionExample {
	//byte < short < char < int < long
	public static void main(String[] args) {
		//자동 타입 변환
		byte byteValue = 127;
		int intValue = byteValue;
		System.out.println("intValue: " + intValue);
		
		//byte byteValue2 = -127;
		//char charValue2 = byteValue;
		//System.out.println("charValue2: " + charValue2);
		
		short shortValue = 32767;
		intValue = shortValue;
		System.out.println("intValue: " + intValue);
		
		char charValue = '가';
		intValue = charValue;
		System.out.println("가의 유니코드: " + intValue);
		
		intValue = 50;
		long longValue = intValue;;
		System.out.println("longValue: " + longValue);	
		
		longValue = 100;
		float floatValue = longValue; 
		System.out.println("floatValue: " + floatValue);
		
		floatValue = 100.5F;
		double doubleValue = floatValue;
		System.out.println("doubleValue: " + doubleValue);
	}

}
