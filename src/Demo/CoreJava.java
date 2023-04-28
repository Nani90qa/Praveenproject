package Demo;

public class CoreJava {
	
	public static void main(String[] args) {
		
		int[] arr2 = {1,2,3,4,5,7,5,7,12,6,4,57,34};
		
		for(int i=0;i<arr2.length;i++) {
			//System.out.println(arr2[i]);
			if(arr2[i] % 2 ==0)
			{
				System.out.println(arr2[i]);
				break;
			}
			else {
				System.out.println(arr2[i]+ " is not multiplied by 2");
			}
		}
	}

}
