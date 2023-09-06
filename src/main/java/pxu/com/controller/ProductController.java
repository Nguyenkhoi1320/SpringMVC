package pxu.com.controller;

import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.ModelAndView;

import pxu.com.model.Product;
import pxu.com.service.ProductService;

@Controller
public class ProductController {
	@Autowired
	public ProductService productService;

	@GetMapping("/products")
	public ModelAndView List() {
		List<Product> products = this.productService.findAll();
		ModelAndView modelAndView = new ModelAndView("product/list");
		modelAndView.addObject("products", products);
		return modelAndView;
	}

	@GetMapping("/new")
	public ModelAndView showCreateform() {
		ModelAndView modelAndView = new ModelAndView("product/create");
		modelAndView.addObject("product", new Product());
		return modelAndView;
	}

	@GetMapping("/new")
	public ModelAndView createProduct(@ModelAttribute("product") Product product) {
		int randomId = (int) (Math.random() * 10000);
		product.setId(randomId);
		this.productService.save(product);
		ModelAndView modelAndView = new ModelAndView("product/create");
		modelAndView.addObject("product", new Product());
		modelAndView.addObject("message", "new product was created");
		return modelAndView;
	}

	@GetMapping("/view")
	public ModelAndView view(@RequestParam("id") Integer productId) {
		Product product = this.productService.findById(productId);
		ModelAndView modelAndView = new ModelAndView("product/view");
		modelAndView.addObject("product", product);
		return modelAndView;
	}
}
