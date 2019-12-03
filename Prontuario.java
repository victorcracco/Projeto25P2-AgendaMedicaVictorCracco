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
public class Prontuario {
    protected String sintomas;
    protected String medicamentos;
    protected String hipoteseDiagnosticada;
    protected String conduta;
    
 ArrayList<Prontuario> Receita = new ArrayList();

    public Prontuario() {
        
    }
    public Prontuario(String sintomas, String medicamentos, String hipoteseDiagnosticada, String conduta) {
        this.sintomas = sintomas;
        this.medicamentos = medicamentos;
        this.hipoteseDiagnosticada = hipoteseDiagnosticada;
        this.conduta = conduta;
    }

    public String getSintomas() {
        return sintomas;
    }

    public void setSintomas(String sintomas) {
        this.sintomas = sintomas;
    }

    public String getMedicamentos() {
        return medicamentos;
    }

    public void setMedicamentos(String medicamentos) {
        this.medicamentos = medicamentos;
    }

    public String getHipoteseDiagnosticada() {
        return hipoteseDiagnosticada;
    }

    public void setHipoteseDiagnosticada(String hipoteseDiagnosticada) {
        this.hipoteseDiagnosticada = hipoteseDiagnosticada;
    }

    public String getConduta() {
        return conduta;
    }

    public void setConduta(String conduta) {
        this.conduta = conduta;
    }
        
    
}
