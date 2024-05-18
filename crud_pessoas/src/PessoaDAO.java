import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.List;

// Data Access Object
public class PessoaDAO { 
    
    public void cadastra(Pessoa p) throws Exception{
        // 1. Especificar o comando SQL
        var sql = "INSERT INTO tb_pessoa(nome, fone, email, idade) VALUES (?, ?, ?, ?)";

        // 2. Estabelecer uma conexão com o banco
        Connection conexao = ConnectionFactory.getConnection();

        // 3. Preparar o comando
        PreparedStatement ps = conexao.prepareStatement(sql);

        // 4. Substituir os eventuais placeholders
        ps.setString(1, p.getNome());
        ps.setString(2, p.getFone());
        ps.setString(3, p.getEmail());
        ps.setInt(4, p.getIdade());

        // 5. Executar o comando
        ps.execute();

        // 6. Fechar a conexão
        ps.close();
        conexao.close();
    }


    public void atualizar(Pessoa p) throws Exception{
        // 1. Especificar o Comando SQL
        var sql = "UPDATE tb_pessoa SET nome = ?, fone = ?, email = ?, idade = ? WHERE cod_pessoa = ?";

        try(
            // 2. Estabelecer uma conexao com o SGBD
            var conexao = ConnectionFactory.getConnection();
            
            // 3. Preparar c omando
            PreparedStatement ps = conexao.prepareStatement(sql);
        ){
            // 4. Substituir os eventuais placeholders
            ps.setString(1, p.getNome());
            ps.setString(2, p.getFone());
            ps.setString(3, p.getEmail());
            ps.setInt(4, p.getIdade());
            ps.setInt(5, p.getCodigo());

            // 5. Executar o comando
            ps.execute();

            /*
                # Try with recursos ja fecha automaticamente as coisas
                6. Fechar os recursos

                ps.close();
                conexao.close();
             */
        }
    }



    public void apagar(Pessoa p) throws Exception{
        var sql = "DELETE FROM tb_pessoa WHERE cod_pessoa = ?";

        try(
            Connection conexao = ConnectionFactory.getConnection();
            PreparedStatement ps = conexao.prepareStatement(sql);
        ){
            ps.setInt(1, p.getCodigo());
            ps.execute();
        }
    }



    public List<Pessoa> listar() throws Exception{
        var pessoas = new java.util.LinkedList<Pessoa>();

        var sql = "SELECT * FROM tb_pessoa";

        try(
            Connection conexao = ConnectionFactory.getConnection();
            PreparedStatement ps = conexao.prepareStatement(sql);
            ResultSet resultado = ps.executeQuery();
        ){
            while(resultado.next()){
                Pessoa p = new Pessoa(
                    resultado.getInt("cod_pessoa"), 
                    resultado.getString("nome"),
                    resultado.getString("fone"),
                    resultado.getString("email"),
                    resultado.getInt("idade")
                );

                pessoas.add(p);
            }
        }

        return pessoas;
    }



    public Float mediaIdades() throws Exception{
        var sql = "SELECT idade from tb_pessoa";

        float media = 0;
        int count=0;

        try(
            Connection conexao = ConnectionFactory.getConnection();
            PreparedStatement ps = conexao.prepareStatement(sql);
            ResultSet resultado = ps.executeQuery();
        ){
            while(resultado.next()){
                media += resultado.getInt("idade");
                count++;
            }
            media /= count;
        }

        return media;
    }



    public Float mediaIdadesSQL() throws Exception{
        var sql = "SELECT ROUND(AVG(idade),2) AS media from tb_pessoa";

        try(
            Connection conexao = ConnectionFactory.getConnection();
            PreparedStatement ps = conexao.prepareStatement(sql);
            ResultSet resultado = ps.executeQuery();
        ){
            if(resultado.next()){
                return resultado.getFloat("media");
            }
            else{
                return null;
            }
        }
    }


}