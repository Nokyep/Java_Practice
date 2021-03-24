import java.util.Scanner;

public class Lesson_4 {
	
	public static void main(String[] args)
	{
		
		Scanner scanner = new Scanner(System.in); // 사용자로부터 데이터를 입력받는다.
		System.out.print("점 (x,y)의 좌표를 입력하세요>>  "); 
		
		int x = scanner.nextInt(); 
		int y = scanner.nextInt(); 
		
		if (x > 50 && x < 100 && y > 50 && y < 100)
		{
			System.out.print("점("+x+","+y+")은 (50,50)과 (100,100)의 '사각형 내'에 있습니다.");
		}
		else
			System.out.print("점("+x+","+y+")은 (50,50)과 (100,100)의 '사각형 밖'에 있습니다.");
	
		scanner.close(); // 모든 작업이 끝났으면 실행을 마무리한다.
	}
}

