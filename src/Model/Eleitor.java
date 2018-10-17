package Model;

import java.util.Date;

public class Eleitor {
    int userID, senha;
    String nomeEleitor, endereco, cpf, sexo, naturalidade;
    Date dataNasc;
    
    public Eleitor(String nomeEleitor, String endereco, String cpf, String sexo, String naturalidade, int userID, int senha, Date dataNasc) throws Exception {
        this.nomeEleitor = nomeEleitor;
        this.endereco = endereco;
        this.cpf = cpf;
        this.sexo = sexo;
        this.naturalidade = naturalidade;
        this.userID = userID;
        this.senha = senha;
        this.dataNasc = dataNasc;
    }

    public Eleitor() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
    
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
    
    public void setSenha(int senha){
    this.senha = senha;
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
    
    public String getCPF(){
    return this.cpf;
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
    
    public int getSenha(){
    return this.senha;
    }
    
    public Date getDataNasc(){
    return this.dataNasc;
    }
}
