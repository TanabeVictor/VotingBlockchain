/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Model;

/**
 *
 * @author vitau
 */
public class CandidatoPresidente {

    int codigo;
    String nomeCandidato, nomeImagem, nomeVice, nomeImagemVice, nomePartido;
    
    public CandidatoPresidente(String nomeCandidato, String nomeImagem, String nomePartido, String nomeVice, String nomeImagemVice, int codigo) throws Exception {
        this.nomeCandidato = nomeCandidato;
        this.nomeImagem = nomeImagem;
        this.nomePartido = nomePartido;
        this.codigo = codigo;
        this.nomeVice = nomeVice;
        this.nomeImagemVice = nomeImagemVice;
    }

    public CandidatoPresidente() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
    
    public void setCodigo(int codigo){
    this.codigo = codigo;
    }
    
    public void setNomeCandidato(String nomeCandidato){
    this.nomeCandidato = nomeCandidato;
    }
    
    public void setNomeImagem(String nomeImagem){
    this.nomeImagem = nomeImagem;
    }
   
    public void setNomeVice(String nomeVice){
    this.nomeVice = nomeVice;
    }
    
    public void setNomeImagemVice(String nomeImagemVice){
    this.nomeImagemVice = nomeImagemVice;
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
