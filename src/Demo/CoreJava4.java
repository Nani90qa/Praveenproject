package Demo;

import io.opentelemetry.exporter.logging.SystemOutLogRecordExporter;

public class CoreJava4 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		String s= "Arhul shetty academy";
		String s1= "Arhul shetty institute academy";
		String s2= "Arhul traiming shetty academy";
		String[] splittedString=s.split("shetty");
		//System.out.println(splittedString[0]);

		//System.out.println(splittedString[1]); 
		//System.out.println(splittedString[2]);
		System.out.println(splittedString[1].trim());
		for (int i=0;i<s.length();i++) {
			System.out.println(s.charAt(i));
		}
	}

}
