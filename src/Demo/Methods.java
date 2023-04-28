package Demo;

public class Methods {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Methods m= new Methods();
		String name=m.getData();
		System.out.println(name);
		Methods2 m1= new Methods2();
		
	}
	public String getData() {
		System.out.println("Hello world");
		return "Praveen";
	}

}
