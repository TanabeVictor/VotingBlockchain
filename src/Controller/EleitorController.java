package Controller;

import Model.Eleitor;
import java.util.Vector;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;

public class EleitorController {
    
    private Vector listaEleitores = new Vector();
    private final String arquivo = "eleitores.txt";
    
    public void addEleitor(Eleitor eleitor) throws Exception {
        listaEleitores.add(eleitor);
        gravaLista();}
    
    
    public Eleitor retornaCandidato(String matricula, int senha) {
        Eleitor objEleitor = null;
        for (int intIdx = 0; intIdx < listaEleitores.size(); intIdx++) {
        objEleitor = (Eleitor)listaEleitores.elementAt(intIdx);
        if ((objEleitor.getCPF() == matricula) && (objEleitor.getSenha() == senha))
        return objEleitor;}
        return null;}
    
    public void gravaLista() throws Exception {
        FileOutputStream objFileOS = new FileOutputStream(arquivo);
        ObjectOutputStream objOS = new ObjectOutputStream(objFileOS);
        objOS.writeObject(listaEleitores);
        objOS.flush();
        objOS.close();}

    
    public void recuperaLista() throws Exception {
        File objFile = new File(arquivo);
        if (objFile.exists()) {
            FileInputStream objFileIS = new FileInputStream(arquivo);
            ObjectInputStream objIS = new ObjectInputStream(objFileIS);
            listaEleitores = (Vector) objIS.readObject();
            objIS.close();
        }
    }
}


