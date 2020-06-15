package programa;

import comercial.Pessoa;

public class Exer8 {
    public static void main(String[] args) {
        Pessoa p = new Pessoa();
        p.nome = "Renan";
        p.anoNasc = 1990;

        int idade = 2020 - p.anoNasc;
        System.out.println("Idade do " + p.nome + " é " + idade);
    }
}
