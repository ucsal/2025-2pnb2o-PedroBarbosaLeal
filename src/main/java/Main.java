import br.com.mariojp.solid.ocp.*;

import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		System.out.println("Digite o tipo");
		String aux = sc.nextLine();

		DiscountPolicy policy = null;

		if (aux.equals(CustomerType.PREMIUM.name())) {
			policy = new PremiumPolicy();
		}else if(aux.equals(CustomerType.REGULAR.name())){
			policy = new RegularPolicy();
		}else if(aux.equals(CustomerType.PARTNER.name())){
			policy = new PartnerPolicy();
		}else{
			System.out.println("Não tem nada aqui");
		}

		DiscountCalculator calc = new DiscountCalculator(policy);

		System.out.println("REGULAR 100 -> " + calc.apply(100, CustomerType.REGULAR));
		System.out.println("PREMIUM 100 -> " + calc.apply(100, CustomerType.PREMIUM));
		// PARTNER deveria ter 12%
		System.out.println("PARTNER 100 -> " + calc.apply(100, CustomerType.PARTNER));
	}
}