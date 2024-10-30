package practice_java;

public class Java_Assignment2 {
	public static void main(String[] args) {
		int TotalPeople=6;
		int totalMoney=6*1000;
		int expenditure=5400;
		System.out.println("total money = "+ totalMoney);
		System.out.println("total expenditure = "+ expenditure);
		int MoneyLeft=totalMoney-expenditure;
		System.out.println("Money left = " + MoneyLeft );
		int MoneyReturned= MoneyLeft/TotalPeople;
		System.out.println("Money returned to everyone by sheela = "+MoneyReturned);
	}
	}


