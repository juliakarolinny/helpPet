package com.helpPet.helpPet.Entity;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;

import java.time.LocalDate;

@Entity
public class Animal {
    @Id  @GeneratedValue(strategy = GenerationType.IDENTITY)
    private long id;
    private String nome;
    private Especies especie;
    private Sexo sexo;
    private LocalDate dataNascimento;
    private double peso;
    private String cor;
    private Vacinacao vacinacao;
    private String observacao;

    public Animal() {}
    public Animal(String nome, Especies especie, Sexo sexo, LocalDate dataNascimento, double peso, String cor, Vacinacao vacinacao, String observacao) {
        this.nome = nome;
        this.especie = especie;
        this.sexo = sexo;
        this.dataNascimento = dataNascimento;
        this.peso = peso;
        this.cor = cor;
        this.vacinacao = vacinacao;
        this.observacao = observacao;
    }

    public Animal(long id, String nome, Especies especie, Sexo sexo, LocalDate dataNascimento, double peso, String cor, Vacinacao vacinacao, String observacao) {
        this.id = id;
        this.nome = nome;
        this.especie = especie;
        this.sexo = sexo;
        this.dataNascimento = dataNascimento;
        this.peso = peso;
        this.cor = cor;
        this.vacinacao = vacinacao;
        this.observacao = observacao;
    }

    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public Especies getEspecie() {
        return especie;
    }

    public void setEspecie(Especies especie) {
        this.especie = especie;
    }

    public Sexo getSexo() {
        return sexo;
    }

    public void setSexo(Sexo sexo) {
        this.sexo = sexo;
    }

    public LocalDate getDataNascimento() {
        return dataNascimento;
    }

    public void setDataNascimento(LocalDate dataNascimento) {
        this.dataNascimento = dataNascimento;
    }

    public double getPeso() {
        return peso;
    }

    public void setPeso(double peso) {
        this.peso = peso;
    }

    public String getCor() {
        return cor;
    }

    public void setCor(String cor) {
        this.cor = cor;
    }

    public Vacinacao getVacinacao() {
        return vacinacao;
    }

    public void setVacinacao(Vacinacao vacinacao) {
        this.vacinacao = vacinacao;
    }

    public String getObservacao() {
        return observacao;
    }

    public void setObservacao(String observacao) {
        this.observacao = observacao;
    }

    @Override
    public String toString() {
        return "Animal{" +
                "id=" + id +
                ", nome='" + nome + '\'' +
                ", especie=" + especie +
                ", sexo=" + sexo +
                ", dataNascimento=" + dataNascimento +
                ", peso=" + peso +
                ", cor='" + cor + '\'' +
                ", vacinacao=" + vacinacao +
                ", observacao='" + observacao + '\'' +
                '}';
    }
}
