package br.com.dio.desafio.dominio;

public class Curso extends Conteudo{
    private int cargHoraria;



    public int getCargHoraria() {
        return cargHoraria;
    }

    public void setCargHoraria(int cargHoraria) {
        this.cargHoraria = cargHoraria;
    }

    @Override
    public String toString() {
        return "Curso{" +
                "titulo='" + getTitulo() + '\'' +
                ", descricao='" + getDescricao() + '\'' +
                ", cargHoraria=" + cargHoraria +
                '}';
    }

    @Override
    public double calcularXP() {
        return XP_PADRAO * cargHoraria;
    }
}
