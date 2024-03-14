import javax.swing.JOptionPane;

public class TesteLivroDeNotas{
    public static void main(String[] args){

        var livroDeNotas = new LivroDeNotas("ola");
        var livroDeNotas2 = new LivroDeNotas("lucas");


        // String nomeDisciplina = JOptionPane.showInputDialog("Insira o nome da disciplina!");

        // livroDeNotas.setNomeDiscipliana(nomeDisciplina);
        System.out.println(livroDeNotas.getNomeDisciplina());
        livroDeNotas.exibirMensagem();


        
        System.out.println("\n\n\n");



        // nomeDisciplina = JOptionPane.showInputDialog("Insira o nome da disciplina!");

        //livroDeNotas2.setNomeDiscipliana(nomeDisciplina);
        System.out.println(livroDeNotas.getNomeDisciplina());
        livroDeNotas2.exibirMensagem();

    }
}