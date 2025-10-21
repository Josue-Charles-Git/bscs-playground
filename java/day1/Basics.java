public class Basics {
	public static void main(String[] args) {
		int a = 7;			//integer
		double b = 2.5;			//floating point
		String name = "Josue";		//text
		System.out.println(a+b);	//quick sanity check
		System.out.println("Hi "+ name);
		System.out.println("The sum is: " +(a+b));
		System.out.println("The difference is: " + (a-b));
		System.out.println("The product is: " + (a*b));
		

		if(a > 5){
			System.out.println("big");
		} else {
			System.out.println("small");
		}
		
		for(int i = 1; i<=10;i++)
		{
			System.out.print(i);			
		}
		System.out.println();
	}
}
