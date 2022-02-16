package br.com.dio.desafio.dominio;

import java.util.LinkedHashSet;
import java.util.Objects;
import java.util.Optional;
import java.util.Set;

public class Dev {
    private String nome;
    private Set<Conteudo>  conteudoInscritos = new LinkedHashSet<>();
    private Set<Conteudo> conteudoConluidos = new LinkedHashSet<>();

    public void inscreverBootcamp(Bootcamp bootcamp){
        /* ao se increver em um bootcamp todo o conteúdo do bootcamp devem se tornar dísponível.*/
        this.conteudoInscritos.addAll(bootcamp.getConteudos());
        bootcamp.getDevsInscritos().add(this);
    }

    public void progredir(){
        //progredir, temos que mover o conteudo do set de conteudoIncristos para o set de conteudoConcluidos
        Optional<Conteudo> conteudo = this.conteudoInscritos.stream().findFirst();
        if (conteudo.isPresent()){
            this.conteudoConluidos.add(conteudo.get());
            this.conteudoInscritos.remove(conteudo.get());
        } else {
            System.err.println("Você não tem conteúdo");
        }
    }

    public double calcularXP(){
        return this.conteudoConluidos
                .stream()
                .mapToDouble(conteudo -> conteudo.calcularXP())
                .sum();
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public Set<Conteudo> getConteudoInscritos() {
        return conteudoInscritos;
    }

    public void setConteudoInscritos(Set<Conteudo> conteudoInscritos) {
        this.conteudoInscritos = conteudoInscritos;
    }

    public Set<Conteudo> getConteudoConluidos() {
        return conteudoConluidos;
    }

    public void setConteudoConluidos(Set<Conteudo> conteudoConluidos) {
        this.conteudoConluidos = conteudoConluidos;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Dev dev = (Dev) o;
        return Objects.equals(nome, dev.nome) && Objects.equals(conteudoInscritos, dev.conteudoInscritos) && Objects.equals(conteudoConluidos, dev.conteudoConluidos);
    }

    @Override
    public int hashCode() {
        return Objects.hash(nome, conteudoInscritos, conteudoConluidos);
    }
}
