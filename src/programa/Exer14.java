package programa;

import sobreposicao.Boleto;

public class Exer14 {
    public static void main(String[] args) {
        
        Boleto boleto = new Boleto();
        boleto.pdf();

        Boleto boleto2 = new Boleto("Renan",100);
        boleto2.pdf();

        System.out.println("Taxa = " + boleto.calcularTaxa());
        System.out.println("Taxa = " + boleto2.calcularTaxa(20));
    }
}
