package gtv.spring.mvc.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import gtv.spring.mvc.entity.Customer;
import gtv.spring.mvc.service.CustomerService;

@Controller
@RequestMapping("/customer")
public class CustomerController {
	@Autowired
	private CustomerService customerService;

	@RequestMapping("/list")
	// or It can be @GetMappint("/list) only handle get requests
	public String listCustomers(Model model) {

		List<Customer> customers = customerService.getCustomers();
		model.addAttribute("customers", customers);
		return "list-customers";
	}

	@GetMapping("/showFormForAdd")
	public String showFormForAdd(Model model) {
		Customer customer = new Customer();
		model.addAttribute("customer", customer);
		return "customer-form";
	}

	@PostMapping("/addCustomer")
	public String saveOrUpdateCustomer(@ModelAttribute("customer") Customer customer) {
		customerService.saveOrUpdateCustomer(customer);
		return "redirect:/customer/list";
	}

	@GetMapping("/showFormForUpdate")
	public String showFormForUpdate(@ModelAttribute("customerId") int id, Model model) {
		Customer customer = customerService.getCustomer(id);
		model.addAttribute("customer", customer);
		return "customer-form";
	}

	@GetMapping("/deleteCustomer")
	public String deleteCustomer(@ModelAttribute("customerId") int id) {
		customerService.deleteCustomer(id);
		return "redirect:/customer/list";
	}
}
