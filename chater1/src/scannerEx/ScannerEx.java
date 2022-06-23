
public class Bonuspoint {

	public static void main(String[] args) {
		//보너스 포인트 =가격(price) x 보너스 적립율(5%)
		Scanner sc = new Scanner(System.in);
		
		System.out.println("고객의 이름을 입력하세요 : ");
		String name = sc.nextLine(); //이름입력
		
		System.out.println("구매 금액을 입력하세요:");
		int price = sc.nextInt(); //금액입력
		int bonusPoint = 0;
		double bonusRatio = 0.05; //보너스 적립율
		
		//연산 
		bonusPoint =(int)(price * bonusRatio); //형을 맞춤

	}
	//출력
	System.out.println("보너스 포인트는 " + bonusPoint + "점 입니다.");

}