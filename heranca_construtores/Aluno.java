public class Aluno extends Pessoa{

    private int ra;

    public Aluno(String nome, int idade, int ra){
        super(nome, idade);
        this.ra = ra;
        System.out.println("A");
    }


    public String toString(){
        StringBuilder sb = new StringBuilder();

        sb.append(super.toString());
        sb.append(String.format(", RA: %d", ra));

        return sb.toString();
    }
}
