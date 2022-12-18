package br.com.ada.projeto.formula1;

import java.time.LocalTime;

public class Piloto {
    private String nomePiloto;
    private Integer numeroCarro;
    private Sexo sexo;
    private String nomeEquipe;
    private LocalTime tempoPorVolta;


    private Piloto(String nomePiloto, Integer numeroCarro, Sexo sexo, String nomeEquipe, LocalTime tempoPorVolta) {
        this.nomePiloto = nomePiloto;
        this.numeroCarro = numeroCarro;
        this.sexo = sexo;
        this.nomeEquipe = nomeEquipe;
        this.tempoPorVolta = tempoPorVolta;
    }

    public Piloto() {
    }

    @Override
    public String toString() {
        return
                "Nome do Piloto = " + nomePiloto +
                        ", Número do Carro = " + numeroCarro +
                        ", Sexo = " + sexo +
                        ", Nome da Equipe = " + nomeEquipe +
                        ", Tempo Por Volta = " + tempoPorVolta;
    }

    public static class PilotoBuilder {
        private String nomePiloto;
        private Integer numeroCarro;
        private Sexo sexo;
        private String nomeEquipe;
        private LocalTime tempoPorVolta;

        public PilotoBuilder() {
        }

        public PilotoBuilder nomePiloto(String nomePiloto) {
            this.nomePiloto = nomePiloto;
            return this;
        }

        public PilotoBuilder numeroCarro(Integer numeroCarro) {
            this.numeroCarro = numeroCarro;
            return this;
        }

        public PilotoBuilder sexo(Sexo sexo) {
            this.sexo = sexo;
            return this;
        }

        public PilotoBuilder nomeEquipe(String nomeEquipe) {
            this.nomeEquipe = nomeEquipe;
            return this;
        }

        public PilotoBuilder tempoPorVolta(LocalTime tempoPorVolta) {
            this.tempoPorVolta = tempoPorVolta;
            return this;
        }

        public Piloto criarPiloto() {
            return new Piloto(nomePiloto, numeroCarro, sexo, nomeEquipe, tempoPorVolta);
        }

    }

    public String getNomePiloto() {
        return nomePiloto;
    }

    public void setNomePiloto(String nomePiloto) {
        this.nomePiloto = nomePiloto;
    }

    public Integer getNumeroCarro() {
        return numeroCarro;
    }

    public void setNumeroCarro(Integer numeroCarro) {
        this.numeroCarro = numeroCarro;
    }

    public Sexo getSexo() {
        return sexo;
    }

    public void setSexo(Sexo sexo) {
        this.sexo = sexo;
    }

    public String getNomeEquipe() {
        return nomeEquipe;
    }

    public void setNomeEquipe(String nomeEquipe) {
        this.nomeEquipe = nomeEquipe;
    }

    public LocalTime getTempoPorVolta() {
        return tempoPorVolta;
    }

    public void setTempoPorVolta(LocalTime tempoPorVolta) {
        this.tempoPorVolta = tempoPorVolta;
    }
}
