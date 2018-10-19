package Model;

import Controller.EleitorController;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Locale;
import javax.swing.JOptionPane;

public class cadastroEleitor {
        EleitorController ctr = new EleitorController();

        public cadastroEleitor() throws Exception{
        ctr.recuperaLista();
        SimpleDateFormat formatter = new SimpleDateFormat("dd-MM-yyyy", Locale.ENGLISH);
        
        String userID1 = JOptionPane.showInputDialog(null, "Digite Codigo do Eleitor");
        int userID = Integer.parseInt(userID1);
        
        String nomeEleitor = JOptionPane.showInputDialog(null, "Digite o Nome do Eleitor");
        
        String nomePai = JOptionPane.showInputDialog(null, "Digite o Nome do Pai do Eleitor");
        
        String nomeMae = JOptionPane.showInputDialog(null, "Digite o Nome da Mãe do Eleitor");
        
        String sexo = JOptionPane.showInputDialog(null, "Digite o Sexo do Eleitor");
        
        String naturalidade = JOptionPane.showInputDialog(null, "Digite a Naturalidade do Eleitor");
        
        String senha = JOptionPane.showInputDialog(null, "Digite a Senha do Eleitor");
        
        String dataNascLabel = JOptionPane.showInputDialog(null, "Digite a Data de Nascimento do Eleitor");
        Date dataNasc = formatter.parse(dataNascLabel);
        
        String dataEmissaoLabel = JOptionPane.showInputDialog(null, "Digite a Data de Emissão do Eleitor");
        Date dataEmissao = formatter.parse(dataEmissaoLabel);
        
        String situacao = JOptionPane.showInputDialog(null, "Digite a Situação do Eleitor");
        
        ctr.addEleitor(new Eleitor(nomeEleitor, nomePai, nomeMae, sexo, naturalidade, userID, senha, dataNasc, dataEmissao, situacao));
        }
}
