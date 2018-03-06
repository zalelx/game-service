package my.buffalocow.servlet;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;

public class RegisterServlet extends HttpServlet {
    protected void doPost(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        auth(request, response);
    }

    protected void doGet(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        response.setStatus(HttpServletResponse.SC_FORBIDDEN);
    }

    private void auth(HttpServletRequest request, HttpServletResponse response) throws IOException {
//        HttpSession session = request.getSession();
//        AccountService accountService = AccountService.getInstance();
//
//        String login = request.getParameter("username");
//        String password = request.getParameter("password");
//        if (!isInputValid(login, password)) {
//            response.setStatus(HttpServletResponse.SC_BAD_REQUEST);
//            PrintWriter writer = response.getWriter();
//            writer.println("Username and/or password can not be null!");
//        }
//        char[] chars = password.toCharArray();
//        accountService.register(login, chars);
//        accountService.login(session, login, chars);
//        response.sendRedirect("/index.html");
    }

    private boolean isInputValid(String login, String password) {
        return login != null && password != null;
    }
}
