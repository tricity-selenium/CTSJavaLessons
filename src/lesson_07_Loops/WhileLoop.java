package lesson_07_Loops;

public class WhileLoop {

	public static void main(String[] args) {
		
		int orgnum = 1551;
		int num = orgnum;
		int rev = 0;
				
		while(num > 0)
		{
			int rem = num%10;
			rev = rev*10 + rem;
			num/=10;
		}
		
		if(orgnum == rev)
		{
			System.out.println("Pelindrome");
		}
		else
		{
			System.out.println("NOT bPelindrome");
		}
		
		

	}

}
