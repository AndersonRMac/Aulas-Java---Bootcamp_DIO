import java.io.IOException;
import java.util.Scanner;

public class DIO {
	
    public static void main(String[] args) throws IOException {
    	Scanner leitor = new Scanner(System.in);
    	double A = leitor.nextDouble();
    	double B = leitor.nextDouble();
    	
    	
    	double aumento = (B * 100.0 / A) - 100.0;
        
    //procurar aula de string.format

    	System.out.println(String.format("%.2f%%", aumento));
  }
}