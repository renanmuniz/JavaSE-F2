package programa;

import agregacao.Funcionario;

public class Exer10 {
    public static void main(String[] args) {
        Funcionario func = new Funcionario();

        func.setNome("Renan Muniz Merlo");
        func.setSalario(2099);
        func.getEndereco().setRua("Av Tanganica");
        func.getEndereco().setNumero(1500);
        func.getEndereco().getCidade().setNome("Londrina");
        func.getEndereco().getCidade().setUf("PR");

        func.imprimir();
    }
}
