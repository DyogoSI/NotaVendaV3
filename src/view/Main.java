package view;

import model.Sale;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Sale sale = new Sale();
        sale.createSaleItem("at", 2);
        sale.createSaleItem("ff", 1);
        sale.createSaleItem("msa", 2);

        System.out.println("Itens Vendidos:");
        for (String item : sale.getItems()) {
            System.out.println(item);
        }

        System.out.printf("Total: %.2f%n", sale.getTotal());

        Scanner scanner = new Scanner(System.in);
        System.out.println("Escolha a forma de pagamento:\n1. Cartão de Crédito\n2. Cartão de Débito\n3. Dinheiro/Pix");
        
        String paymentMethod = scanner.nextLine();
        
        
        switch (paymentMethod) {
            case "1":
                paymentMethod = "Cartão de Crédito";
                break;
            case "2":
                paymentMethod = "Cartão de Débito";
                break;
            case "3":
                paymentMethod = "Dinheiro/Pix";
                break;
            default:
                System.out.println("Opção inválida. Usando Cartão de Débito como padrão.");
                paymentMethod = "Cartão de Débito";
        }

        sale.setPaymentMethod(paymentMethod);

        System.out.printf("Forma de Pagamento: %s%n", sale.getPaymentMethod());
        System.out.printf("Valor a ser pago: %.2f%n", sale.getFinalAmount());
        
        scanner.close();
    }
}
