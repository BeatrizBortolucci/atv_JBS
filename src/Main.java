import java.sql.SQLException;
import java.text.DateFormat;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.Scanner;

public class Main {
    static Scanner input = new Scanner(System.in);

    public static void main(String[] args) throws ParseException {
        String nome, cpf, periodo, dataNasc, dataAgend;
        int telefone;
        SimpleDateFormat sdf =  new SimpleDateFormat("dd/MM/yyyy");
        Date nascimento, agendamento;

        Colaboradores col1 = new Colaboradores("Pedro", "12345234", "tarde", 2345, new Date(21,04,2023), new Date(31,06,2023));
        Colaboradores col2 = new Colaboradores("Beatriz", "12345", "noite", 2345, new Date(25,03,2023), new Date(25,03,2023));
        Colaboradores col3 = new Colaboradores("Matheus", "12345", "manhã", 1223, new Date(31,06,2023), new Date(31,06,2023));

        ArrayList<String> colaboradores = new ArrayList<>();
        colaboradores.add(String.valueOf(col1));
        colaboradores.add(String.valueOf(col2));
        colaboradores.add(String.valueOf(col3));

try{
        for (int x = 10; x <= 10; x++) {
            System.out.print("Digite seu nome: ");
            nome = input.nextLine();

            System.out.println("Digite seu CPF: ");
            cpf = input.nextLine();

            System.out.println("Digite seu telefone: ");
            telefone = input.nextInt();
            input.nextLine();

            System.out.println("Digite seu data de nascimento: (dd/MM/yyyy) ");
            dataNasc = input.nextLine();
            nascimento = sdf.parse(dataNasc);

            System.out.println("Digite a data de agendamento: (dd/MM/yyyy) ");
            dataAgend = input.nextLine();
            agendamento = sdf.parse(dataAgend);

            System.out.println("Digite o período entre: manhã, tarde e noite: ");
            periodo = input.nextLine();

            System.out.println("Dados Cadastrados: \nNome: " + nome + "\nCPF:" + cpf + "\nTelefone: " + telefone + "\nData Nascimento: " + dataNasc + "\nData de Agendamento: " + dataAgend + "\nPeríodo: " + periodo);

        }}catch (ParseException dt){
        dt.printStackTrace();
        System.out.println("Digite as datas com o formato solicitado!");
}

        System.out.println(colaboradores);

    }
}
