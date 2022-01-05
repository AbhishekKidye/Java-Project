import java.util.Scanner;

//write a program to calculate electricity bill

public class electricity {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("Electricty Bill ");
		double Watts;
		Scanner sc= new Scanner(System.in);
		System.out.println("ENter the number of Watts ");
		Watts =sc.nextDouble();
		
		double totalWatts = Watts *24 * 30;  //24=hours and 30= days
		System.out.println("Total KiloWatts : " + totalWatts);
		
		//Watts to unit
		
		double units = totalWatts/1000;
		System.out.println("Units used = " + units);
		
		int costperunit = 7;
		 double billpay=0;
		 
		 if (units < 100) {
			 billpay = units*7;
			 System.out.println("The bill amount is : "+ billpay);
		 }
		 else if(units>100 && units < 200) {
			 billpay= units*10;
			 System.out.println("The bill Amount is : "+ billpay);
		 }
		 else if (units > 300){
			 billpay = units*15;
			 System.out.println("the Bill Amount is : "+ billpay);
		 }
	}

}
