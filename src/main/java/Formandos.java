
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
public class Formandos implements Serializable {

    private static final long serialVersionUID = 1L;
    private int id;
    private String nome;
    private int idade;
    private int altura;
    private boolean sexo;
    private String pais;

    public Formandos(int id, String nome, int idade, int altura, boolean sexo, String pais) {
        this.id = id;
        this.nome = nome;
        this.idade = idade;
        this.altura = altura;
        this.sexo = sexo;
        this.pais = pais;
    }

    Formandos() {
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public int getIdade() {
        return idade;
    }

    public void setIdade(int idade) {
        this.idade = idade;
    }

    public int getAltura() {
        return altura;
    }

    public void setAltura(int altura) {
        this.altura = altura;
    }

    public boolean isSexo() {
        return sexo;
    }

    public void setSexo(boolean sexo) {
        this.sexo = sexo;
    }

    public String getPais() {
        return pais;
    }

    public void setPais(String pais) {
        this.pais = pais;
    }

    @Override
    public String toString() {
        return "Formandos{" + "id=" + id + ", nome=" + nome + ", idade=" + idade + ", altura=" + altura + ", sexo=" + sexo + ", pais=" + pais + '}';
    }

}
