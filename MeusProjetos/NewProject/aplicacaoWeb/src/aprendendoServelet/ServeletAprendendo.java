package aprendendoServelet;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * Servlet implementation class ServeletAprendendo
 */
public class ServeletAprendendo extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public ServeletAprendendo() {
        super();
        // TODO Auto-generated constructor stub
    }
    

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		String nome = request.getParameter("nome");
		
		PrintWriter out = response.getWriter();
		
		out.print("<html><body><head><title>Resposta do Servidor</title></head>");
		for (int i = 0; i < 5; i++) {
			out.print("<br><h1>Testou Testando meu amigo </h1>" + nome);
		}
		
		out.print("</body></html>");
	}

}
