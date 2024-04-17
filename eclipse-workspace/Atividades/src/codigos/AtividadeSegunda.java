package codigos;

public class AtividadeSegunda {

    public static void main(String[] args) {
    	int c;
        int p = 20;
        int a = 0;
        int b = 1;
        int numero = 12;
        boolean participa = false;

        for (int i = 0; p > i; i++) {
            c = a + b;
            a = b;
            b = c;

            if (numero == c || numero == 0) {
                participa = true;
                break; 
            }if (numero != c) {
            	participa = false;
            }
        }

        if (participa == true) {
            System.out.println("O número faz parte da sequência de Fibonacci!");
        } else {
            System.out.println("O número NÃO faz parte da sequência de Fibonacci!");
        }
    }
}
