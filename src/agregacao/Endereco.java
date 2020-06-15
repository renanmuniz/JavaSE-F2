package agregacao;

public class Endereco {

    private String rua;
    private int numero;
    private Cidade cidade;

    public Endereco(){
        cidade = new Cidade();
    }

    public String getRua() {
        return rua;
    }

    public void setRua(String rua) {
        this.rua = rua;
    }

    public int getNumero() {
        return numero;
    }

    public void setNumero(int numero) {
        this.numero = numero;
    }

    public Cidade getCidade() {
        return cidade;
    }

    public void setCidade(Cidade cidade) {
        this.cidade = cidade;
    }

    public void imprimir(){
        System.out.println("Rua    : " + rua);
        System.out.println("Numero : " + numero);
        cidade.imprimir();
    }
}
