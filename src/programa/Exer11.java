package programa;

import heranca.Animal;
import heranca.Humano;

public class Exer11 {
    public static void main(String[] args) {
        Animal cobra = new Animal();
        cobra.setNome("cobra");
        cobra.andar();

        Humano humano = new Humano();
        humano.setNome("Renan");
        humano.andar();
        humano.pensar();
    }
}
