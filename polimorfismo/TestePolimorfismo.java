public class TestePolimorfismo {
    public static void main(String[] args){
        // Gato g = new Gato();
        // Cachorro c = new Cachorro();
    
        // g.falar();
        // c.falar();

        Animal a1 = new Gato();
        Animal a2 = new Cachorro();
        a1.falar();
        a2.falar();
    }
}
