package application;

import java.util.ArrayList;
import java.util.List;
import java.util.Locale;
import java.util.Scanner;

import entities.enums.TiposContribuintes;
import entities.Contribuinte;
import entities.PFcontribuinte;
import entities.PJcontribuinte;

public class App {
    public static void main(String[] args) {

        Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		List<Contribuinte> list = new ArrayList<>();


        System.out.print("Insira o número de contribuintes: ");
        Integer n = sc.nextInt();

        for(int i = 1; i <= n; i++){
            System.out.println("Dados do #" + i + " contribuinte: ");
            System.out.print("Contribuinte PF ou PJ? ");
            TiposContribuintes tipoContribuinte = TiposContribuintes.valueOf(sc.next());

            System.out.print("Nome: ");
            sc.nextLine();
            String name = sc.nextLine();

            System.out.print("Renda anual: $ ");
            Double rendaAnual = sc.nextDouble();

            switch (tipoContribuinte) {
                case PJ:
                    System.out.print("Quantos funcionários a empresa tem: ");
                    Integer numeroFuncionarios = sc.nextInt();
                    list.add( new PJcontribuinte(tipoContribuinte, name, rendaAnual, numeroFuncionarios));
                    break;
                case PF:
                    System.out.print("Gasto anual com saúde: $ ");
                    Double gastoSaude = sc.nextDouble();
                    list.add( new PFcontribuinte(tipoContribuinte, name, rendaAnual, gastoSaude));
                    break;
            }
        }

        Double soma = 0.0;
        System.out.println("IMPOSTOS PAGOS");
        for(Contribuinte c : list){
            System.out.println(c.getName() + ": $ " + String.format("%.2f", c.imposto()));
            soma += c.imposto();
        }
        System.out.println("TOTAL TAXES: $ " + String.format("%.2f", soma));
        sc.close();
    }
}
