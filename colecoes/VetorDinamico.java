public class VetorDinamico {
    // Variáveis de instância (cada instância ou objeto tem a sua cópia)
    private int qtde;
    private int cap;
    private int [] elementos;

    // Variável de classe (todas as instâncias compartilham este mesmo valor)
    public static final int CAP_MINIMA = 4;

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



}