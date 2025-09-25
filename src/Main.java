
public class Main {
    public static void main(String[] args) {
        // Criando objetos com construtor canônico
        Person p1 = new Person("Roberto", 30);
        Person p2 = new Person("Yan", 25);

        // Criando objeto com construtor sem parâmetros
        Person p3 = new Person();

        // Lendo valores com getters
        System.out.println("p1: " + p1.getNome() + ", " + p1.getIdade());
        System.out.println("p2: " + p2.getNome() + ", " + p2.getIdade());
        System.out.println("p3: " + p3.getNome() + ", " + p3.getIdade());

        // Alterando valores (retornando novos objetos)
        Person p1Novo = p1.alterarNome("Roberto Cesar");
        Person p2Novo = p2.alterarIdade(28);

        System.out.println("p1 atualizado: " + p1Novo);
        System.out.println("p2 atualizado: " + p2Novo);

        // Contador de objetos criados
        System.out.println("Número de pessoas criadas: " + Person.getContador());
    }
}
