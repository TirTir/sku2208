package day03;

public class Lotto {
	int num;
	public void generateNum() {
		this.num = (int)(Math.random()*100%45);
	}
	public int getNum() {
		return this.num;
	}
	Lotto LottoNum = new Lotto();
	int Lotto[] = new int[7];
	int Random = 0;
	
	for (int i=0; i<7;i++) {
		
		while(true) {
			LottoNum.generateNum();
			Random = LottoNum.getNum();
			
			if (Random == 0) continue;

			for (int j = 0; j<6;j++) {
				if (Random == Lotto[j]) continue;
			}			
			break;
		}		
		Lotto[i] = Random;
	}
	System.out.println("");
	for (int k = 0; k<7;k++) {
		System.out.printf("%d ", Lotto[k]);
	}
}