import javax.swing.JOptionPane;
import java.util.ArrayList;
import java.util.*;

public class Playlist {
    public static void main(String[] args){
        ArrayList<Musica> musicas = new ArrayList<>();

        /*
            0 - Sair
            1 - Cadastrar música
            2 - Avaliar música
            3 - Lista ordenada pelo nome
            4 - Lista ordenada pela avaliação
            5 - Lista ordenada por Comprimento de nome
            6 - Lista ordenada por Titulo e Avaliacao
        */

        var menu =  "0 - Sair\n1 - Cadastrar muica\n2 - Avaliar musica\n3 - Lista ordenada pelo Nome\n4 - Lista ordenada pela Avaliacao\n5 - Lista ordenada por Comprimento de Nome\n6 - Lista ordenada por Titulo e Avaliacao";

        int op;

        do{
            op = Integer.parseInt(JOptionPane.showInputDialog(menu));

            switch(op){
                case 1:{
                    String titulo = JOptionPane.showInputDialog("Titulo? ");
                    var musica = new Musica(titulo);
                    musicas.add(musica);

                    break;
                }

                case 2:{
                    String titulo = JOptionPane.showInputDialog("Titulo? ");

                    boolean foiAchado = false;

                    // For each (enhanced for)
                    for(Musica m : musicas){
                        if(m.getTitulo().equals(titulo)){
                            m.avaliar(Integer.parseInt(JOptionPane.showInputDialog("Nota: ")));

                            foiAchado = true;
                            break;
                        }
                    }

                    JOptionPane.showMessageDialog(null, foiAchado ? "Avaliacao Ok!" : "Musica nao encontrada!");

                    break;
                }

                case 3:{
                    // MINHA FORMA DE ORGANIZAR AS MUSICAS EM ORDEM ALFABETICA
                    // musicas.sort(Comparator.comparing(Musica::getTitulo));

                    // StringBuilder musicas_ordenadas = new StringBuilder();

                    // for(Musica m : musicas){ 
                    //     musicas_ordenadas.append(m + "\n"); 
                    // }
                    
                    // JOptionPane.showMessageDialog(null, musicas_ordenadas.toString());

                    // break;



                    // FORMA DO PROFESSOR
                    Collections.sort(musicas);
                    JOptionPane.showMessageDialog(null, musicas);

                    break;
                }

                case 4:{
                    Collections.sort(musicas, new PorAvaliacaoComparator());
                    JOptionPane.showMessageDialog(null, musicas);
                    break;
                }

                case 5:{
                    Collections.sort(musicas, new PorComprimentoNome());
                    JOptionPane.showMessageDialog(null, musicas);
                    break;
                }

                case 6:{
                    Collections.sort(musicas, new PorTituloAvaliacao());
                    JOptionPane.showMessageDialog(null, musicas);
                    break;
                }



                case 0:
                    JOptionPane.showMessageDialog(null, "Ate mais");
                    break;
            }
        } while(op != 0);
    }
}


class PorAvaliacaoComparator implements Comparator <Musica>{
    public int compare(Musica m1, Musica m2){
        if(m1.getAvaliacao() > m2.getAvaliacao()){
            return -1;
        }
        if(m1.getAvaliacao() == m2.getAvaliacao()){
            return 0;
        }

        return 1;
    }
}


class PorComprimentoNome implements Comparator <Musica>{
    public int compare(Musica m1, Musica m2){
        if(m1.getTitulo().length() < m1.getTitulo().length()){
            return -1;
        }
        if(m1.getTitulo().length() == m1.getTitulo().length()){
            return 0;
        }

        return 1;
    }
}


class PorTituloAvaliacao implements Comparator <Musica>{
    public int compare(Musica m1, Musica m2){
        if (m1.compareTo(m2) == 0) {
            if(m1.getAvaliacao() < m2.getAvaliacao()){
                return -1;
            }
            if(m1.getAvaliacao() == m2.getAvaliacao()){
                return 0;
            }
            return 1;
        }
   
            return m1.compareTo(m2);
    }
}