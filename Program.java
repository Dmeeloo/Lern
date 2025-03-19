package application;

import java.util.Locale;
import java.util.Scanner;

import entities.Salary;

public class Program {
	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		Salary salary = new Salary();
		System.out.println("Name: ");
		salary.name = sc.nextLine();
		System.out.println("Gross salary: ");
		salary.grossSalary = sc.nextDouble();
		System.out.println("Tax: ");
		salary.tax = sc.nextDouble();
		
		System.out.printf("Employee: "+ salary.name + ", $%.2f%n", salary.netSalary());
		
		System.out.println("Wich percentage to increase salary? ");
		salary.increaseSalary(sc.nextDouble());
		
		System.out.printf("Update data: " + salary);
		
		sc.close();
	}
}
