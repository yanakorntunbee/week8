package week8;
import java.util.Scanner;
import javax.swing.JOptionPane;
public class show1{
	public static void main(String[]args) {
		JOptionPane.showMessageDialog(null,"Wecome to program test");
		sayhi();
		String name;
		int total = add(5000,1);
		System.out.println(total);
		Scanner input = new Scanner(System.in);
		System.out.print("Enter your name >>");
		name = input.nextLine();
		System.out.println(name);
	}
	static int add(int a,int b) {
		return a+b;
	}
	static void sayhi() {
		System.out.println("hi");
	}
}