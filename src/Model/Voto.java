package Model;

import java.io.Serializable;
import java.util.Date;

public class Voto implements Serializable {

    String localizacao, idAparelho;
    int nroVoto, idCandidato, codLocal, codEleicao, nroEleitor;
    Date dataHora;

    public Voto(int nroVoto, int idCandidato, int nroEleitor, int codLocal, int codEleicao, Date dataHora, String localizacao, String idAparelho) {
        this.nroVoto = nroVoto;
        this.idCandidato = idCandidato;
        this.nroEleitor = nroEleitor;
        this.codLocal = codLocal;
        this.codEleicao = codEleicao;
        this.dataHora = dataHora;
        this.localizacao = localizacao;
        this.idAparelho = idAparelho;
    }

    public void setLocalizacao(String localizacao) {
        this.localizacao = localizacao;
    }

    public void setIdAparelho(String idAparelho) {
        this.idAparelho = idAparelho;
    }

    public void setNroVoto(int nroVoto) {
        this.nroVoto = nroVoto;
    }

    public void setNroEleitor(int nroEleitor) {
        this.nroEleitor = nroEleitor;
    }

    public void setIdCandidato(int idCandidato) {
        this.idCandidato = idCandidato;
    }

    public void setCodLocal(int codLocal) {
        this.codLocal = codLocal;
    }

    public void setCodEleicao(int codEleicao) {
        this.codEleicao = codEleicao;
    }

    public void setDataHora(Date dataHora) {
        this.dataHora = dataHora;
    }

    public String getLocalizacao() {
        return this.localizacao;
    }

    public String getIdAparelho() {
        return this.idAparelho;
    }

    public int getNroVoto() {
        return this.nroVoto;
    }

    public int getNroEleitor() {
        return this.nroEleitor;
    }

    public int getIdCandidato() {
        return this.idCandidato;
    }

    public int getCodLocal() {
        return this.codLocal;
    }

    public int getCodEleicao() {
        return this.codEleicao;
    }

    public Date getDataHora() {
        return this.dataHora;
    }

}
