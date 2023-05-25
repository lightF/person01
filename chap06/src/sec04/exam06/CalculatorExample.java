package sec04.exam06;

public class CalculatorExample {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Calculator MyCalcu = new Calculator();
		
		double result1 = MyCalcu.areaRectangle(10);
		
		double result2 = MyCalcu.areaRectabgle(10, 20);
		
		System.out.println("정사각형 넓이= " + result1);
		System.out.println("직사각형 넓이= " + result2);
	}
}