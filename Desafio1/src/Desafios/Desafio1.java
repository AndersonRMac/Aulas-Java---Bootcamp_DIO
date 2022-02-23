package Desafios;
import java.util.Scanner; 


public class Desafio1{
	public static void main(String[] args){
	  
		Scanner scan = new Scanner(System.in);

		 double pi = 3.14159;
		 double area;
		 double A;
		 
		 
		 area = scan.nextDouble();

		 A = 3.14159 * (Math.pow( area ,2));

		System.out.printf("A=%.4f ", A);
		
	}
}