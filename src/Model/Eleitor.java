package Model;

import java.util.Date;

public class Eleitor {
    int userID;
    String nomeEleitor, endereco, cpf, sexo, naturalidade;
    Date dataNasc;
    
    public void setNomeEleitor(String nomeEleitor){
    this.nomeEleitor = nomeEleitor;
    }
    
    public void setEndereco(String endereco){
    this.endereco = endereco;
    }
    
    public void setCPF(String cpf){
    this.cpf = cpf; 
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
    
    public void setDataNasc(Date dataNasc){
    this.dataNasc = dataNasc;
    }
    
    public String getNomeEleitor(){
    return this.nomeEleitor;
    }
    
    public String getEndereco(){
    return this.endereco;
    }
    
    public String setCPF(){
    return this.cpf;
    }
    
    public String setSexo(){
    return this.sexo;
    }
    
    public String getNaturalidade(){
    return this.naturalidade;
    }
    
    public int getUserID(){
    return this.userID;
    }
    
    public Date getDataNasc(){
    return this.dataNasc;
    }
}
