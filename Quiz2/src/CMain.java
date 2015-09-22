import java.util.Scanner;

public class CMain {
	public static void main(String[] args){
		Scanner in = new Scanner(System.in);
		double increaserate1;
		double increaserate2;
		double increaserate3;
		double Totalbill;
		double APR;
		double Monthlypay;
		int payyears;
		
		System.out.println("Enter first year's tuition increase rate in percentage: ");
		System.out.println("Enter second year's tuition increase rate in percentage: ");
		System.out.println("Enter third year's tuition increase rate in percentage: ");
		
		increaserate1 = in.nextDouble();
		increaserate2 = in.nextDouble();
		increaserate3 = in.nextDouble();
		Totalbill = 12520+(12520*(1+increaserate1/100))+(12520*(1+increaserate1/100)*(1+increaserate2/100))+12520*(1+increaserate1/100)*(1+increaserate2/100)*(1+increaserate3/100);
		System.out.println("The total tuition bill for four years is " + Totalbill);
        
		System.out.println("Enter a fixed APR for student loan in percentage: ");
		System.out.println("Enter how many years you want to pay the loan: ");
		
		APR = in.nextDouble();
		payyears = in.nextInt();
		
		Monthlypay = (Totalbill + Totalbill * APR/100 * payyears) / payyears / 12;
		
		System.out.println("Monthly payment for student loan would be: " + Monthlypay);
	}
}
