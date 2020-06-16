package programa;

import atributoestatico.Pedido;

public class Exer20 {
    public static void main(String[] args) {
        Pedido p1 = new Pedido();
        p1.valor = 10;
        p1.taxa = 10;

        Pedido p2 = new Pedido();
        p2.valor = 99;
        p2.taxa = 22;

        System.out.println(p1.valor);
        System.out.println(p1.taxa);

        System.out.println(p2.valor);
        System.out.println(p2.taxa);

        Pedido.taxa = 30; //Consegu até chamar sem instanciar objeto
                          //pois pertence à classe e nao ao objeto.

        System.out.println(p1.valor);
        System.out.println(p1.taxa);

        System.out.println(p2.valor);
        System.out.println(p2.taxa);


    }
}
