public class Musica implements Comparable <Musica>{
    private String titulo;
    private int avaliacao = 0;

    public Musica(String titulo){
        this.titulo = titulo;
    }

    public String getTitulo(){
        return titulo;
    }

    public int getAvaliacao() {
        return avaliacao;
    }

    public void avaliar(int avaliacao){
        this.avaliacao = avaliacao;
    }



    public String toString() {
        return String.format("Titulo: %s, Avaliacao: %d", titulo, avaliacao);

    }

    public int compareTo(Musica m){
        return this.getTitulo().compareTo(m.getTitulo());
    }
}
