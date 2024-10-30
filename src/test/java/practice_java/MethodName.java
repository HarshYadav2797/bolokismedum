package practice_java;

public class MethodName {
	public static void add1(int no1, int no2)
	
	{
		int ref = no1 +  no2;
		System.out.println(ref);
		
	}
	
	public  int add2(int no1, int no2) 
	{
		int ref= no1+ no2;
		return ref;
	}
	public static void main(String[] args) {
		MethodName.add1(10, 0);
		MethodName mn = new MethodName();
		int y = mn.add2(10, 20);
		System.out.println(y);
		
		
	}

}
