package hai.Thymeleaf.controller;
import hai.Thymeleaf.model.Customer;
import hai.Thymeleaf.services.CustomerService;
import hai.Thymeleaf.services.CustomerServiceIpmls;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.ModelAndView;
import org.springframework.web.servlet.mvc.support.RedirectAttributes;

import java.util.ArrayList;
import java.util.List;


@Controller
public class CustomerController {
   private CustomerService customerService = new CustomerServiceIpmls();
   @GetMapping("/")
    public String index(Model model){
       model.addAttribute("customers",customerService.findAll());
       return "index";
   }
   @GetMapping("/customer/create")
   public String create(Model model) {
      model.addAttribute("customer", new Customer());
      return "create";
   }
   @PostMapping("/customer/save")
   public String save(Customer customer, RedirectAttributes redirect){
      customer.setId((int)(Math.random()*1000));
      customerService.save(customer);
      redirect.addFlashAttribute("message","a new customer was add");
      return "redirect:/";
   }
   @GetMapping("/customer/{id}/edit")
   public String edit(@PathVariable int id, Model model){
      Customer customer = this.customerService.findById(id);
      model.addAttribute("customer",customer);
      return "edit";
   }
   @PostMapping("/customer/edit")
   public String update(Customer customer,RedirectAttributes redirect){
      this.customerService.update(customer.getId(),customer);
      redirect.addFlashAttribute("message", "a new customer was update");
      return "redirect:/";

   }
   @GetMapping("/customer/{id}/delete")
   public String remove(@PathVariable int id,Model model){
      Customer customer = this.customerService.findById(id);
      model.addAttribute("customer",customer);
      return "delete";
   }
   @PostMapping("/customer/delete")
   public String delete(Customer customer, RedirectAttributes redirect){
      this.customerService.remove(customer.getId());
      redirect.addFlashAttribute("message","a new customer was remove");
      return "redirect:/";
   }
   @GetMapping("/customer/{id}/view")
   public String view(@PathVariable int id,Model model){
      Customer customer = this.customerService.findById(id);
      model.addAttribute("customer",customer);
      return "view";
   }
   @PostMapping("/customer/search")
      public ModelAndView search(@RequestParam("txtsearch") String txtsearch ){
      List<Customer>customer = new ArrayList<>();
      List<Customer>customerList = this.customerService.findByName(txtsearch);
      for (Customer names:customerList){
         if (names.getName().toLowerCase().contains(txtsearch.toLowerCase())){
            customer.add(names);
         }

      }
      ModelAndView modelAndView = new ModelAndView("index");
      modelAndView.addObject("customers",customer);
      return modelAndView;

   }
}
