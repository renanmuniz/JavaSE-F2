package programa;

import comercial.Fatura;

public class Exer7 {
    public static void main(String[] args) {
        Fatura f1 = new Fatura();
        f1.faturar(777.55);
        System.out.println("f1.valor = " + f1.valor);
    }
}
