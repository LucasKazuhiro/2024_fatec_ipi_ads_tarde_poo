import java.util.Random;

public class GeradorMegaSena {
    public static void main(String[] args){
        var megaSena = new VetorDinamico(){

            public String toString(){
                var sb = new StringBuilder("Jogo da Mega Sena\n");

                for(int i=0; i<tamanho(); i++){
                    sb.append(getElementos()[i]).append(" ");
                }

                return sb.toString();
            }
        };


        var gerador = new Random();
        


        
        while(megaSena.tamanho() < 6){
            megaSena.adicinarSemRepeticao(1 + gerador.nextInt(60));
        }
        System.out.println(megaSena);
    }
}
