package my.buffalocow.servlet;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;
import java.io.IOException;

public class GameServlet extends HttpServlet {

    protected void doPost(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        HttpSession session = request.getSession();


    }

    /**
     * Method starts new GameSession (if it not started already) and forward to game.jsp.
     * @see my.buffalocow.mechanics.GameSession
     **/
    protected void doGet(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
//        HttpSession session = request.getSession();
//
//        if (session.getAttribute("gameSession") == null) {
//            GameSession gameSession = new GameSession();
//            session.setAttribute("gameSession", gameSession);
//            gameSession.init();
//        }
//
//        getServletContext().getRequestDispatcher("/game").forward(request, response);
    }
}
