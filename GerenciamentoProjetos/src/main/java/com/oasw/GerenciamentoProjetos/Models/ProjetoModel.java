package com.oasw.GerenciamentoProjetos.Models;

import jakarta.persistence.*;

import java.time.LocalDate;

@Entity // Serve para criar uma entidade ex:
@Table(name = "tb_projeto")// Altera o nome da tabela
public class ProjetoModel {

    @Id // Identifica a chave primária ex: long id é a chave primária
    @GeneratedValue(strategy = GenerationType.IDENTITY) /* Gera automaticamente os valores da chave primária
                                                           ex: neste caso acontece um auto-incremento no valor da chave primária. */
    private Long id;
    private String nome;
    private LocalDate dataInicio;
    private LocalDate dataFim;

    public ProjetoModel() {
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public LocalDate getDataInicio() {
        return dataInicio;
    }

    public void setDataInicio(LocalDate dataInicio) {
        this.dataInicio = dataInicio;
    }

    public LocalDate getDataFim() {
        return dataFim;
    }

    public void setDataFim(LocalDate dataFim) {
        this.dataFim = dataFim;
    }
}
