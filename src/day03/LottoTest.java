package day03;

import java.util.*;

public class LottoTest {
	
	public static void main(String[] args) {
		Scanner money = new Scanner(System.in);
		
		System.out.println("���� �����ϼ���.");
		int bill = money.nextInt();
		int n = bill/1000;
		
		for(int i = 0; i < n; i++) {
			int Lotto[] = new int[n];
			Lotto LottoNum = new Lotto();
			int Random = 0;
		}
		
		System.out.println("�ζ� ��÷�� �����մϴ�.");
		for (int j = 0; j < n; j++) {
			for (int k = 0; k < 7;k++) {
				System.out.printf("%d ", Lotto[k]);
			}
		}
	}
}