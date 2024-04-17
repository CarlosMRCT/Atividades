package codigos;

public class AtividadeQuinta {

	public static void main(String[] args) {
		int t;
		String original = "Aprovado";
	    String reversa = ""; 
	    t = original.length();
	    for (int i = t - 1; i>= 0; i--) {
	    	reversa += original.charAt(i);
	    }
	    System.out.println(original);
	    System.out.println(reversa);
	}
}