import java.util.Random;

public class TesteVetorDinamicoV1{
  public static void main(String[] args)  throws Exception{
    var v = new VetorDinamico(8);
    var gerador = new Random();


    System.out.printf("\n\n\n\n");


    while(true){
      v.adicionar(gerador.nextInt(6) + 1);
      System.out.println(v);
      System.out.println("\n************************\n");
      Thread.sleep(5000);
    }

    
  }
}