public class TesteVetorGenerico {
    public static void main(String[] args){
        System.out.println("\n\n\n");

        VetorDinamico <Integer> v = new VetorDinamico<>();
        VetorDinamico <String> v2 = new VetorDinamico<>();
        VetorDinamico <Musica> v3 = new VetorDinamico<>();

        v.adicionar(1);

        System.out.println(v);
        System.out.println("\n********************\n");

        v2.adicionar("Teste qualquer usando String!");
        v2.adicionar("Outro teste usando String");
        System.out.println(v2);

        System.out.println("\n********************\n");

        v3.adicionar(new Musica ("Creep - Radiohead"));
        System.out.println(v3);


        System.out.println("\n\n\n");
    }
}
