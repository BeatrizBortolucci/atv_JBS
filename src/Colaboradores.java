import java.util.Date;

public class Colaboradores{
    String nome;
    String cpf, periodo;
    int telefone;
    Date dataNasc = new Date();
    Date dataAgend = new Date();


    public Colaboradores(String nome, String cpf, String periodo, int telefone, Date dataNasc, Date dataAgend) {
        this.nome = nome;
        this.cpf = cpf;
        this.periodo = periodo;
        this.telefone = telefone;
        this.dataNasc = dataNasc;
        this.dataAgend = dataAgend;
    }

    @Override
    public String toString() {
        return "Colaboradores{" +
                "nome='" + nome + '\'' +
                ", cpf='" + cpf + '\'' +
                ", periodo='" + periodo + '\'' +
                ", telefone=" + telefone +
                ", dataNasc=" + dataNasc +
                ", dataAgend=" + dataAgend +
                '}';
    }
}
