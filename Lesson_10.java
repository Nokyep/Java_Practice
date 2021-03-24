package Java_Essential;
import java.util.Scanner;

public class Lesson_10 {
	
	public static void main(String[] args)
	{
		
		Scanner scanner = new Scanner(System.in); // 사용자로부터 데이터를 입력받는다.
		System.out.print("커피를 주문하세요.>>  ");
		
		String coffee = scanner.next(); // String은 next()로 입력받는다.
		int num = scanner.nextInt();
		
		if (coffee.equals("에스프레소") && num > 9)
		{			
			System.out.println("주문하신 커피는 "+coffee+","+num+"잔이며,");
			num *= 2000 - (2000 * 5/100); // 5%할인 수식
			System.out.println("가격은 5% 할인되어 "+num+"원 입니다.");			
		}
		
		else if (coffee.equals("에스프레소"))
		{			
			System.out.println("주문하신 커피는 "+coffee+","+num+"잔이며,");
			num *= 2000;
			System.out.println("가격은"+num+"원 입니다.");
			
		}		
		
		else if (coffee.equals("아메리카노"))
		{
			
			System.out.println("주문하신 커피는 "+coffee+","+num+"잔이며,");
			num *= 2500;
			System.out.println("가격은"+num+"원 입니다.");
		}
		else if (coffee.equals("카푸치노"))
		{
			
			System.out.println("주문하신 커피는 "+coffee+","+num+"잔이며,");
			num *= 3000;
			System.out.println("가격은"+num+"원 입니다.");
		}
		else if (coffee.equals("카페라떼"))
		{
			
			System.out.println("주문하신 커피는 "+coffee+", "+num+"잔이며,");
			num *= 3500;
			System.out.println("가격은 "+num+"원 입니다.");
		}
		else
		{
			System.out.print("주문하신 메뉴는 없습니다.");
		}
		
		scanner.close(); // 모든 작업이 끝났으면 실행을 마무리한다.
	}
}

