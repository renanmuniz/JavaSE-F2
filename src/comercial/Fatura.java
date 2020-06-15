package comercial;

public class Fatura {
    public double valor;

    public Fatura(){
        valor = 10;
    }

    public void faturar(double valor){
        System.out.println("valor      = " + valor);
        System.out.println("this.valor = " + this.valor);
        this.valor = valor;
    }
}
