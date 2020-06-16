package programa;

import metodoestatico.Soma;

public class Exer21 {
    public static void main(String[] args) {
        //Pode chamar sem instanciar objeto
        //Classe para metodos utilitarios
        System.out.println("Soma = " + Soma.somar(1,2));

        //Esse seria o jeito padrao, mas nao faz sentido usar:
        Soma s = new Soma();
        System.out.println("Soma = " + s.somar(1,2));
    }
}
