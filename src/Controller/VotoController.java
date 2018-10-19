package Controller;

import Model.Voto;
import java.util.Vector;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;

public class VotoController {

    private Vector listaVotos = new Vector();
    private final String arquivo = "votos.txt";

    public void addVoto(Voto voto) throws Exception {
        listaVotos.add(voto);
        gravaLista();
    }

    public Voto retornaVoto(int matricula) {
        Voto objVoto = null;
        for (int intIdx = 0; intIdx < listaVotos.size(); intIdx++) {
            objVoto = (Voto) listaVotos.elementAt(intIdx);
            if ((objVoto.getNroEleitor() == matricula)) {
                return objVoto;
            }
        }
        return null;
    }

    public void gravaLista() throws Exception {
        FileOutputStream objFileOS = new FileOutputStream(arquivo);
        ObjectOutputStream objOS = new ObjectOutputStream(objFileOS);
        objOS.writeObject(listaVotos);
        objOS.flush();
        objOS.close();
    }

    public void recuperaLista() throws Exception {
        File objFile = new File(arquivo);
        if (objFile.exists()) {
            FileInputStream objFileIS = new FileInputStream(arquivo);
            ObjectInputStream objIS = new ObjectInputStream(objFileIS);
            listaVotos = (Vector) objIS.readObject();
            objIS.close();
        }
    }
}
