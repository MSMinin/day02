package variable;

public class TestClass01 {
	public static void main(String[] args) {
/*
 변수 
  - 데이터를 저장하기 위한 공간
  
 변수 이름 명명 규칙
  - 첫 문자는 소문자로 생성한다.
  - 합성어의 첫 문자는 대문자로 생성한다.
  - 예약어는 사용할 수 없다. [예약어 : 자바에서 이미 사용하고 있는 문법]
  ex)package, public, void 등등으로 변수이름을 하지말라는 뜻
  
  자료형 
  - 정수 : short, int, long (2, 4, 8byte) 
  - 실수 : double, float (4, 8byte)
  - 문자 : byte, char (1, 2byte)
  - 논리형 : boolean (1) -> true(참), false(거짓)만 저장
*/
		int age = 30;
		double weight = 55.0;
		double height = 170.3;
		
		System.out.println("나의 나이는 " + age + "살 입니다.");
		System.out.println("나의 몸무게는 " + weight + "kg 입니다.");
		System.out.println("나의 키는 " + height + "cm 입니다.");
		
	}
}
