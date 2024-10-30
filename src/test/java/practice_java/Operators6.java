package practice_java;

public class Operators6 {
	public static void main(String[] args) {
		int amount =5400;
		int denomination=500;
		int notes= amount/denomination;
		int moneyLeft=amount-denomination*notes;
		System.out.println("Total notes withdrawn from atm : "+notes);
		System.out.println("money left in atm : " +moneyLeft);
				
		
	}

}
