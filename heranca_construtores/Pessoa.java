public class Pessoa{
    private String nome;
    private int idade;

    // Construtor Padrao (sem parametros)
    public Pessoa(){
        System.out.println("P");
    }

    // Construtores com Parametros
    public Pessoa(String nome, int idade){
        this.nome = nome;
        if(idade >= 18){
            this.idade = idade;
        }
    }

    public Pessoa(String nome){
        this(nome, 0);
    }

    public Pessoa(int idade){
        this(null, idade);
    }


    
    public String toString(){
        return String.format("Nome: %s, Idade: %d", nome, idade);
    }
}