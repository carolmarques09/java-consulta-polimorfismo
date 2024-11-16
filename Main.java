import java.time.LocalDate;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        Medico medico = new Medico("Eduardo Pachu");
        Paciente paciente = new Paciente("Carolina Herrera");

        System.out.print("Digite a data da consulta (formato AAAA-MM-DD): ");
        String data = scanner.next();

        LocalDate dataConsulta = LocalDate.parse(data);

        Consulta consulta = new Consulta("Rotina");
        consulta.realizarConsulta(medico, paciente, dataConsulta);

        System.out.println("Consulta realizada com sucesso!");
    }
}