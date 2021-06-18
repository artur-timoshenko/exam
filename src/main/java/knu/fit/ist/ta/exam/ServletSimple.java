package knu.fit.ist.ta.exam;

import java.io.IOException;
import java.io.PrintWriter;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 *
 * @author Andrey
 */
public class ServletSimple extends HttpServlet {
    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response)
        throws ServletException, IOException {
        String x = request.getParameter("x");
        double param = Double.parseDouble(x);
        double result = CalculateExam.Calculate(param);
        request.setAttribute("result", result);
        request.getRequestDispatcher("exam.jsp").forward(request, response);
    }
}