
import java.io.Serializable;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author SkyDuDe
 */
public class Disciplinas implements Serializable{
    private static final long serialVersionUID = 1L;
    private int idD;
    private String nomeD;
    private int horasD;
    private String docente;

    public Disciplinas(int idD, String nomeD, int horasD, String docente) {
        this.idD = idD;
        this.nomeD = nomeD;
        this.horasD = horasD;
        this.docente = docente;
    }
    
    Disciplinas(){
            }

    public int getIdD() {
        return idD;
    }

    public void setIdD(int idD) {
        this.idD = idD;
    }

    public String getNomeD() {
        return nomeD;
    }

    public void setNomeD(String nomeD) {
        this.nomeD = nomeD;
    }

    public int getHorasD() {
        return horasD;
    }

    public void setHorasD(int horasD) {
        this.horasD = horasD;
    }

    public String getDocente() {
        return docente;
    }

    public void setDocente(String docente) {
        this.docente = docente;
    }

    @Override
    public String toString() {
        return "Disciplinas{" + "idD=" + idD + ", nomeD=" + nomeD + ", horasD=" + horasD + ", docente=" + docente + '}';
    }
    
}
