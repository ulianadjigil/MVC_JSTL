package Controllers;

import Models.Institute;
import Models.Methods;
import Models.MyModel;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;

@WebServlet(name = "BiggestFacultyServlet")
public class BiggestFacultyServlet extends HttpServlet {
    private MyModel mm = new MyModel();
    private Methods me = new Methods();

    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        Institute k = (Institute)mm.getBase();
        Object obj = me.MethodFindBiggestFaculty(k);

        request.setAttribute("biggestFaculty", obj);
        RequestDispatcher view = request.getRequestDispatcher("/Views/SeeBiggestFaculty.jsp");
        view.forward(request, response);
    }
}
