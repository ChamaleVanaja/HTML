import java.util.Scanner;
class SimpleIntrestCalculator  
{
	public static void main(String[] args) 
	{
		Scanner sc = new Scanner(System.in);
		System.out.println("======================================");
		System.out.println("SIMPLE INTREST CALCULATOR");
		System.out.println("======================================");
		System.out.println("ENTER PRINCIPAL AMOUNT : ");
		double p = sc.nextDouble();
		System.out.println("ENTER RATE OF INTREST(P.A) : ");
		double r = sc.next.Double();
		System.out.println("ENTER TIME PERIOD : ");
		double t = sc.next.Double();
		double si = (p*t*r)/100;
		System.out.println("======================================");
		System.out.println("Principal amount : "+p);
		System.out.println("Total intrest : "+si);
		System.out.println("Total amount : "(p+si));
		System.out.println("======================================");
		System.out.println("===========THANK YOU...!!==========");
	}
}
