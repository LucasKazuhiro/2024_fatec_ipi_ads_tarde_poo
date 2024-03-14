public class LivroDeNotas{

    private String nomeDisciplina;

    // Construtor padrão: lista de parâmetros
    LivroDeNotas(String nomeDisciplina){
        this.nomeDisciplina = nomeDisciplina;
    }


    // Métodos
        // Setar nomeDisciplina
    public void setNomeDiscipliana(String setarNomeDisciplina){
        nomeDisciplina = setarNomeDisciplina;
    }
    
        // Getar nomeDisciplina
    public String getNomeDisciplina(){
        return nomeDisciplina;
    } 

        // Imprimir uma mensagem
    public void exibirMensagem(){
        System.out.printf("Bem vindo ao livro de notas de %s\n", nomeDisciplina);
    }
}