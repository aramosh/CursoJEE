package controlador;

import java.io.IOException;
import java.util.Arrays;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import modelo.entidad.Cliente;
import modelo.entidad.Pizza;
import modelo.negocio.Pedido;

/**
 * Servlet implementation class PedidoServlet
 */
@WebServlet("/PedidoServlet")
public class PedidoServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public PedidoServlet() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		Cliente c = new Cliente();
		c.setNombre(request.getParameter("nombre"));
		Pizza p = new Pizza();
		p.setSize(request.getParameter("size"));
		p.setIngredientes( Arrays.asList( request.getParameterValues("ingredientes") ) );
		p.setPrice(Pedido.calcular(p));
		c.setPizza(p);
		RequestDispatcher rd = request.getRequestDispatcher("resultado.jsp");
		request.setAttribute("cliente", c);
		rd.forward(request, response);
	}

}
