package day03;

import java.util.*;

public class LottoTest {
	
	public static void main(String[] args) {
		Scanner money = new Scanner(System.in);
		
		System.out.println("지폐를 투입하세요.");
		int bill = money.nextInt();
		int n = bill/1000;
		
		for(int i = 0; i < n; i++) {
			int Lotto[] = new int[n];
			Lotto LottoNum = new Lotto();
			int Random = 0;
		}
		
		System.out.println("로또 추첨을 시작합니다.");
		for (int j = 0; j < n; j++) {
			for (int k = 0; k < 7;k++) {
				System.out.printf("%d ", Lotto[k]);
			}
		}
	}
}