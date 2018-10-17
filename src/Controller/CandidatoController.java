package Controller;

import java.util.HashMap;
import java.util.Map;
import java.util.Vector;
import Model.Candidato;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;

public class CandidatoController {
    
    private Vector listaCandidatos = new Vector();
    private final String arquivo = "candidatos.dat";
    Map<String, Object> meta = new HashMap<>();
    
    public void addSensor(Candidato candidato) throws Exception {
        listaCandidatos.add(candidato);
        gravaLista();}

    public Candidato retornaCandidato(int valorCodigo) {
        Candidato aux = new Candidato();
        for (int i = 0; i < listaCandidatos.size(); i++) {
            aux = (Candidato) listaCandidatos.elementAt(i);
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


