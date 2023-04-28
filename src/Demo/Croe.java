package Demo;

public class Croe {
	public static void main(String[] args) {
		String s="pandranki jayaprakash naidu";
		String[] splittedString=s.split(" ");
		//System.out.println(splittedString[0]);
		//System.out.println(splittedString[1]);
		//System.out.println(splittedString[2]);
		
		for(int i=0;i<s.length();i++)
		{
			System.out.println(s.charAt(i));
		}
	}

}
