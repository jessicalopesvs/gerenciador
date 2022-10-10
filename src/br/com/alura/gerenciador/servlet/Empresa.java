package br.com.alura.gerenciador.servlet;

import java.util.Date;

//Curso - JavaServlet - aula definindo modelo
public class Empresa {

    //declaring the variables
    private int id; //primary key
    private String nome;
    private Date dataAbertura = new Date();

    public Date getDataAbertura() {
        return dataAbertura;
    }

    public void setDataAbertura(Date dataAbertura) {
        this.dataAbertura = dataAbertura;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }
}
