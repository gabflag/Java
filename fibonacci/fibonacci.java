package XXXXXXXXXXXXXX;
import java.util.Scanner;
import java.util.ArrayList;
import java.util.List;

public class Fibonacci {
	
	public static void main(String[] args) {
		Scanner teclado = new Scanner(System.in);
		
		List<Integer> fibonacciSequence01 = new ArrayList<>();
		List<Integer> fibonacciSequence02 = new ArrayList<>();
		
		System.out.print("Digite o valor de N: ");
		int n = teclado.nextInt();
		
		System.out.println("O valor de Fibonacci para o número " + n + " é: " +  fibonacci(n));
		
		System.out.println("\nResolução de Fibonacci usando recursividade: ");
		for(int i = 0 ; i < n+1; i++) {
			fibonacciSequence01.add(fibonacci_recursive(i));
		}	
		printList(fibonacciSequence01);
		
		
		System.out.println("\nResolução de Fibonacci usando função linear (FOR): ");
		for(int i = 0 ; i < n+1; i++) {
			fibonacciSequence02.add(fibonacci(i));
		}	
		printList(fibonacciSequence02);
		
		teclado.close();
	}
	
	private static int fibonacci(int n) {
	    if (n < 0) {
	    	throw new IllegalArgumentException("A entrada deve ser maior ou igual a zero");
	    }
	    
	    int a = 0, b = 1, c = 1;
	    for (int i = 2; i <= n; i++) {
	        c = a + b;
	        a = b;
	        b = c;
	    }
	    return c;
	
	}

	public static int fibonacci_recursive(int n) {
	    if (n < 0) {
	    	throw new IllegalArgumentException("A entrada deve ser maior ou igual a zero");
	    } 
	    
	    if (n == 0) {
	        return 0;
	    } else if (n == 1) {
	        return 1;
	    } else {
	        return fibonacci_recursive(n - 1) + fibonacci_recursive(n - 2);
	    }
	}
	
    public static void printList(List<Integer> list) {
        for(int i = 1; i < list.size(); i++) {
            System.out.print("A"+ i + " " + list.get(i) + " ");
        }
    }
    
}

