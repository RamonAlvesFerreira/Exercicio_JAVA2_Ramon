package Questions;

import java.util.ArrayList;
import java.util.List;

public class Exercise1 {
	
	public static void main (String args[]) {
		
		String teste;
		
		teste = "Xablau ";
		
		System.out.println("Como fazer para saber se uma String se encontra dentro de outra? \n");
		
		System.out.println("Pra isso usamos o metodo contains- \n");
		
		System.out.println(teste.contains("Xa" + "\n"));
		
		System.out.println("E para tirar os espaços em branco das pontas de uma String?  \n");
		
		System.out.println("Usamos o metodo Split para localizar  \n");
		
		System.out.println(teste.split(" "  + "\n"));
		
		System.out.println("E para saber se uma String está vazia?  \n");
		
		System.out.println("Usamos o isEmpty; \n");
		
		System.out.println(teste.isEmpty() + "\n");
		
		System.out.println("E para saber quantos caracteres tem uma String?  \n");
		
		System.out.println("Usamos o metodo Size(); \n");
		
		System.out.println(teste.length() + "\n");
		
	}

}
