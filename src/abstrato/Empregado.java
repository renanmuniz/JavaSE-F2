package abstrato;

public abstract class Empregado {
    private String nome;
    private int taxaFgts;

    public double valorFgts(double salario){
        return (salario * taxaFgts)/100;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public int getTaxaFgts() {
        return taxaFgts;
    }

    public void setTaxaFgts(int taxaFgts) {
        this.taxaFgts = taxaFgts;
    }
}
