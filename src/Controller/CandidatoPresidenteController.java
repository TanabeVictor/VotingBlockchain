package Controller;

import java.util.Vector;
import Model.CandidatoPresidente;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;

public class CandidatoPresidenteController {
    
    private Vector listaCandidatos = new Vector();
    private final String arquivo = "candidatosPresidente.dat";
    
    public void addCandidato(CandidatoPresidente candidato) throws Exception {
        listaCandidatos.add(candidato);
        gravaLista();}

    public CandidatoPresidente retornaCandidato(int valorCodigo) {
        CandidatoPresidente aux = new CandidatoPresidente();
        for (int i = 0; i < listaCandidatos.size(); i++) {
            aux = (CandidatoPresidente) listaCandidatos.elementAt(i);
            if (aux.getCodigo() == valorCodigo) {
               return aux;
            }
        }
        return null;
    }

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


