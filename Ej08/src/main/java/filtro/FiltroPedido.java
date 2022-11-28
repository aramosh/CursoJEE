package filtro;

import java.io.IOException;
import javax.servlet.Filter;
import javax.servlet.FilterChain;
import javax.servlet.FilterConfig;
import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.ServletRequest;
import javax.servlet.ServletResponse;
import javax.servlet.annotation.WebFilter;
import javax.servlet.http.HttpFilter;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * Servlet Filter implementation class FiltroPedido
 */
@WebFilter("/PedidoServlet")
public class FiltroPedido extends HttpFilter implements Filter {
       
    /**
     * @see HttpFilter#HttpFilter()
     */
    public FiltroPedido() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see Filter#destroy()
	 */
	public void destroy() {
		// TODO Auto-generated method stub
	}

	/**
	 * @see Filter#doFilter(ServletRequest, ServletResponse, FilterChain)
	 */
	public void doFilter(ServletRequest request, ServletResponse response, FilterChain chain) throws IOException, ServletException {
		// TODO Auto-generated method stub
		// place your code here
        System.out.println("FiltroPedido -> Tramitando el un nuevo pedido");
		HttpServletRequest rq = (HttpServletRequest) request;
        if(!rq.getParameter("nombre").equals("")) {
    		// pass the request along the filter chain
    		chain.doFilter(request, response);
    		System.out.println("FiltroPedido -> La pizza ha sido registrada en el pedido");
        }else {
        	System.out.println("FiltroPedido -> Debió de rellenar el nombre.\nFiltroPedido -> Mal asunto el tuyo, te quedaste sin pizza");
        	HttpServletResponse rp = (HttpServletResponse) response;
        	rp.sendRedirect("index.jsp");
        }
	}

	/**
	 * @see Filter#init(FilterConfig)
	 */
	public void init(FilterConfig fConfig) throws ServletException {
		// TODO Auto-generated method stub
	}

}
