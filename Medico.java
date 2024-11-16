public class Medico extends Pessoa {
    private String nomeMedico;
    private String especialidade;

    public Medico(String nome) {
        super(nome);
    }

    @Override
    public void atender() {
        System.out.println("Atendendo paciente...");
    }
}
