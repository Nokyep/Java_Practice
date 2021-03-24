import java.util.Scanner;

public class Lesson_6 {
	
	public static void main(String[] args)
	{
		
		Scanner scanner = new Scanner(System.in); // 사용자로부터 데이터를 입력받는다.
		System.out.print("돈의 액수를 입력하세요>>  "); 
		
		int money = scanner.nextInt(); 
		int sum = 0;
		
		if (money % 50000 != 0)
		{
			sum = money / 50000;
			System.out.print("5만원권은 "+sum+"장, ");
			money = money - (sum * 50000);
		
			sum = money / 10000;
			System.out.print("1만원권은 "+sum+"장, ");
			money = money - (sum * 10000);
		
			sum = money / 1000;
			System.out.print("천원권은 "+sum+"장, ");
			money = money - (sum * 1000);
		
			sum = money / 500;
			System.out.print("500원은 "+sum+"개, ");
			money = money - (sum * 500);
		
			sum = money / 100;
			System.out.print("100원은 "+sum+"개, ");
			money = money - (sum * 100);
		
			sum = money / 10;
			System.out.print("10원은 "+sum+"개, ");
			money = money - (sum * 10);
		
			sum = money / 1;
			System.out.print("1원은 "+sum+"개, ");
			money = money - (sum * 1);
		}
		else 
		{
			sum = money / 50000;
			System.out.print("5만원권만  "+sum+"장 입니다."); 
		}
				
		scanner.close(); // 모든 작업이 끝났으면 실행을 마무리한다.
	}
}

