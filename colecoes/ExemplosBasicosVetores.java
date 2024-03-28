public class ExemplosBasicosVetores{
    public static void main(String[] args){

        System.out.println("\n\n\n");
        
        // Vetores são objetos, portanto eles moram na Heap


        // Variável de referência para um vetor de inteiros
        // double [] v3 = new double[20];
        int [] v1; // Também pode ser assim: int v1 [];
        v1 = new int[4];

        // O próprio Java 'zera' os valores de um array ao criá-la. Aqui o que está vazio vira '0'
        for(int item : v1){
            System.out.printf("%d ", item);
        }

        //System.out.println();
        // Erro: Exceção fora do limites aceitos. v1[4] não existe!
        // for(int i=0; i <= v1.length; i++){
        //     System.out.printf("%d ", v1[i]);
        // }

        System.out.println("\n");




        String [] v2 = new String[4];
        v2[0] = "Ana";
        v2[1] = "Pedro";

        // O próprio Java 'zera' os valores de um array ao criá-la. Aqui o que está vazio vira 'null'
        for(String item : v2){
            System.out.printf("%s ",item);
        }
        System.out.println("\n");
    }
}