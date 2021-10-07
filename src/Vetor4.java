import java.util.Arrays;

public class Vetor4 {

	public static void main(String[] args) {
		int vet[]= {3,7,6,1,9,4,2};
		Arrays.sort(vet);
		for(int cadaValor:vet) {
			System.out.print(cadaValor+" ");
		}
		int posicao=Arrays.binarySearch(vet, 6);
		System.out.println("encontrei o valor 6 na posição "+posicao);

	}

}
