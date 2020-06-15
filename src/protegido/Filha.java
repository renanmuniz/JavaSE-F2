package protegido;

public class Filha extends Pai{
    public void fazerAlgo(){
        idade = 10; //    tem acesso, protected.
        //nome = "Renan"; não tem acesso, private.

        System.out.println(idade);
    }
}
