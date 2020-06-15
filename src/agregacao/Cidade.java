package agregacao;

public class Cidade {
    private String nome;
    private String uf;

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getUf() {
        return uf;
    }

    public void setUf(String uf) {
        this.uf = uf;
    }

    public void imprimir(){
        System.out.println("Cidade : " + this.nome);
        System.out.println("UF     : " +this.uf);
    }
}
