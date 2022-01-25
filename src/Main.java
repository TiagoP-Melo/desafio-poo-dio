import br.com.dio.desafio.dominio.Bootcamp;
import br.com.dio.desafio.dominio.Curso;
import br.com.dio.desafio.dominio.Dev;
import br.com.dio.desafio.dominio.Mentoria;

import java.time.LocalDate;

public class Main {
    public static void main(String[] args){

        Curso curso1 = new Curso();
        curso1.setTitulo("curso java");
        curso1.setDescricao("descrição curso java");
        curso1.setCargaHoraria(72);

        Curso curso2 = new Curso();
        curso2.setTitulo("curso js");
        curso2.setDescricao("descrição curso js");
        curso2.setCargaHoraria(65);

        Mentoria mentoria = new Mentoria();
        mentoria.setTitulo("mentoria de java");
        mentoria.setTitulo("descrição mentoria de java");
        mentoria.setData(LocalDate.now());


       /* System.out.println(curso1);
        System.out.println(curso2);
        System.out.println(mentoria);*/

        Bootcamp bootcamp = new Bootcamp();
        bootcamp.setNome("Bootcamp Java Develope");
        bootcamp.setDescricao("Decrição Bootcamp Java Developer");
        bootcamp.getConteudos().add(curso1);
        bootcamp.getConteudos().add(curso2);
        bootcamp.getConteudos().add(mentoria);

        System.out.println("--------------------------------");

        Dev devTiago = new Dev();
        devTiago.setName("Tiago Portella");
        devTiago.inscreverBootcamp(bootcamp);
        System.out.println("Conteudo Inscritos Tiago Portella" + devTiago.getConeudosInscritos());
        devTiago.progredir();
        devTiago.progredir();
        System.out.println("-");
        System.out.println("Conteudo Inscritos Tiago Portella" + devTiago.getConeudosInscritos());
        System.out.println("Conteudo Concluidos Tiago Portella" + devTiago.getConeudosConcluidos());
        System.out.println("XP:" + devTiago.calcularTotalXp());

        System.out.println("--------------------------------");


        Dev devJoao = new Dev();
        devJoao.setName("João da Silva");
        devJoao.inscreverBootcamp(bootcamp);
        System.out.println("Conteudo Inscritos João da Silva" + devJoao.getConeudosInscritos());
        devJoao.progredir();
        devJoao.progredir();
        devJoao.progredir();
        System.out.println("-");
        System.out.println("Conteudo Inscritos João da Silva" + devJoao.getConeudosInscritos());
        System.out.println("Conteudo Concluidos João da Silva" + devJoao.getConeudosConcluidos());
        System.out.println("XP:" + devJoao.calcularTotalXp());



    }
}
