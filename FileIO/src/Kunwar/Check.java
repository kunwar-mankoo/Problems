package Kunwar;
import java.io.*;

public class Check {
	
	void readFromFile(){
		try {int count=0;
		int brackets = 0;
			
			File file = new File("/Users/Admin/Downloads/Add.java");
			
			FileInputStream fis = new FileInputStream(file);
			int i = 0;
			while((i = fis.read()) != -1){
				char ch = (char)i;
			if (ch=='{') {	
				if (brackets==0) {
					count++;
				}
				brackets++;
				
			}
			else if (ch=='}') {
				brackets--;
			}
			}
			if (brackets==0) {
				System.out.println("Brackets are properly closed");
			}
			else {
				System.out.println("Brackets are not properly closed");
			}
			
			
			fis.close();
		} catch (Exception e) {
			System.out.println("Some Error: "+e);
		}
	}
	
	void objects(){
		try {
			int count=0;
			File file = new File("/Users/Admin/Downloads/Add.java");
			
			FileReader reader = new FileReader(file);
			BufferedReader buffer = new BufferedReader(reader);
			String line = "";
			
			while( (line = buffer.readLine()) != null){
				if (line.contains("//")==false){
					if(line.contains("new")) {
						count++;
					}				
				}
					
			}
			System.out.println("no of objects:"+count);
			
			buffer.close();
			reader.close();
			
		} catch (Exception e) {
			System.out.println("Some Error: "+e);
		}
	}
	

	public static void main(String[] args) {
		Check a = new Check();
		a.readFromFile();
		a.objects();

	}

}
