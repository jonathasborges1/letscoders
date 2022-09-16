import java.util.Locale;
import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.format.TextStyle;

public class Main {
    public static void main(String[] args){

        String nome = "Jhon";

        LocalDate hoje = LocalDate.now();
        int agora = LocalDateTime.now().getHour();

        Locale brasil = new Locale("pt","BR");
        String diaSemana = hoje.getDayOfWeek().getDisplayName(TextStyle.FULL,brasil);
        String saudacao = "default";

        if(agora >= 0 && agora < 12){
            saudacao = "bom dia";
        }
        if(agora >= 12 && agora < 18){
            saudacao = "boa tarde";
        }
        if(agora >= 18 && agora < 24){
            saudacao = "boa noite";
        }
//        ISO 8601
//        LocalDate hoje = LocalDate.now();
//        System.out.println(hoje.getDayOfMonth());
//        System.out.println(hoje.getDayOfWeek());
//        System.out.println(hoje.getDayOfYear());

        System.out.printf("Olá, %s. Hoje é %s, %s.%n",nome,diaSemana,saudacao);

    }
}
