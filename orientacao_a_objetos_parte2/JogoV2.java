import java.util.Random;

public class JogoV2 {
    public static void main(String[] args) throws Exception{
        var p = new Personagem(4, 4, 4);
        var p2 = new Personagem(1, 2, 10);
        var p3 = new Personagem(2, 10, 4);
        var gerador = new Random();

        p.nome = "Gamal";
        p2.nome = "Soneca";
        p3.nome = "Comilao";

        while(true){
            int oQueFazer = gerador.nextInt(4);

            switch(oQueFazer){
                default:
                    p.cacar();
                    p2.dormir();
                    p3.comer();
                    break;

                case 1:
                    p.comer();
                    p2.comer();
                    p3.cacar();
                    break;

                case 2:
                    p.dormir();
                    p2.cacar();
                    p3.dormir();
                    break;
            }

            System.out.printf("\n");

            System.out.println(p);
            System.out.println(p2);
            System.out.println(p3);
            System.out.println("***************************");

            System.out.println("\n");

            Thread.sleep(1000);
        }
    }
}
