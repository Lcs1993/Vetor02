
public class Vetor2 {

	public static void main(String[] args) {
		String mes[]= {"jan","fev","mar","abr","mai","jun","jul",
				"ago","set","out","nov","dez"};
		int total[]= {31,28,31,30,31,30,31,31,30,31,30,31};
		for(int c=0;c<mes.length;c++) {
			System.out.println("o mês de "+mes[c]+" tem "+total[c]+" dias ao todo");
		}
		for(String cadaMes:mes) {
			System.out.print(cadaMes+ " ");
		}
		System.out.println();
		for(int qtdDia:total) {
			System.out.print(qtdDia+ " ");
		}
		System.out.println();
		int anoAtual=2021;
		if(((anoAtual%4==0 )&& (anoAtual%100!=0))||anoAtual%400==0) {
			System.out.println("o ano atual é bisexto");
		}else {
			System.out.println("o ano atual não é bisexto");
		}

	}

}
