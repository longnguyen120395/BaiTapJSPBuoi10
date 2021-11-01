package cybersoft.javabackend.java14.jsp.jstl.servlet;

import java.io.IOException;

import cybersoft.javabackend.java14.jsp.jstl.model.Product;
import cybersoft.javabackend.java14.jsp.jstl.service.ProductService;
import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;


@WebServlet (name = "productServlet" ,urlPatterns = "/products")
public class ProductServlet extends HttpServlet{
	private ProductService ps ;
	
	
	@Override
	public void init() throws ServletException {
		super.init();
		ps = new ProductService();
	}
	@Override
	protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		//ProductService ps = new ProductService();
		req.setAttribute("products",ps.getProduct());
		
		req.getRequestDispatcher("/WEB-INF/views/product.jsp")
		.forward(req, resp);
	
	}
		
	@Override
	protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		String nameProduct = req.getParameter("name");
		int quantityProduct =Integer.parseInt(req.getParameter("quantity")); 
		float priceProduct = Float.parseFloat(req.getParameter("price"));
		
		Product p1 = new Product(nameProduct, quantityProduct, priceProduct);
		
		//ProductService ps = new ProductService();
		
		ps.addProduct(p1);
		
		resp.sendRedirect(req.getContextPath() + "/products");
	}
}