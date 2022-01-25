package br.com.dio.desafio.dominio;

import java.util.LinkedHashSet;
import java.util.Objects;
import java.util.Optional;
import java.util.Set;

public class Dev {

    private String name;
    private Set<Conteudo> conteudosInscritos = new LinkedHashSet<>();
    private Set<Conteudo> conteudosConcluidos = new LinkedHashSet<>();

    public void inscreverBootcamp(Bootcamp bootcamp){

        this.conteudosInscritos.addAll(bootcamp.getConteudos());
          bootcamp.getDevsInscritos().add(this);

    }

    public void progredir(){

        Optional<Conteudo> conteudo = this.conteudosInscritos.stream().findFirst();
        if(conteudo.isPresent()) {
            this.conteudosConcluidos.add(conteudo.get());
            this.conteudosInscritos.remove(conteudo.get());
        }else{
            System.err.println("Você não está matriculado em nenhum conteudo!");
        }


    }

    public double calcularTotalXp(){
        return this.conteudosConcluidos
                .stream()
                .mapToDouble(Conteudo::calcularXP)
                .sum();



    }




    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Set<Conteudo> getConeudosInscritos() {
        return conteudosInscritos;
    }

    public void setConeudosInscritos(Set<Conteudo> coneudosInscritos) {
        this.conteudosInscritos = coneudosInscritos;
    }

    public Set<Conteudo> getConeudosConcluidos() {
        return conteudosConcluidos;
    }

    public void setConeudosConcluidos(Set<Conteudo> coneudosConcluidos) {
        this.conteudosConcluidos = coneudosConcluidos;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Dev dev = (Dev) o;
        return Objects.equals(name, dev.name) && Objects.equals(conteudosInscritos, dev.conteudosInscritos) && Objects.equals(conteudosConcluidos, dev.conteudosConcluidos);
    }

    @Override
    public int hashCode() {
        return Objects.hash(name, conteudosInscritos, conteudosConcluidos);
    }
}
