package Controllers;

import Models.Institute;
import Models.Methods;
import Models.MyModel;
import Models.Student;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.util.ArrayList;

@WebServlet(name = "BestStudentServlet")
public class BestStudentServlet extends HttpServlet {
    private MyModel mm = new MyModel();
    private Methods me = new Methods();

    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        Institute k = (Institute)mm.getBase();
        me.MethodFindBestStudent(k);
        ArrayList<Student> ar = new ArrayList(me.MethodFindBestStudent(k));
        request.setAttribute("bestStudent", ar);
        RequestDispatcher view = request.getRequestDispatcher("/Views/SeeBestStudent.jsp");
        view.forward(request, response);
    }
}
