import java.util.Scanner;
public class BMIprogram {
	// Course: COSC 1336 CS 1  
		// Name: Isaiah Medina 
		// Data: 8/23/2021 
		// BMI scale Program
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner input = new Scanner (System.in);
	// BMI scale Program
	System.out.println("Enter your weight in Kg");
	int weight = input.nextInt();
	System.out.println("Enter your Height in M");
	int height = input.nextInt();
	double BMI;
	// Assign BMI formula
	BMI = weight / (height * height );
// Display
	System.out.println("Your BMI is " + BMI);
	

}
}