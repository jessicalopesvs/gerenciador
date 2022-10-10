package br.com.alura.gerenciador.servlet;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.io.PrintWriter;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;


@WebServlet(name = "NovaEmpresaServlet", value = "/nova-empresa")
public class NovaEmpresaServlet extends HttpServlet {

    private static final long serialVersionUID = 1L;

    @Override
    protected void service(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        System.out.println("Cadastrando nova empresa");
        String nomeEmpresa = req.getParameter("nome");
        String paramDataEmpresa = req.getParameter("data");
        Date dataAbertura =null;

        //formatando e convertendo a data
        try{
            SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy");
            dataAbertura = sdf.parse(paramDataEmpresa);}
        catch (ParseException e){
            throw new ServletException(e);//showing the exception  original problem| "catch and rethrow"
        }

        //cadastrando no objeto empresa
        Empresa empresa = new Empresa();
        empresa.setNome(nomeEmpresa);
        empresa.setDataAbertura(dataAbertura);

        //adicionando no banco de dados simulado como linked list;
        Banco banco = new Banco();
        banco.adding(empresa);

        PrintWriter out = resp.getWriter();
//        out.println("<html><body> Empresa " + nomeEmpresa + " cadastrada com sucesso </body></html>");

        //chamar o jsp -- utilizando a requisiçao
        RequestDispatcher rd = req.getRequestDispatcher("/nova-empresa-criada.jsp");
        req.setAttribute("empresa",empresa.getNome());//jogar atributo dentro da requisiçao
        rd.forward(req, resp);//ativando o RequestDispatcher

        System.out.println("Cadastrando nova empresa: " + nomeEmpresa);

    }
}
