package programa;

import comercial.Venda;

public class Exer4 {
    public static void main(String[] args) {
        Venda v1 = new Venda();
        v1.pessoa = "Renan Muniz Merlo";
        v1.valor = 100;
        v1.vender();
        double imposto = v1.calcularImposto();
        System.out.println("imposto = "+imposto);

        v1.adicionarJuros(30);
        v1.vender();
        imposto = v1.calcularImposto();
        System.out.println("imposto = "+imposto);

    }
}
