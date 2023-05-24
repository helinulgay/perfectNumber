package ornek;

import java.util.Scanner;

public class perfectNumber {

	public static void main(String[] args) {
		int total=0;
		Scanner scan=new Scanner (System.in);
		System.out.println("enter a number:");
		int number=scan.nextInt();
		for(int i=1;i<number;i++) {
			if(number%i==0) {
				total+=i;
		}
	}
				if(total==number) {
					System.out.println(number+"is perfect number");
				}
				else {
					System.out.println(number+"is not perfect number");
				}
			}
			
		
		
	

}

	


