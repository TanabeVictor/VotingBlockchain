package Model;

import Controller.CandidatoController;
import javax.swing.JOptionPane;

public class cadastroCandidato {
        CandidatoController ctr = new CandidatoController();

        public cadastroCandidato() throws Exception{
        ctr.recuperaLista();
        String userID1 = JOptionPane.showInputDialog(null, "Digite Codigo do Candidato");
        int codigo = Integer.parseInt(userID1);
        
        String nomeCandidato = JOptionPane.showInputDialog(null, "Digite o Nome do Candidato");
        
        String nomePartido = JOptionPane.showInputDialog(null, "Digite o Nome do Partido do Candidato");
        
        
        String nomeVice = JOptionPane.showInputDialog(null, "Digite o Nome do Vice do Candidato");
        
        String nomeImagemVice = JOptionPane.showInputDialog(null, "Digite o Nome da Imagem do Vice do Candidato");
        
        String nomeImagem = JOptionPane.showInputDialog(null, "Digite o Nome da Imagem do Candidato");
        ctr.addCandidato(new Candidato( nomeCandidato, nomeImagem, nomePartido, nomeVice, nomeImagemVice, codigo));
        }
}
