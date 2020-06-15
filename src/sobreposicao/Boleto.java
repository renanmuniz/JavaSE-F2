package sobreposicao;

public class Boleto {
    private String cliente;
    private double valor;

    public Boleto(){
        cliente = "desconhecido";
        valor = 100;
    }

    public Boleto(String c, double v){
        cliente = c;
        valor = v;
    }

    public double calcularTaxa(){
        return this.valor * 0.10;
    }

    public double calcularTaxa(int taxa){
        return (this.valor * taxa) / 100;
    }

    public void pdf(){
        System.out.println("Boleto para " + cliente + " de R$" + valor);
    }
}
