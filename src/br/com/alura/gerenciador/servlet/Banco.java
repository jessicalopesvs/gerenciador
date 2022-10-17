package br.com.alura.gerenciador.servlet;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class Banco {

    private static List<Empresa> lista = new ArrayList<>();
    private static Integer chaveSequencial = 1;

    static {
        Empresa empresa = new Empresa();
        empresa.setId(chaveSequencial++);
        empresa.setNome("Alura");
        Empresa empresa2 = new Empresa();
        empresa2.setId(chaveSequencial++);
        empresa2.setNome("Google");
        Empresa empresa3 = new Empresa();
        empresa3.setId(chaveSequencial++);
        empresa3.setNome("Caelum");

        lista.add(empresa);
        lista.add(empresa2);
        lista.add(empresa3);
    }

    public void adding(Empresa empresa) {
        empresa.setId(Banco.chaveSequencial++);//gerando id automático
        lista.add(empresa);
    }

    public List<Empresa> getEmpresas(){
        return Banco.lista;
    }

    public void removeEmpresa(Integer id) {

         Iterator<Empresa> it = lista.iterator();

         while (it.hasNext()){
             Empresa emp = it.next();
             if (emp.getId() == id){
                 it.remove(); //removendo pelo iterator
             }
         }
//        for (Empresa empresa : lista){
//            if (empresa.getId() == id){
//                lista.remove(empresa);
//            }
//        }
    }
}
