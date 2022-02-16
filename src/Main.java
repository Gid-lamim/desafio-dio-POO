import br.com.dio.desafio.dominio.Curso;
import br.com.dio.desafio.dominio.Mentoria;

import java.time.LocalDate;

public class Main {
    public static void main(String[] args) {
        Curso curso1 = new Curso();
        curso1.setTitulo("curso java");
        curso1.setDescricao("curso de desenvolvimento em java");
        curso1.setCargHoraria(8);


        Curso curso2 = new Curso();
        curso2.setTitulo("curso React");
        curso2.setDescricao("curso de desenvolvimento em React");
        curso2.setCargHoraria(8);

        Mentoria mentoria1 = new Mentoria();

        mentoria1.setTitulo("mentoria de Java");
        mentoria1.setDescricao("mentoria de java: descrição aqui.");
        mentoria1.setData(LocalDate.now());

        System.out.println(curso1);
        System.out.println(curso2);
        System.out.println(mentoria1);
    }
}
