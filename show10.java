package week8;
import javax.swing.JOptionPane;
public class show10{
	public static void main(String[]args) {
		String waga,dependen;
		double wagaZ,weeklyPay;
		int dependents;
		final double hours = 37.5;
	
		waga = JOptionPane.showInputDialog(null,"Enter money hours"
				,"Facebook"
				,JOptionPane.INFORMATION_MESSAGE);
		weeklyPay=Double.parseDouble(waga)*hours;
		
			dependen=JOptionPane.showInputDialog(null,"How many dependents" 
		,"Salary dialog 2",JOptionPane.QUESTION_MESSAGE); 	
	
		
	
		dependents=Integer.parseInt(dependen);
		JOptionPane.showConfirmDialog(null,"weekly salary is $"
		+weeklyPay+"\nDeduction will be made for "+dependents+"dependents");
		
		JOptionPane.showConfirmDialog(null,"total pay "+weeklyPay*+dependents+" dolla");
		
		System.out.println("weekly salary is $"
		+weeklyPay+"\nDeduction will be made for "+dependents+"dependents");
		
		System.out.println(weeklyPay*dependents);
		
	}
	
}
