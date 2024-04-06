import java.util.Arrays;

public class VetorDinamico {
    // Variáveis de instância (cada instância ou objeto tem a sua cópia)
    private int qtde;
    private int cap;
    private int [] elementos;

    // Variável de classe (todas as instâncias compartilham este mesmo valor)
    public static final int CAP_MINIMA = 4;


    // Construtores (com e sem parametros)
    VetorDinamico(){
        cap = CAP_MINIMA;
        qtde = 0;
        elementos = new int[CAP_MINIMA];
    }

    VetorDinamico(int capMinima){
        double aux = capMinima;
        while(aux >= 2){
            aux /= 2;
        }
        cap = aux == 1 && capMinima > 3 ? capMinima : CAP_MINIMA;
        qtde = 0;
        elementos = new int[cap];
    }


    // Getter do array 'elementos'
    int[] getElementos(){
      return Arrays.copyOf(elementos, qtde);
    }






    // Verificar se o vetor está cheio
    boolean estaCheio(){
      return qtde == cap;
    }

    // Redimensionar o vetor para ele esteja cheio. Sua capacidade dobrará!
    void redimensionar(){
      // Alocar um vetor com o dobro da capacidade atual chamado 'auxiliar'
      int[] auxiliar = new int[cap*2];
      cap *= 2;

      // Copiar todo mundo do vetor 'elementos' para o vetor 'auxiliar'
      int i=0;
      for(int valor : elementos){
        auxiliar[i] = valor;
        i++;
      }
      
      // Ajustar o ponteiro 'elementos' para que ele aponte para o novo vetor 'auxiliar'
      elementos = auxiliar;
    }

    // Adicionar valores a um vetor
    void adicionar(int elemento){
      // Se o vetor estiver cheio, criar um novo vetor redimensionado antes de adicionar novos valores
      if(estaCheio()){
        redimensionar();
      }

      elementos[qtde] = elemento;
      qtde++;
    }







    // Mega Sena
    void adicinarSemRepeticao(int e){
      if(!existe(e)){
        adicionar(e);
      }
    }

    boolean existe(int e){
      for(int i=0; i<qtde; i++){
        if(e == elementos[i]){
          return true;
        }
      }
      return false;
    }

    int tamanho(){
      return qtde;
    }







    // Remover um elemento no final de 'elementos'
    void removerNoFinal(){
      qtde -= 1;
    }

    boolean estaVazio(){
      return qtde == 0;
    }

    boolean estaUmQuartoCheio(){
      return qtde == (cap / 4);
    }

    void reduzirTamanho(){
      if(!estaVazio()){
        removerNoFinal();

        if(cap>4 && estaUmQuartoCheio()){
          cap /= 2;
        }
      } 
    }









    // Imprimir resultados na tela
    public String toString(){
      StringBuilder sb = new StringBuilder("");

      sb.append("Qtde: ").append(qtde);
      sb.append("\n");
      sb.append("Cap: ").append(cap);
      sb.append("\n");
      sb.append(qtde > 0 ? "Elementos: " : "");
      for(int i=0; i<qtde; i++){
        sb.append(elementos[i]).append(" ");
      }

      return sb.toString();
    }
}