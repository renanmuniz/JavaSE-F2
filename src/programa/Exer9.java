package programa;

import comercial.Pessoa2;

public class Exer9 {
    public static void main(String[] args) {
        Pessoa2 p2 = new Pessoa2();
        // p2.nome = "Renan"; não funciona!
        //p2.dataNasc = 1990; não funciona!

        p2.setNome("Renan");
        p2.setAnoNasc(1900);
        System.out.println(p2.getAnoNasc());
        p2.setAnoNasc(1990);
        System.out.println(p2.getAnoNasc());

        System.out.println(p2.getNome());
        System.out.println(p2.getAnoNasc());
        System.out.println(p2.calcularIdade());
        p2.imprimir();

    }
}
