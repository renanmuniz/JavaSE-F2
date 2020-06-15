package agregacao;

public class Funcionario {
    private String nome;
    private double salario;
    private Endereco endereco;

    public Funcionario(){
        endereco = new Endereco();
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public double getSalario() {
        return salario;
    }

    public void setSalario(double salario) {
        this.salario = salario;
    }

    public Endereco getEndereco() {
        return endereco;
    }

    public void setEndereco(Endereco endereco) {
        this.endereco = endereco;
    }

    public void imprimir(){
        System.out.println("Nome   : "+nome);
        System.out.println("Salario: "+salario);
        endereco.imprimir();
    }
}
