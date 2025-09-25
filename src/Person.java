public record Person(String nome, int idade) {

    // Variável privada estática (compartilhada entre todos os objetos)
    private static int contador = 0;

    // Construtor canônico (chamado automaticamente)
    public Person {
        if (idade < 0) {
            throw new IllegalArgumentException("Idade inválida!");
        }
        contador++; // incrementa contador sempre que cria objeto
    }

    // Construtor sem parâmetros (não-canônico)
    public Person() {
        this("Desconhecido", 0); // delega para o canônico
    }

    // "Setter" simulando alteração do nome (retorna novo objeto)
    public Person alterarNome(String novoNome) {
        return new Person(novoNome, this.idade);
    }

    // "Setter" simulando alteração da idade (retorna novo objeto)
    public Person alterarIdade(int novaIdade) {
        return new Person(this.nome, novaIdade);
    }

    // Método estático para acessar contador
    public static int getContador() {
        return contador;
    }

    // Getters extras (opcional, já existem no record)
    public String getNome() {
        return nome;
    }

    public int getIdade() {
        return idade;
    }
}
