import java.util.ArrayList;
import java.util.Date;

public class Teste {
    public static void main(String[] args) {
        Colaboradores col1 = new Colaboradores("Pedro","12345234", "tarde", 2345, new Date(21,04,2023), new Date(31,06,2023));
        Colaboradores col2 = new Colaboradores("Beatriz", "12345", "noite", 2345, new Date(25,03,2023), new Date(25,03,2023));
        Colaboradores col3 = new Colaboradores("Matheus", "12345", "manhã", 1223, new Date(31,06,2023), new Date(31,06,2023));

        ArrayList<String> colaboradores = new ArrayList<>();
        colaboradores.add(String.valueOf(col1));
        colaboradores.add(String.valueOf(col2));
        colaboradores.add(String.valueOf(col3));

        System.out.println(colaboradores);

    }
}
