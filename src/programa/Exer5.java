package programa;

import compras.Comprador;

public class Exer5 {
    public static void main(String[] args) {
        Comprador c1 = new Comprador();
        c1.imprimir();
        c1.nome = "Renan Muniz Merlo";
        c1.salario = 2099.00;
        c1.imprimir();

        Comprador c2 = new Comprador();
        c2.imprimir();
    }
}
