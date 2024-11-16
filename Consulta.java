import java.time.LocalDate;

public class Consulta extends Pessoa {
    public Consulta(String nome) {
        super(nome);
    }

    public void realizarConsulta (Medico medico, Paciente paciente, LocalDate dataConsulta) {
        System.out.println("Consulta marcada para o dia: " + dataConsulta + ".");
        medico.atender();
        System.out.println("Paciente: " + paciente.getNome());
    }
}
