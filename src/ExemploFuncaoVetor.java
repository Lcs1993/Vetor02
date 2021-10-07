import java.util.Arrays;

public class ExemploFuncaoVetor {

	public static void main(String[] args) {
	int valores[]= {10,7,19,3,45,1};
	for(int valor:valores) {
		System.out.print(valor+ " ");
	}
	System.out.println();
	Arrays.sort(valores);
	for (int valor:valores) {
		System.out.print(valor+ " ");
	}
	System.out.println();

	}

}
