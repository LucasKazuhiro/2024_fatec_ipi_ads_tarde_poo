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
      if(qtde == cap){
        return true;
      }
      else{
        return false;
      }
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
}