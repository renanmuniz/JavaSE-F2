package metodoabstrato;

public class Philco extends Radio{

    //Nesse caso, é obrigado a criar um metodo com mesmo nome,
    //visibilidade e assinatura do metodo abstrato da classe pai

    @Override
    public void tocar() {
        System.out.println("Metodo tocar da classe Philco ");
    }
}
