import java.util.Scanner;

public class Binary {
	int Gap=0;
	int m=0;
	boolean found=false;

	public void convert(int n) {
		int[] arr = new int[20];	
		int i=0;
		while (n>0) {
			arr [i]=n%2;
			i++;
			n=n/2;
		} 
		for(int j=i-1;j>=0;j--) {
			System.out.print(arr[j]);
		}
		System.out.println();
		for(int k=0;k<=i;k++) {
			
			if(arr[k]==0) {
				m+=1;				
			}
			else if(arr[k]==1) {
				if(m>Gap && found==true) {
					Gap=m;
				}
				found=true;
				m=0;
			}
						
		}System.out.println("Binary Gap:" +Gap);	
	
	}

	public static void main(String[] args) {
		Scanner in= new Scanner(System.in);
		System.out.print("Enter the number to convert :" );
		int n = in.nextInt();
		Binary b= new Binary();
		b.convert(n);
	}

}
