package bytebankHerdado;

public class Gerente extends Funcionario {

    private int senha;

    public void setSenha(int senha) {
        this.senha = senha;
    }

    public boolean autentica(int senha) {
        if (senha == this.senha) {
            return true;
        } else {
            return false;
        }
    }

    public double getBonificacao() {
        return  super.getBonificacao() + super.salario * 0.1;
    }

    public double getBonificacao2() {
        return super.getBonificacao() + super.getSalario();
    }
}