package Demo;

public class ReverseString {
	public static void main(String[] args) {
		
		String s="suhas naidu";
		String[] splittedString=s.split(" ");
		for(int i=s.length()-1;i>=0;i--) {
			System.out.println(s.charAt(i));
		}
	}

}
