import java.util.Scanner;
import java.util.ArrayList;
import java.util.List;

public class Isprime {

	private static List<Integer> primesRecursive = new ArrayList<>();
	
	public static void main(String[] args) {
		
		Scanner teclado = new Scanner(System.in);
		
		System.out.print("Digite o valor de N: ");
		int n = teclado.nextInt();
		
        if (n <= 1) {
            extracted();
        }
		
		System.out.println("\nLista de números primos até o número: " + n);
		List<Integer> fibonacciSequence01 = findPrimes(n);
		System.out.println(fibonacciSequence01);
		
		
		findPrimesRecursive(2, n);
		System.out.println("\nLista de números primos até o número " + n + " usando recursividade:");
		System.out.println(primesRecursive);
		
		System.out.println("\nista de números primos até o número "+ n +" usando função linear(FOR):");
		System.out.println(fibonacciSequence01);
		
		teclado.close();
	}

	// ERRO
	private static void extracted() {
		throw new IllegalArgumentException("A entrada deve ser maior do que 1");
	}
	
	// RECURSIVA
    public static List<Integer> findPrimesFuncRecursive(int n) {
        findPrimesRecursive(2, n);
        return primesRecursive;
    }
	
    private static void findPrimesRecursive(int current, int end) {
        if (current > end) {
            return;
        }
        if (isPrime(current)) {
        	primesRecursive.add(current);
        }
        findPrimesRecursive(current + 1, end);
    }
    
    // LINEAR
	public static List<Integer> findPrimes(int n) {
		
	        if (n <= 1) {
	            extracted();
	        }
	        List<Integer> primes = new ArrayList<>();
	        for (int i = 2; i <= n; i++) {
	            if (isPrime(i)) {
	                primes.add(i);
	            }
	        }
	        return primes;
	    }
	
    private static boolean isPrime(int n) {
        if(n == 2) return true;
        if(n % 2 == 0) return false;
        for (int i = 3; i <= Math.sqrt(n); i += 2) {
            if (n % i == 0) {
                return false;
            }
        }
        return true;
    }
}

