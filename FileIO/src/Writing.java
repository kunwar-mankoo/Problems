import java.io.*;
public class Writing {
	void writeInFile(){
		try {
			
			File file = new File("/Users/Admin/Downloads/Add.java");
						
			String data = "\r\n" + 
					"public class Add {\r\n" + 
					"	int addition(int a, int b) {\r\n" + 
					"		int c = a+b;\r\n" + 
					"		return c;\r\n" + 
					"	}\r\n" + 
					"\r\n" + 
					"	public static void main(String[] args) {\r\n" + 
					"		Add a =new Add();\r\n" + 
					"		Add c =new Add();\r\n" + 
					"		Add b =new Add();\r\n" + 
					"		//Add d =new Add();\r\n" + 
					"		a.addition(5, 8);\r\n" +
					"		b.addition(55, 832);\r\n" +
					"		c.addition(25, 18);\r\n" +
					"		System.out.println(\"Addition of two numbers:\"+a.addition(5, 8));\r\n" + 
					"\r\n" + 
					"	}\r\n" + 
					"\r\n" + 
					"}\r\n" + 
					"";
			
			FileOutputStream outputStream = new FileOutputStream(file); 
			outputStream.write(data.getBytes());
			outputStream.close();
			
			System.out.println("--File Written--");
			
		} catch (Exception e) {
			System.out.println("Some Error: "+e);
		}
	}
	
	
	public static void main(String[] args) {
		Writing io = new Writing();
		io.writeInFile();

	}

}
