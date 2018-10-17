package Model;

/**
 *
 * @author vitau
 */
public class Candidato {

    int codigo;
    String nomeCandidato, nomeImagem, nomePartido;
    
    public Candidato(String nomeCandidato, String nomeImagem, String nomePartido, int codigo) throws Exception {
        this.nomeCandidato = nomeCandidato;
        this.nomeImagem = nomeImagem;
        this.nomePartido = nomePartido;
        this.codigo = codigo;
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
    
    public String getPartido(){
    return this.nomePartido;
    }
}
