
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
public class Cursos implements Serializable {

    private static final long serialVersionUID = 1L;
    private int idc;
    private String nomeC;
    private int horasC;
    private String areaC;
    private String diretorC;

    public Cursos(int idc, String nomeC, int horasC, String areaC, String diretorC) {
        this.idc = idc;
        this.nomeC = nomeC;
        this.horasC = horasC;
        this.areaC = areaC;
        this.diretorC = diretorC;
    }

    Cursos() {
    }

    public int getIdc() {
        return idc;
    }

    public void setIdc(int idc) {
        this.idc = idc;
    }

    public String getNomeC() {
        return nomeC;
    }

    public void setNomeC(String nomeC) {
        this.nomeC = nomeC;
    }

    public int getHorasC() {
        return horasC;
    }

    public void setHorasC(int horasC) {
        this.horasC = horasC;
    }

    public String getAreaC() {
        return areaC;
    }

    public void setAreaC(String areaC) {
        this.areaC = areaC;
    }

    public String getDiretorC() {
        return diretorC;
    }

    public void setDiretorC(String diretorC) {
        this.diretorC = diretorC;
    }

    @Override
    public String toString() {
        return "Cursos{" + "idc=" + idc + ", nomeC=" + nomeC + ", horasC=" + horasC + ", areaC=" + areaC + ", diretorC=" + diretorC + '}';
    }
    
    
    

}
