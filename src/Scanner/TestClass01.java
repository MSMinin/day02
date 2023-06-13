package Scanner;

import java.util.Scanner;

public class TestClass01 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int num;
		String name;
		
		System.out.print("이름 입력 : ");
		name = sc.next();
		System.out.print("수 입력 : ");
		num = sc.nextInt();
		
		System.out.println("이름 : " + name);
		System.out.println("입력 수 : " + num);
	}

}

