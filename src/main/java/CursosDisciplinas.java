
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
public class CursosDisciplinas implements Serializable {

    private static final long serialVersionUID = 1L;
    private int idreg;
    private int idCurso__;
    private String curso__;
    private int idD_;
    private String nomeD_;

    public CursosDisciplinas(int idreg, int idCurso__, String curso__, int idD_, String nomeD_) {
        this.idreg = idreg;
        this.idCurso__ = idCurso__;
        this.curso__ = curso__;
        this.idD_ = idD_;
        this.nomeD_ = nomeD_;
    }

   

    CursosDisciplinas() {
    }

    public int getIdreg() {
        return idreg;
    }

    public void setIdreg(int idreg) {
        this.idreg = idreg;
    }

    public int getIdCurso__() {
        return idCurso__;
    }

    public void setIdCurso__(int idCurso__) {
        this.idCurso__ = idCurso__;
    }

    public String getCurso__() {
        return curso__;
    }

    public void setCurso__(String curso__) {
        this.curso__ = curso__;
    }

    public int getIdD_() {
        return idD_;
    }

    public void setIdD_(int idD_) {
        this.idD_ = idD_;
    }

    public String getNomeD_() {
        return nomeD_;
    }

    public void setNomeD_(String nomeD_) {
        this.nomeD_ = nomeD_;
    }

    @Override
    public String toString() {
        return "CursosDisciplinas{" + "idreg=" + idreg + ", idCurso__=" + idCurso__ + ", curso__=" + curso__ + ", idD_=" + idD_ + ", nomeD_=" + nomeD_ + '}';
    }

    
  
}
