


package model;

public class PaymentMethod {
    private String method;
    private double finalAmount;

    public PaymentMethod(String method, double totalAmount) {
        this.method = method.trim().toLowerCase();
        applyPaymentMethod(totalAmount);
    }

    private void applyPaymentMethod(double totalAmount) {
        switch (method) {
            case "cartao de crédito":
            case "cartão de crédito":
                finalAmount = totalAmount * 1.05; 
                break;
            case "cartao de débito":
            case "cartão de débito":
                finalAmount = totalAmount; 
                break;
            case "dinheiro/pix":
                finalAmount = totalAmount * 0.95; 
                break;
            default:
                throw new IllegalArgumentException("Método de pagamento inválido. Use: Cartão de Crédito, Cartão de Débito ou Dinheiro/Pix.");
        }
    }

    public String getMethod() {
        return method;
    }

    public double getFinalAmount() {
        return finalAmount;
    }
}
