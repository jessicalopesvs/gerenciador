package br.com.alura.gerenciador.servlet;

import java.util.ArrayList;
import java.util.List;

public class Banco {

    private static List<Empresa> lista = new ArrayList<>();

    static {
        Empresa empresa = new Empresa();
        empresa.setNome("Alura");
        Empresa empresa2 = new Empresa();
        empresa2.setNome("Google");
        Empresa empresa3 = new Empresa();
        empresa3.setNome("Caelum");

        lista.add(empresa);
        lista.add(empresa2);
        lista.add(empresa3);
    }

    public void adding(Empresa empresa) {

        lista.add(empresa);


    }

    public List<Empresa> getEmpresas(){
        return Banco.lista;
    }

}
