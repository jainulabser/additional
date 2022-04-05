import java.util.Scanner;

public class Hexa {
	
	private void findValue() {
		Scanner sc=new Scanner(System.in);
		int count=0;
		String number=sc.next();
		for(int i=0;i<number.length();i++)
		{
			if(number.charAt(i)=='0')
			{
			System.out.print((char)('A'+count));
			count=0;
			}
			else if(count==3)
			{
				System.out.print((char)('A'+(count+1)));
				count=0;
			}
			else
			{
				count++;
			}
		}
		
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Hexa obj=new Hexa();
		obj.findValue();

	}

}
