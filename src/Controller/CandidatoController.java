package Controller;


import Model.Candidato;
import java.util.Vector;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;

public class CandidatoController {
    
    private Vector listaCandidatos = new Vector();
    private final String arquivo = "candidatos.txt";
    
    public void addCandidato(Candidato candidato) throws Exception {
        listaCandidatos.add(candidato);
        gravaLista();}
    
    
    public Candidato retornaCandidato(int valorCodigo) {
        Candidato objCandidato = null;
        for (int intIdx = 0; intIdx < listaCandidatos.size(); intIdx++) {
        objCandidato = (Candidato)listaCandidatos.elementAt(intIdx);
        if (objCandidato.getCodigo()== valorCodigo)
        return objCandidato;}
        return null;}
    
    public void gravaLista() throws Exception {
        FileOutputStream objFileOS = new FileOutputStream(arquivo);
        ObjectOutputStream objOS = new ObjectOutputStream(objFileOS);
        objOS.writeObject(listaCandidatos);
        objOS.flush();
        objOS.close();}

    
    public void recuperaLista() throws Exception {
        File objFile = new File(arquivo);
        if (objFile.exists()) {
            FileInputStream objFileIS = new FileInputStream(arquivo);
            ObjectInputStream objIS = new ObjectInputStream(objFileIS);
            listaCandidatos = (Vector) objIS.readObject();
            objIS.close();
        }
    }
}


