public class Teste {
    public static void main(String[] args){
        var ph = new ProfessorHorista();
        var pp = new ProfessorPesquisador();

        ph.setName("Ana");
        pp.setName("João");

        ph.lecionar();
        pp.lecionar();
    }
}
