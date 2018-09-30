

package com.niit.shopfrontend.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import com.niit.shopbackend.dao.CategoryRepository;
import com.niit.shopbackend.dao.ProductRepository;
import com.niit.shopbackend.model.Category;
import com.niit.shopbackend.model.Product;



@Controller

public class HomeController {
	@Autowired
	Product product;
@Autowired
private Category category;

@Autowired
CategoryRepository categoryRepository;
@Autowired
ProductRepository productRepository;

@RequestMapping("/")
public String homePage()
 {
	return "index";
	
 }

@RequestMapping("/Category")
public String categoryPage(Model model)
 {
	List<Category> allCategories= categoryRepository.getAllCategories();
	model.addAttribute("cat",category);
	model.addAttribute("categoryList",allCategories);
	return "Category";
 }

@RequestMapping("/Product")
public String productPage(Model model)
{  
	List<Product> allProducts= productRepository.getAllProduct();
	List<Category> allCategories= categoryRepository.getAllCategory();
	model.addAttribute("prod",product);
	model.addAttribute("productList",allProducts);
	model.addAttribute("categoryList",allCategories);
	return "Product";
	
}

}
