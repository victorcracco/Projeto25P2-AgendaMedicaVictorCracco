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
public class Agenda {
    protected int idAgenda;
    protected String DataAgendamento;
    protected int horario;
    protected String situacao;
    
    
    public Agenda(){
        
    }

    public int getIdAgenda() {
        return idAgenda;
    }

    public void setIdAgenda(int idAgenda) {
        this.idAgenda = idAgenda;
    }

    public String getDataAgendamento() {
        return DataAgendamento;
    }

    public void setDataAgendamento(String DataAgendamento) {
        this.DataAgendamento = DataAgendamento;
    }

    public int getHorario() {
        return horario;
    }

    public void setHorario(int horario) {
        this.horario = horario;
    }

    public String getSituacao() {
        return situacao;
    }

    public void setSituacao(String situacao) {
        this.situacao = situacao;
    }

    public Agenda(int idAgenda, String DataAgendamento, int horario, String situacao) {
        this.idAgenda = idAgenda;
        this.DataAgendamento = DataAgendamento;
        this.horario = horario;
        this.situacao = situacao;
    }
}