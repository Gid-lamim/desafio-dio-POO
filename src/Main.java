import br.com.dio.desafio.dominio.*;

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

        Mentoria mentoria = new Mentoria();

        mentoria.setTitulo("mentoria de Java");
        mentoria.setDescricao("mentoria de java: descrição aqui.");
        mentoria.setData(LocalDate.now());

        /*System.out.println(curso1);
        System.out.println(curso2);
        System.out.println(mentoria1);*/

        Bootcamp bootcamp = new Bootcamp();
        bootcamp.setNome("Bootcamp Java developer");
        bootcamp.setDescricao("Descrição aqui..");
        bootcamp.getConteudos().add(curso1);
        bootcamp.getConteudos().add(curso2);
        bootcamp.getConteudos().add(mentoria);


        System.out.println("Camila ________________________________________________________________________");
        Dev devCamila = new Dev();
        devCamila.setNome("Camila");
        devCamila.inscreverBootcamp(bootcamp);
        System.out.println("antes de progredir ------------");
        System.out.println("Conteudos incristos Camila: " + devCamila.getConteudoInscritos());
        System.out.println("Conteudos concluidos Camila: " + devCamila.getConteudoConluidos());
        System.out.println("XP de Camila: " + devCamila.calcularXP());
        devCamila.progredir();
        System.out.println("após progredir ------------");
        System.out.println("Conteudos incristos Camila: " + devCamila.getConteudoInscritos());
        System.out.println("Conteudos concluidos Camila: " + devCamila.getConteudoConluidos());
        System.out.println("XP de Camila: " + devCamila.calcularXP());


        System.out.println("Joao ________________________________________________________________________");
        Dev devJoao = new Dev();
        devJoao.setNome("Joao");
        devJoao.inscreverBootcamp(bootcamp);
        System.out.println("antes de progredir ------------");
        System.out.println("Conteudos incristos Joao: " + devJoao.getConteudoInscritos());
        System.out.println("Conteudos concluidos Joao: " + devJoao.getConteudoConluidos());
        System.out.println("XP de Joao: " + devJoao.calcularXP());
        devJoao.progredir();
        devJoao.progredir();
        System.out.println("após progredir ------------");
        System.out.println("Conteudos incristos Joao: " + devJoao.getConteudoInscritos());
        System.out.println("Conteudos concluidos Joao: " + devJoao.getConteudoConluidos());
        System.out.println("XP de Joao: " + devJoao.calcularXP());



    }

}
