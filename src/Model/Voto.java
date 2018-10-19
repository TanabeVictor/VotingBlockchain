
package Model;

import java.util.Date;

public class Voto {
    String  localizacao, idAparelho;
    int  nroVoto, idCandidato, codLocal, codEleicao, nroEleitor;
    Date data, hora;
    
    public Voto(int nroVoto, int idCandidato, int nroEleitor, int codLocal, int codEleicao, Date data, Date hora, String localizacao, String idAparelho){
    this.nroVoto = nroVoto;
    this.idCandidato = idCandidato;
    this.nroEleitor = nroEleitor;
    this.codLocal = codLocal;
    this.codEleicao = codEleicao;
    this.data = data;
    this.hora = hora;
    this.localizacao = localizacao;
    this.idAparelho = idAparelho;
    }
    
    public void setLocalizacao(String localizacao){
    this.localizacao = localizacao;
    }
     
    public void setIdAparelho(String idAparelho){
    this.idAparelho = idAparelho;
    }
    
    public void setNroVoto(int nroVoto){
    this.nroVoto = nroVoto;
    }
    
    public void setNroEleitor(int nroEleitor){
    this.nroEleitor = nroEleitor;
    }
    
    public void setIdCandidato(int idCandidato){
    this.idCandidato = idCandidato;
    }
    
    public void setCodLocal(int codLocal){
    this.codLocal = codLocal;
    }
    
    public void setCodEleicao(int codEleicao){
    this.codEleicao = codEleicao;
    }
    
    public void setData(Date data){
    this.data = data;
    }
    
    public void setHora(Date hora){
    this.hora = hora;
    }
    
    public String getLocalizacao(){
    return this.localizacao;
    }
    
    public String getIdAparelho(){
    return this.idAparelho;
    }
    
    public int getNroVoto(){
    return this.nroVoto;
    }
    
    public int getNroEleitor(){
    return this.nroEleitor;
    }
    
    public int getIdCandidato(){
    return this.idCandidato;
    }
    
    public int getCodLocal(){
    return this.codLocal;
    }
    
    public int getCodEleicao(){
    return this.codEleicao;
    }
    
    public Date getData(){
    return this.data;
    }
    
    public Date getHora(){
    return this.hora;
    }
}
