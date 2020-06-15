package programa;

import abstrato.Argentino;
import abstrato.Brasileiro;
import abstrato.Empregado;

public class Exer16 {
    public static void main(String[] args) {

        //Empregado ep = new Empregado(); Classe abstrata não pode ser instanciada!

        Empregado ep1 = new Brasileiro();
        ep1.setNome("Renan");
        System.out.println(ep1.getNome() + " " + ep1.valorFgts(100));

        Empregado ep2 = new Argentino();
        ep2.setNome("Carlito");
        System.out.println(ep2.getNome() + " " + ep2.valorFgts(100));
    }
}
