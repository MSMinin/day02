package operator;

import java.util.Scanner;

public class TestTest {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		int n;
		System.out.print("수 입력 : ");
		n = sc.nextInt();
		
		System.out.println(n + " % 2이 " + n % 2 + "이므로 " + n + "은 짝수이다.");
		System.out.println(n + " % 3이 " + n % 3 + "이므로 " + n + "은 3의 배수가 아니다.");
		
		int a,b;
		System.out.print("두수 입력 : ");
		a = sc.nextInt();
		b = sc.nextInt();
		
		System.out.println("num1 : "+ a+ ", num2 : " +b);
		String result = (a > b) ? "a가 b보다 크다." : "b가 a보다 크다.";
		System.out.println(result);
		
	}

}
