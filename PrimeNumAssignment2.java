import java.util.Scanner;

public class PrimeNumAssignment2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		//Create an object of the Reference CLass
		ReferenceClass refClass = new ReferenceClass();
		
		//get the number from the console
		System.out.println("Enter the number for which the Prime condition has to be checked");
		Scanner sc = new Scanner(System.in);
		refClass.setNum(sc.nextInt());
		sc.close();
		
		//Prime number Calculation
				if(refClass.isPrime(refClass.getNum()))
					System.out.println("The given number "+refClass.getNum()+" is Prime");
				else
					System.out.println("The given number "+refClass.getNum()+" is not Prime");
			

	}

}
