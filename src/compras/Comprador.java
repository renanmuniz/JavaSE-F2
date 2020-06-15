package compras;

public class Comprador {
    public String nome;
    public double salario;

    public Comprador(){
        nome = "desconhecido";
        salario= 1800;
        System.out.println("Executou o construtor");
    }

    public void imprimir()
    {
        System.out.println(nome + " - " + salario);
    }

}
