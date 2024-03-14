package orientacao_a_objetos_parte2;

public class Personagem {
    String nome;
    int energia;
    int fome;
    int sono;

    void cacar(){
        System.out.printf("%s esta cacando...\n", nome);
    }

    void comer(){
        System.out.printf("%s esta comendo...\n", nome);
    }

    void dormir(){
        System.out.printf("%s esta dormindo", nome);
    }
}
