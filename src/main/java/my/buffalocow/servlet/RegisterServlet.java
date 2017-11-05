package my.buffalocow.servlet;

import my.buffalocow.services.AccountService;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;
import java.io.IOException;

public class RegisterServlet extends HttpServlet {
    protected void doPost(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        HttpSession session = request.getSession();
        AccountService accountService = AccountService.getInstance();

        String login = request.getParameter("login");
        char[] password = request.getParameter("password").toCharArray();
        accountService.register(login, password);
        accountService.login(session, login, password);
    }

    protected void doGet(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        doPost(request, response);
    }
}
