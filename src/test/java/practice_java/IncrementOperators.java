package practice_java;

public class IncrementOperators {
	public static void main(String[] args) {
		/*int a=10;
		int b=a++;
		System.out.println(a);
		System.out.println(b);
		int c=11;
		int d=++c;
		System.out.println(d);*/
		int a=20;
		int b= -10;
		int c=a+ ++b;
		int d=a++ - b++ + ++c;
		System.out.println(c);
		System.out.println(d);
	}

}
