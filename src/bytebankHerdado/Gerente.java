package bytebankHerdado;

public class Gerente extends Funcionario {

    private int senha;

    public boolean autentica(int senha) {
        if (senha == this.senha) {
            return true;
        } else {
            return false;
        }
    }

    public double getBonificacao() {
        return this.salario * 0.1;
    }
}