import java.util.Scanner;

public class Lesson_2 {
	
	public static void main(String[] args)
	{
		
		Scanner height = new Scanner(System.in); // 사용자로부터 데이터를 입력받는다.
		System.out.print("건물이 몇 층인지 입력해주세요 =  "); // 건물 높이를 입력받도록 도움말을 프린트한다.
		
		int a = height.nextInt(); // 입력받은 정수 하나를 넣는다.
		int Building = 5; // 한 층의 높이는 5m
		
		int result = a * Building; // 두 수를 연산함.
		System.out.println("입력하신 건물의 층 수는 = "+a+ "층 입니다."); 
		System.out.println("따라서 건물의 높이는 = "+result+ "m 입니다."); 
		
		height.close(); // 모든 작업이 끝났으면 실행을 마무리한다.
	}
}

