
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
public class FormandosCursos implements Serializable {

    private static final long serialVersionUID = 1L;
    private int inscricao;
    private int idCurso_;
    private String curso_;
    private int idformando_;
    private String nome_;
    private int idade_;
    private int altura_;
    private boolean sexo_;
    private String pais_;

    public FormandosCursos(int inscricao, int idCurso_, String curso_, int idformando_, String nome_, int idade_, int altura_, boolean sexo_, String pais_) {
        this.inscricao = inscricao;
        this.idCurso_ = idCurso_;
        this.curso_ = curso_;
        this.idformando_ = idformando_;
        this.nome_ = nome_;
        this.idade_ = idade_;
        this.altura_ = altura_;
        this.sexo_ = sexo_;
        this.pais_ = pais_;
    }



    FormandosCursos() {
    }

    public int getInscricao() {
        return inscricao;
    }

    public void setInscricao(int inscricao) {
        this.inscricao = inscricao;
    }

    public int getIdCurso_() {
        return idCurso_;
    }

    public void setIdCurso_(int idCurso_) {
        this.idCurso_ = idCurso_;
    }

    public String getCurso_() {
        return curso_;
    }

    public void setCurso_(String curso_) {
        this.curso_ = curso_;
    }

    public int getIdformando_() {
        return idformando_;
    }

    public void setIdformando_(int idformando_) {
        this.idformando_ = idformando_;
    }

    public String getNome_() {
        return nome_;
    }

    public void setNome_(String nome_) {
        this.nome_ = nome_;
    }

    public int getIdade_() {
        return idade_;
    }

    public void setIdade_(int idade_) {
        this.idade_ = idade_;
    }

    public int getAltura_() {
        return altura_;
    }

    public void setAltura_(int altura_) {
        this.altura_ = altura_;
    }

    public boolean isSexo_() {
        return sexo_;
    }

    public void setSexo_(boolean sexo_) {
        this.sexo_ = sexo_;
    }

    public String getPais_() {
        return pais_;
    }

    public void setPais_(String pais_) {
        this.pais_ = pais_;
    }

    @Override
    public String toString() {
        return "FormandosCursos{" + "inscricao=" + inscricao + ", idCurso_=" + idCurso_ + ", curso_=" + curso_ + ", idformando_=" + idformando_ + ", nome_=" + nome_ + ", idade_=" + idade_ + ", altura_=" + altura_ + ", sexo_=" + sexo_ + ", pais_=" + pais_ + '}';
    }
    


    

}
