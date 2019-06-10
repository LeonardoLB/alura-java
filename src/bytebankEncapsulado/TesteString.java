package bytebankEncapsulado;

public class TesteString {

    public static void main(String[] args) {

        int a = 3; // esta atribuicao é um primitivo

        String nome = "leo"; // esta atribuicao é um literal

        String nome2 = new String("leo");  // pessima pratica

        nome.replace("l", "L"); // imutabilidade o nome n sera alterado

        nome = nome.replace("l", "L");

        System.out.println(nome);

    }

}
