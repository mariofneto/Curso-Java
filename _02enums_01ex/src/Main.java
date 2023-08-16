import entities.ContratoHoras;
import entities.Departamento;
import entities.Trabalhador;
import entitiesEnum.LevelTrabalhador;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Locale;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) throws ParseException {
        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);
        Departamento dp;
        Trabalhador worker;
        ContratoHoras contrato;
        SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy");
        SimpleDateFormat sdf2 = new SimpleDateFormat("MM/yyyy");

        System.out.print("Enter department's name: ");
        String nomeDepartamento = sc.nextLine();
        dp = new Departamento(nomeDepartamento);
        System.out.println("Enter worker data:");
        System.out.print("Name: ");
        String nome = sc.nextLine();
        System.out.print("Level: ");
        LevelTrabalhador level = LevelTrabalhador.valueOf(sc.nextLine());
        System.out.print("Base salary: ");
        Double salarioBase = sc.nextDouble();

        worker = new Trabalhador(nome, level, salarioBase);

        System.out.print("How many contracts to this worker? ");
        int quantContrato = sc.nextInt();

        for (int i = 0; i < quantContrato; i++) {
            sc.nextLine();
            System.out.println("Enter contract #" + (i + 1) + " data:");
            System.out.print("Date (DD/MM/YYYY): ");
            Date data = sdf.parse(sc.next());
            System.out.print("Value per hour: ");
            Double valorHora = sc.nextDouble();
            System.out.print("Duration (hours): ");
            Integer horas = sc.nextInt();

            contrato = new ContratoHoras(data, valorHora, horas);
            worker.addContrato(contrato);
        }

        System.out.print("Enter month and year to calculate income (MM/YYYY): ");
        String mesAno = sc.next();

        String mes = mesAno.substring(0, 2);
        String ano = mesAno.substring(3);
        Date dataMesAno = sdf2.parse(mesAno);

        //Double somaAumento = 0.00;
        //somaAumento += worker.contratos.get(i).valorTotal();

        Double valorFinal = null;
        for (int i = 0; i < quantContrato; i++) {
            if (worker.contratos.get(i).getData() == dataMesAno) {
                Double aumento = worker.contratos.get(i).valorTotal();
                valorFinal = worker.aumento(aumento);
            }
        }

        System.out.print("Name: " + worker.getNome() + "\n");
        System.out.print("Department: " + dp.getNome() + "\n");
        System.out.print("Income for " + mesAno + ": "/*worker.aumento()*/);

        sc.close();
    }
}