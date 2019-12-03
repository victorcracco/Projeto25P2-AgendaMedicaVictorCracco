/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package projeto25p2.agendamedicavictoradrianodeaquinocracco;

/**
 *
 * @author aluno
 */
public class Medico {
    protected int crm;
    protected String nome;
    protected String especialidade;
    protected String cidade;        
    protected String estado;
    protected String celular;
    protected String contato;
   
public Medico (){

}

    public Medico(int crm, String nome, String especialidade, String cidade, String estado, String celular, String contato) {
        this.crm = crm;
        this.nome = nome;
        this.especialidade = especialidade;
        this.cidade = cidade;
        this.estado = estado;
        this.celular = celular;
        this.contato = contato;
    }

    public int getCrm() {
        return crm;
    }

    public void setCrm(int crm) {
        this.crm = crm;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getEspecialidade() {
        return especialidade;
    }

    public void setEspecialidade(String especialidade) {
        this.especialidade = especialidade;
    }

    public String getCidade() {
        return cidade;
    }

    public void setCidade(String cidade) {
        this.cidade = cidade;
    }

    public String getEstado() {
        return estado;
    }

    public void setEstado(String estado) {
        this.estado = estado;
    }

    public String getCelular() {
        return celular;
    }

    public void setCelular(String celular) {
        this.celular = celular;
    }

    public String getContato() {
        return contato;
    }

    public void setContato(String contato) {
        this.contato = contato;
    }
}