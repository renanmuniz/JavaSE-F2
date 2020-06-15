package programa;

import compras.Comprador;

public class Exer6 {
    public static void main(String[] args) {
        int dez = 10;
        if(dez==10){
          //escopo logico do if true
          Comprador c1 = new Comprador();
          c1.nome = "Renan Merlo";
          c1.salario = 2099;
          c1.imprimir();
        }
        //c1.imprimir(); C1 não existe mais aqui.
        Comprador c2 = new Comprador();
        c2.nome = "Sergio";
        c2.salario = 500;
        c2.imprimir();

        c2=null;
        //c2 não existe daqui para baixo. Limpou a referência de memória.
        //c2.imprimir(); Compila, mas em execução nao encontra. NullPointerException.
    }
}
