import java.util.Scanner;

public class Lesson_1 {
	
	public static void main(String[] args)
	{
		
		Scanner Bascket = new Scanner(System.in); // 사용자로부터 데이터를 입력받는다.
		System.out.print("두 정수를 입력해주세요 !! "); // 두 정수를 입력받도록 도움말을 프린트한다.
		
		int a = Bascket.nextInt(); // 바구니에 입력받은 정수 하나를 넣는다.
		int b = Bascket.nextInt(); // 바구니에 입력받은 두번째 정수를 넣는다.
		
		int sum = a+b; // 두 수를 더해 sum에 입력한다.
		System.out.println(a+" + "+b+ " 은 " +sum); // a,b,sum 순서로 출력하지만 중간 +를 문자로 출력한다.
		
		Bascket.close(); // 모든 작업이 끝났으면 실행을 마무리한다.
	}
}

