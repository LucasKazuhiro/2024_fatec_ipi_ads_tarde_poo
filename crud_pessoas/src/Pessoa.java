import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor

public class Pessoa {
    private int codigo;
    private String nome;
    private String fone;
    private String email;
    private int idade;

    // Construtor > apenas codigo
    public Pessoa(int codigo){
        this.codigo = codigo;
    }

    public String toString(){
        StringBuilder sb = new StringBuilder("");

        sb.append(String.format( "%d | %s | %s | %s | %d\n", 
            this.getCodigo(), this.getNome(), 
            this.getFone(), this.getEmail(), 
            this.getIdade()));

        return sb.toString();
    }
}