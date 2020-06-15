package heranca;

public class Animal {
    private String nome;

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public void andar(){
        System.out.println("animal " + nome + " andando...");
    }
}
