package Demo;

public class CoreJava2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int[] some = {10,24,12,35,32,36,37,41};
		for (int i=0;i<some.length;i++) {
			if(some[i] % 2 ==0) {
				System.out.println(some[i]);
				break;
				
			}
			else {
				System.out.println(some[i] + " not multiplied by 2" );
			}
		}

	}

}
