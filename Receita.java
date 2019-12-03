/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package projeto25p2.agendamedicavictoradrianodeaquinocracco;

import java.util.ArrayList;

/**
 *
 * @author aluno
 */
public class Receita {
    protected int idExame;
    protected String descricao;
    protected double valor;
    
    
 ArrayList<Agenda> Prontuario = new ArrayList();
   
    public Receita () {
        
    }

    public Receita(int idExame, String descricao, double valor) {
        this.idExame = idExame;
        this.descricao = descricao;
        this.valor = valor;
    }

    public int getIdExame() {
        return idExame;
    }

    public void setIdExame(int idExame) {
        this.idExame = idExame;
    }

    public String getDescricao() {
        return descricao;
    }

    public void setDescricao(String descricao) {
        this.descricao = descricao;
    }

    public double getValor() {
        return valor;
    }

    public void setValor(double valor) {
        this.valor = valor;
    }
  
}
