package fit.edu.iuh.vn.labweek1www.controllers;

import fit.edu.iuh.vn.labweek1www.models.Account;
import fit.edu.iuh.vn.labweek1www.responsitories.AccountRepositories;

import jakarta.servlet.RequestDispatcher;
import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;

import java.io.IOException;
import java.io.PrintWriter;

@WebServlet(name = "accountServlet")
public class ControllerServlet extends HttpServlet {
    private Account account = null;
    private RequestDispatcher requestDispatcher = null;

    public ControllerServlet() throws Exception {
    }




    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        String login = req.getParameter("login");

        handleLogin(req, resp);
    }

    @Override
    protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        String action = req.getParameter("action");
        System.out.println(action);
    }

    public void handleLogin(HttpServletRequest req, HttpServletResponse reqs) throws ServletException, IOException {


        String email = req.getParameter("email");
        String password = req.getParameter("psw");

        account = AccountRepositories.getAccountByEmailAndPassword(email,password);
        if (account != null){
            req.setAttribute("accountId", account.getAccountId());
            req.setAttribute("fullName", account.getFullname());
            req.setAttribute("email", account.getEmail());
            req.setAttribute("phone", account.getPhone());
            requestDispatcher = getServletContext().getRequestDispatcher("/dashboard.jsp");
            requestDispatcher.forward(req,reqs);
        }
        else
            System.out.println("Sai");

    }
}
