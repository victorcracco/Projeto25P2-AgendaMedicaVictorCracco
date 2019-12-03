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
public class Projeto25P2AgendaMedicaVictorAdrianoDeAquinoCracco {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        
        
        
        //PACIENTE
        
        Paciente objPaciente = new Paciente();
        objPaciente.setNome("Victor");
        objPaciente.setCpf(" 35436154665");
        objPaciente.setSexo("Masculino");
        objPaciente.setEndereco("Rua Descricao");
        objPaciente.setDtNascimento("17-01-00");
        objPaciente.setCidade("Lins");
        objPaciente.setEstado("SP");
        objPaciente.setCelular("15555-5888");
        
        
        //RECEITA
        Receita objReceita = new Receita();
        objReceita.setIdExame(1);
        objReceita.setDescricao("Descricao da receita");
        objReceita.setValor(3);
        
        
        //MEDICO
       Medico objMedico = new Medico();
       objMedico.setNome("Antonio");
       objMedico.setCelular("55555-5554");
       objMedico.setCrm(555555);
       objMedico.setEspecialidade("Pediatra");
       objMedico.setEstado("SP");
       objMedico.setCidade("Lins");
       objMedico.setContato("44444-77777");
       
       //PRONTUARIO
       Prontuario objProntuario = new Prontuario();
       objProntuario.setConduta("Conduta");
       objProntuario.setHipoteseDiagnosticada("Hipotese Diagnosticada");
       objProntuario.setMedicamentos("Medicamentos");
       objProntuario.setSintomas("Dor de cabeça");
       
       
        //AGENDA
        
        Agenda objAgenda = new Agenda();
        objAgenda.setHorario(1200);
        objAgenda.setIdAgenda(2);
        objAgenda.setSituacao("Pendente");
        
        
        //PRINTS
        
        System.out.println("Paciente: " + objPaciente.getNome());
        System.out.println("Sexo: " + objPaciente.getSexo());
        System.out.println("CPF: " + objPaciente.getCpf());
        System.out.println("/////////////////////////////////////////////////");
        System.out.println("Horario da Consulta: " +objAgenda.getHorario());
        System.out.println("Situação: " + objAgenda.getSituacao());
        System.out.println("/////////////////////////////////////////////////");        
        System.out.println("Medico atendente: " + objMedico.getNome());
        System.out.println("Especialidade: " + objMedico.getEspecialidade());
        System.out.println("CRM: " + objMedico.getCrm());
        System.out.println("/////////////////////////////////////////////////");
        System.out.println("Sintomas: "+ objProntuario.getSintomas());
        System.out.println("Medicamentos: " +objProntuario.getMedicamentos());
        System.out.println("/////////////////////////////////////////////////");
        System.out.println("Receita " + objReceita.getDescricao());
        System.out.println("Valor: " + objReceita.getValor());
        System.out.println("/////////////////////////////////////////////////");

        
        
        
    }
    
}
