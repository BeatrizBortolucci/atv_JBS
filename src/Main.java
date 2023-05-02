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


    }
}
