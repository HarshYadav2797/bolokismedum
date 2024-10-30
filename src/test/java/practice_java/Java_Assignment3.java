package practice_java;

public class Java_Assignment3 {
	public static void main(String[] args) {
		int product1=1200;
		int product2=1450;
		int gst= 12;
		int totalCost= product1+ product2;
		int gstTax= totalCost/100*gst;
		System.out.println("total cost of products = " + totalCost);
		System.out.println("final bill = "+ totalCost +gstTax);
	}
	}


