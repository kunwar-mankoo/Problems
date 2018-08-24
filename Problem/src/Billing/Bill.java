package Billing;
import java.io.*;
import java.util.Scanner;
import java.lang.*;

public class Bill {
	double Rate=82.92;
	double Litres;
	double Amount; 
	
	public double Quantity(double lt) {
		double A=Rate*lt;
		return A;
		
	}
	public double amount(double am) {
		double Q=am/Rate;
		return Q;
		
	}
	public void GenerateInvoice(double lt,double amount) {
try {
			
			File file = new File("/Users/Admin/Downloads/Invoice.txt");
			
			String data = "\r Royal Fuels \r\n" + 
					"\r Redwood Shores \r\n" + 
					"Item Name"+"  \t Qty"+" \t Price"+"\t Amount\r\n" + 
					"Petrol \t"+lt        + "\t "+Rate+" \t"+Amount+"\r\n" + 
					"Total \t"+ "\t"+" \t" +amount;
			
			FileWriter writer = new FileWriter(file);
			writer.write(data);
			writer.close();
			
			System.out.println("--Invoice Generated--");
	
		} catch (Exception e) {
			System.out.println("Some Error: "+e);
		}	}
	

	public static void main(String[] args) {
				 
		Scanner in=new Scanner(System.in);
		System.out.println("====================Royal Fuels====================");
		System.out.println("==================Redwood Shores===================");
		System.out.println("Want to buy by Quantity or Amount? Enter Q for Quantity or A for Amount ");
		char ch = in.next().charAt(0);
		switch(ch) {
		case 'A':{
			Bill a= new Bill();
			System.out.println("Enter Amount:");
			double am = in.nextDouble();
			a.Litres=a.amount(am);
			System.out.println(+a.Litres+"L Petrol is added for the amount "+am);
			a.GenerateInvoice(a.Litres, am);
			break;
		}
		case 'Q':{
			Bill q= new Bill();
			System.out.println("Enter Litres:");
			double qt = in.nextDouble();
			q.Amount=q.Quantity(qt);
			System.out.println(+qt+"L Petrol is for the amount "+q.Amount);
			q.GenerateInvoice(qt, q.Amount);
			break;
			
		}
		default :{
			System.out.println("Invalid Input");
		}
		}
	
		}
}
