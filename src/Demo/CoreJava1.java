package Demo;

public class CoreJava1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int[] sum = {1,1,1,1,5};
		String[] demo = {"swamu","demow","gello"};
		int[] some = {10,24,12,35,32,36,37,41};
		
		for(int i=0;i<sum.length;i++)
		{
			//System.out.println( sum + " Some of the all value");
			System.out.println(sum[i]);
		}
		
		for(int i=0;i<demo.length;i++)
		{
			System.out.println(demo[i]);
		}
		for (int i=0;i<some.length;i++) {
			if(some[i] % 2 ==0) {
				System.out.println(some[i]);
				//break;
				
			}
			else {
				System.out.println("not a even number");
			}
		}
		for (String e: demo) {
			System.out.println(e);
		
		}
		
	}

}
