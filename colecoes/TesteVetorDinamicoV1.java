import java.util.Random;

public class TesteVetorDinamicoV1{
  public static void main(String[] args) {
    var v = new VetorDinamico(8);
    var gerador = new Random();

    int count=0;
    while(count < 17){
      v.adicionar(gerador.nextInt(6) + 1);
      count++;
    }

    System.out.printf("\n\n\n\n");

    for(int valor : v.getElementos()){
      System.out.printf("%d ", valor);
    }

    System.out.printf("\n\n\n\n");

  }
}