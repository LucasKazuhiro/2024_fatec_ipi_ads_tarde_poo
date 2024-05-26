public class AnimalOld{
    private String nome;
    private int tipo;
    
    
    public void setTipo(int tipo){
        this.tipo = tipo;
    }
    
    public int getTipo(){
        return tipo;
    }

    public void falar(){
        if(tipo == 1){
            System.out.println("Auau");
        }
        else if(tipo == 2){
            System.out.println("Miau");
        }
        else if(tipo == 3){
            System.out.println("Quack");
        }
    }
}