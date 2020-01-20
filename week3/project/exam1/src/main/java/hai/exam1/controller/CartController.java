/*
 *************************************
 * Created by IntelliJ IDEA          *
 * user: demo                     *
 * CodeGym     *
 * Date: 7/25/2019                     *
 * Time: 2:30 PM                     *
 *************************************
 */

package hai.exam1.controller;


import hai.exam1.model.Cart;
import hai.exam1.model.Item;
import hai.exam1.model.Product;
import hai.exam1.service.CartService;
import hai.exam1.service.CategoryService;
import hai.exam1.service.ItemService;
import hai.exam1.service.ProductService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.servlet.ModelAndView;

import javax.servlet.http.HttpSession;
import java.util.ArrayList;
import java.util.List;

@Controller
@RequestMapping("cart")
@SessionAttributes("item")
public class CartController {
    @Autowired
    private ProductService productService;
    @Autowired
    private CartService cartService;
    @Autowired
    private ItemService itemService;
    @Autowired
    private CategoryService categoryService;


    @ModelAttribute("item")
    public List<Item> getCart() {
        List<Item> items = new ArrayList<>();
        return items;
    }

    @ModelAttribute("cart")
    public List<Cart> getCarts() {
        List<Cart> cart = new ArrayList<>();
        return cart;
    }

    @ModelAttribute("cart")
    private Cart cart() {
        return new Cart();
    }

    @GetMapping("/cart")
    public ModelAndView showCart() {
        Iterable<Item> items = itemService.findAll();
        ModelAndView modelAndView = new ModelAndView("/cart/cart");
        modelAndView.addObject("categories", categoryService.findAll());
        modelAndView.addObject("items", items);
        return modelAndView;
    }

    @GetMapping("/buy/{id}")
    public String buy(@PathVariable int id, HttpSession session, Model model) {

        Item item;
        List<Item> cart;
        double total = 0;
        if (session.getAttribute("cart") == null) {
            cart = new ArrayList<>();
            Product product = productService.findId((long) id);
            item = new Item(product, 1);
            cart.add(item);
            session.setAttribute("cart", cart);
            total = product.getPrice();

        } else {
            cart = (List<Item>) session.getAttribute("cart");
            int index = this.isExisting(id, cart);
            if (index == -1) {
                Product product = productService.findId((long) id);
                item = new Item(product, 1);
                cart.add(item);
            } else {
                int quantity = cart.get(index).getQuantity() + 1;
                cart.get(index).setQuantity(quantity);
            }
            session.setAttribute("cart", cart);
            for (int i = 0; i < cart.size(); i++) {
                total += cart.get(i).getProduct().getPrice() * cart.get(i).getQuantity();
            }
        }
        model.addAttribute("cart", cart);
        model.addAttribute("total", total);
        return "/cart/cart";
    }

    @GetMapping("/remove/{id}")
    public String remove(@PathVariable int id, HttpSession session, Model model) {
        List<Item> cart = (List<Item>) session.getAttribute("cart");
        int index = this.isExisting(id, cart);
        cart.remove(index);
        session.setAttribute("cart", cart);
        double total = 0;
        for (int i = 0; i < cart.size(); i++) {
            total += cart.get(i).getProduct().getPrice() * cart.get(i).getQuantity();
        }
        model.addAttribute("cart", cart);
        model.addAttribute("total", total);
        return "/cart/cart";
    }

    @GetMapping("/quantity/{operator}/{id}")
    public String quantity(@PathVariable String operator, @PathVariable Long id,HttpSession session,Model model) {
        List<Item> itemList= (List<Item>) session.getAttribute("cart");

        int quantity = 1;
        double total=0;
        for (Item item: itemList) {
            if (id.equals(item.getProduct().getId())) {
                if (operator.equals("add")) {
                    item.setQuantity(item.getQuantity() + quantity);
                } else {
                    if (item.getQuantity() != 1) {
                        item.setQuantity(item.getQuantity() - quantity);
                    }
                }
            }

        }
        for (int i = 0; i < itemList.size(); i++) {
            total += itemList.get(i).getProduct().getPrice() * itemList.get(i).getQuantity();
        }

        session.setAttribute("cart", itemList);
        model.addAttribute("cart", itemList);

        model.addAttribute("total",total);
        return "/cart/cart";
    }

    private int isExisting(int id, List<Item> cart) {
        for (int i = 0; i < cart.size(); i++) {
            if (cart.get(i).getProduct().getId() == id) {
                return i;
            }
        }
        return -1;
    }

}


