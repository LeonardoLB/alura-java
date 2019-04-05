package bytebankHerdado;

public class TesteReferencias {

    public static void main(String[] args) {

        Gerente leo = new Gerente();

        leo.setNome("Leonardo");
        String nome = leo.getNome();

        System.out.println(nome);

    }

}