import javax.swing.JOptionPane;

public class App {
    public static void main(String[] args){
        var menu = "1 - Cadastrar\n2 - Atualizar\n3 - Apagar\n4 - Listar\n5 - Média de Idades (calculo via Java)\n6 - Media de Idades (calculo via SQL)";

        int op = 0;

        do{
            try{
                op = Integer.parseInt(JOptionPane.showInputDialog(menu));
    
                switch(op){
                    case 0:{
                        JOptionPane.showMessageDialog(null, "Ate mais!!");
                        break;
                    }

                    // Cadastrar
                    case 1:{
                        var nome = JOptionPane.showInputDialog("Nome?");
                        var fone = JOptionPane.showInputDialog("Fone?");
                        var email = JOptionPane.showInputDialog("Email?");
                        var idade = Integer.parseInt(JOptionPane.showInputDialog("Idade?"));

                        var p = new Pessoa(0, nome, fone, email, idade);

                        var dao = new PessoaDAO();
                        dao.cadastra(p);

                        JOptionPane.showMessageDialog(null, "Dados cadastrados com sucesso!!");

                        break;
                    }

                    // Atualizar
                    case 2:{
                        var codigo = Integer.parseInt(JOptionPane.showInputDialog("Codigo?"));
                        var nome = JOptionPane.showInputDialog("Nome?");
                        var fone = JOptionPane.showInputDialog("Fone?");
                        var email = JOptionPane.showInputDialog("Email?");
                        var idade = Integer.parseInt(JOptionPane.showInputDialog("Idade?"));

                        var p = new Pessoa(codigo, nome, fone, email, idade);

                        var dao = new PessoaDAO();
                        dao.atualizar(p);

                        JOptionPane.showMessageDialog(null, "Dados alterados com sucesso!!");
                        
                        break;
                    }

                    case 3:{
                        var codigo = Integer.parseInt(JOptionPane.showInputDialog("Codigo?"));

                        var p = new Pessoa(codigo);

                        var dao = new PessoaDAO();
                        dao.apagar(p);

                        JOptionPane.showMessageDialog(null, "Usuario deletado com sucesso");
                        break;
                    }

                    case 4:{
                        var pessoas = new PessoaDAO().listar();
                        
                        StringBuilder sb = new StringBuilder();
                        for (Pessoa pessoa : pessoas) {
                            sb.append(pessoa.toString());
                        }

                        JOptionPane.showMessageDialog(null, sb);

                        break;
                    }

                    case 5:{
                        var media = new PessoaDAO().mediaIdades();
                        JOptionPane.showMessageDialog(null, "A media das idades (calculado no Java) eh " + media);
                        
                        break;
                    }

                    case 6:{
                        var media = new PessoaDAO().mediaIdadesSQL();
                        JOptionPane.showMessageDialog(null, "A media das idades (calculado no SQL) eh " + media);

                        break;
                    }

                    default:
                        JOptionPane.showMessageDialog(null, "Opcao invalida. Digite outro numero");
                    }       
            }
            catch (Exception e){
                e.printStackTrace();
            }
        } while(op != 0);

        
    }
}