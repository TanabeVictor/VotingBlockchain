package Model;

import java.io.Serializable;
import java.util.Date;

public class Block implements Serializable {

    public String hash;
    public String previousHash;
    public Voto voto;
    public String dados;
    private long timeStamp;
    private int nonce;
    
    //Block Constructor.  
    public Block(Voto voto, String dados,  String previousHash) {
        this.voto =  voto;
        this.dados = dados;
        this.previousHash = previousHash;
        this.timeStamp = new Date().getTime();
        this.hash = calculateHash();
    }

    //Calculate new hash based on blocks contents
    public String calculateHash() {
        String calculatedhash = StringUtil.applySha256(previousHash + Long.toString(timeStamp) + Integer.toString(nonce) + voto);
        return calculatedhash;
    }
}
