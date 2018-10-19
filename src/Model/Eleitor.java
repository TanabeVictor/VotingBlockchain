package Model;

import java.io.Serializable;
import java.util.Date;

public class Eleitor implements Serializable{
    int userID;
    String nomeEleitor, nomePai, nomeMae, sexo, naturalidade, situacao, senha;
    Date dataNasc, dataEmissao;
    
    public Eleitor(String nomeEleitor, String nomePai, String nomeMae, String sexo, String naturalidade, int userID, String senha, Date dataNasc, Date dataEmissao, String situacao) throws Exception {
        this.nomeEleitor = nomeEleitor;
        this.nomePai = nomePai;
        this.nomeMae = nomeMae;
        this.sexo = sexo;
        this.naturalidade = naturalidade;
        this.userID = userID;
        this.senha = senha;
        this.dataNasc = dataNasc;
        this.dataEmissao = dataEmissao;
        this.situacao = situacao;
    }

    public void setNomeEleitor(String nomeEleitor){
    this.nomeEleitor = nomeEleitor;
    }
    
    public void setNomePai(String nomePai){
    this.nomePai = nomePai;
    }
    
    public void setNomeMae(String nomeMae){
    this.nomeMae = nomeMae;
    }
    
    public void setSituacao(String situacao){
    this.situacao = situacao;
    }
    
    public void setSexo(String sexo){
    this.sexo = sexo;
    }
    
    public void setNaturalidade(String naturalidade){
    this.naturalidade = naturalidade;
    }
    
    public void setUserID(int userID){
    this.userID = userID;
    }
    
    public void setSenha(String senha){
    this.senha = senha;
    }
    
    public void setDataNasc(Date dataNasc){
    this.dataNasc = dataNasc;
    }
    
    public void setDataEmissao(Date dataEmissao){
    this.dataEmissao = dataEmissao;
    }
    
    public String getNomeEleitor(){
    return this.nomeEleitor;
    }
    
    public String getNomePai(){
    return this.nomePai;
    }
    
    public String getNomeMae(){
    return this.nomeMae;
    }
    
    public String getSituacao(){
    return this.situacao;
    } 
    
    public String getSexo(){
    return this.sexo;
    }
    
    public String getNaturalidade(){
    return this.naturalidade;
    }
    
    public int getUserID(){
    return this.userID;
    }
    
    public String getSenha(){
    return this.senha;
    }
    
    public Date getDataNasc(){
    return this.dataNasc;
    }
    
    public Date getDataEmissao(){
    return this.dataEmissao;
    }
}
