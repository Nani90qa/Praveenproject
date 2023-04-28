package Demo;

import java.util.ArrayList;

public class CoreJava3 {
	public static void main(String[] args) {
		
		ArrayList<String> a = new ArrayList();
		a.add("sanju");
		a.add("sanj");
		a.add("sanjwu");
		a.add("sanjqu");
		a.add("sanjuee");
		a.add("sanjwewu");
		System.out.println(a.get(3));
		
		a.remove(2);
		
		for (int i=0;i<a.size();i++) {
			System.out.println(a.get(i));
		}
		System.out.println("**********");
		for (String val :a) {
			System.out.println(val);
		}
		//item is present in array list or not
		System.out.println(a.contains("sanju"));
		
		
		
		
	} 
	

}
