package Demo;

public class Variables {
	public static void main(String[] args) {

		int a = 5;
		String s = "Rahulshetty";

		System.out.println(a+ " is the the value stored in the string");
		System.out.println("s");
		
		//arrays
		int[] arr = new int [5];
		arr[0]=1;
		arr[1]=2;
		arr[2]=3;
		arr[3]=4;
		arr[4]=5;
		
		int[] arr2= {1,5,7,5,9};
		
		//for loop
		for(int i=0;i<arr.length;i++) {
			System.out.println(arr[i]);
		}
		for (int i=0;i<5;i++) {
			System.out.println(arr2[i]);
			
		}
		String[] name= {"rahul","nani","kumar"};
		for(int i=0;i<name.length;i++) {
			System.out.println(name[i]);
		}
		for(String r: name) {
			System.out.println(s);
		}
	}

}
