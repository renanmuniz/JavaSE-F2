package comercial;

public class Pessoa2 {

    private String nome;
    private int anoNasc;

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public int getAnoNasc() {
        return anoNasc;
    }

    public void setAnoNasc(int anoNasc) {
        if(anoNasc>=1970) {
            this.anoNasc = anoNasc;
        }else{
            this.anoNasc = 0;
        }
    }

    public int calcularIdade(){
        if(anoNasc>0){
            return 2020-anoNasc;
        }
        return 0;
    }

    public void imprimir(){
        System.out.println("Idade do " + this.nome + " é " + calcularIdade());
    }

}
