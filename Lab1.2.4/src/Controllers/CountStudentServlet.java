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

@WebServlet(name = "CountStudent")
public class CountStudentServlet extends HttpServlet {
    private MyModel mm = new MyModel();
    private Methods me = new Methods();

    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        Institute k = (Institute)mm.getBase();
        Object obj = me.MethodCountAllStudent(k);
        request.setAttribute("studentAmount", obj);
        RequestDispatcher view = request.getRequestDispatcher("/Views/SeeCountStudent.jsp");
        view.forward(request, response);
    }
}