package Model;

import java.io.Serializable;

/**
 *
 * @author vitau
 */
public class Candidato implements Serializable{

    int codigo;
    String nomeCandidato, nomeImagem, nomeVice, nomeImagemVice, nomePartido;
    
    public Candidato(String nomeCandidato, String nomeImagem, String nomePartido, String nomeVice, String nomeImagemVice, int codigo) throws Exception {
        this.nomeCandidato = nomeCandidato;
        this.nomeImagem = nomeImagem;
        this.nomePartido = nomePartido;
        this.codigo = codigo;
        this.nomeVice = nomeVice;
        this.nomeImagemVice = nomeImagemVice;
    }
    
    public void setCodigo(int codigo){
    this.codigo = codigo;
    }
    
    public void setNomeCandidato(String nomeCandidato){
    this.nomeCandidato = nomeCandidato;
    }
    
    public void setNomeVice(String nomeVice){
    this.nomeVice = nomeVice;
    }
    
    public void setNomeImagemVice(String nomeImagemVice){
    this.nomeImagemVice = nomeImagemVice;
    }
    
    public void setNomeImagem(String nomeImagem){
    this.nomeImagem = nomeImagem;
    }
   
    public void setPartido(String nomePartido){
    this.nomePartido = nomePartido;
    }
    
    public int getCodigo(){
    return this.codigo;
    }
    
    public String getNomeCandidato(){
    return this.nomeCandidato;
    }
    
    public String getNomeImagem(){
    return this.nomeImagem;
    }
    
    public String getNomeVice(){
    return this.nomeVice;
    }
    
    public String getNomeImagemVice(){
    return this.nomeImagemVice;
    }
    
    public String getPartido(){
    return this.nomePartido;
    }
}
