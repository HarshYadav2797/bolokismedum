package practice_java;

public class Local_Variable {
	//int a =10;
	public static void main(String[] args) {
		/*	int b= 20;
		System.out.println(b);
		System.out.println(a);
	}*/
		
	//int a;
	//System.out.println(a); // showing compile time error because variable is not initialized
  /* int a=10;
   System.out.println(a);*/
		int a= 10;
		System.out.println(a);
		{
			int b=12;
			System.out.println(b);
		}
		
		
	}
}
