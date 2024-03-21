public class Personagem {
    String nome;
    int energia = 10;
    int fome = 0;
    int sono = 0;


    Personagem(int energia, int fome, int sono){
        if(energia >= 0 && energia <= 10){
            this.energia = energia;
        }

        if(fome >= 0 && fome <= 10){
            this.fome = fome;
        }

        if(sono >= 0 && sono <= 10){
            this.sono = sono;
        }
    }

    void cacar(){
        if(energia >= 2){
            System.out.printf("%s esta cacando...\n", nome);
            energia -= 2;
        }
        else{
            System.out.printf("%s sem energia para cacar...\n", nome);
        }

        fome = Math.min(fome + 1, 10);
        sono = sono < 10 ? sono + 1 : 10;
    }

    void comer(){
        switch(fome){
            case 0:
                System.out.printf("%s sem fome...\n", nome);
                break;
            
            default:
                System.out.printf("%s esta comendo...\n", nome);
                --fome;
                energia = energia == 10 ? energia : energia + 1;
        }
    }

    void dormir(){
        if(sono >= 1){
            System.out.printf("%s esta dormindo...\n", nome);
            sono -= 1;
            energia = Math.min(energia + 1, 10);
        }
        else{
            System.out.printf("%s sem sono...\n", nome);
        }
    }



    public String toString(){
        return String.format(
            "%s: (e:%d, f:%d, s:%d)",
            nome, energia, fome, sono
        );
    }

}
