package Controller;

import java.util.Vector;
import Model.Eleitor;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;

public class EleitorController {
    
    private Vector listaEleitores = new Vector();
    private final String arquivo = "eleitores.dat";
    
    public void addEleitor(Eleitor eleitor) throws Exception {
        listaEleitores.add(eleitor);
        gravaLista();}

    public Eleitor retornaEleitor(String matricula, int senha) {
        Eleitor aux = new Eleitor();
        for (int i = 0; i < listaEleitores.size(); i++) {
            aux = (Eleitor) listaEleitores.elementAt(i);
            if ((aux.getCPF() == matricula) && (aux.getSenha() == senha)) {
               return aux;
            }
        }
        return null;
    }

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


