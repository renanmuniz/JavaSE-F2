package comercial;

public class Venda {

    public String pessoa;
    public double valor;

    public void vender(){
        System.out.println(pessoa + " esta vendendo R$" + this.valor);
    }

    public double calcularImposto(){
        double dozePct = this.valor * 0.10;
        return dozePct;
    }

    public void adicionarJuros(double juros){
        double novo = this.valor * juros / 100;
        this.valor += novo;
    }
}
