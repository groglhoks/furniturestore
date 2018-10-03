package ru.vershinin.furniture.store.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.RequestMapping;
import ru.vershinin.furniture.store.model.MenuItem;
import ru.vershinin.furniture.store.model.Product;
import ru.vershinin.furniture.store.service.MenuService;
import ru.vershinin.furniture.store.service.ProductService;


import java.util.List;

@Controller
public class WebController {

    @Autowired
    private MenuService menuService;
    @Autowired
    private ProductService productService;

    @RequestMapping(value = {"/", "/about_us"})
    public String stratPage(ModelMap model) throws Exception {


        String pageLabel = "ABOUT US";
        List<MenuItem> menuItems = menuService.getMenuListWithActiveElement(pageLabel);

        model.addAttribute("menuItems", menuItems);
        model.addAttribute("pageLabel", pageLabel);
        return "startpage";
    }

    @RequestMapping("/furniture")
    public String furniturePage(ModelMap model) throws Exception {



        productService.deleteAll();
        productService.generateProducts(10);

        Iterable<Product> products = productService.getAllProducts();
//        for (Product product: products) {
//            System.out.println("name " + product.getName());
//        }

        String pageLabel = "FURNITURE";
        List<MenuItem> menuItems = menuService.getMenuListWithActiveElement(pageLabel);
        model.addAttribute("menuItems", menuItems);
        model.addAttribute("pageLabel", pageLabel);
        model.addAttribute("products", products);
        return "furniture";
    }

    @RequestMapping("/special_offer")
    public String SpecialOfferPage(ModelMap model) throws Exception {

        String pageLabel = "SPECIAL OFFER";
        List<MenuItem> menuItems = menuService.getMenuListWithActiveElement(pageLabel);
        model.addAttribute("menuItems", menuItems);
        model.addAttribute("pageLabel", pageLabel);
        return "startpage";
    }

    @RequestMapping("/news")
    public String newsPage(ModelMap model) throws Exception {

        String pageLabel = "NEWS";
        List<MenuItem> menuItems = menuService.getMenuListWithActiveElement(pageLabel);
        model.addAttribute("menuItems", menuItems);
        model.addAttribute("pageLabel", pageLabel);
        return "startpage";
    }

    @RequestMapping("/contacts")
    public String contactsPage(ModelMap model) throws Exception {

        String pageLabel = "CONTACTS";
        List<MenuItem> menuItems = menuService.getMenuListWithActiveElement(pageLabel);
        model.addAttribute("menuItems", menuItems);
        model.addAttribute("pageLabel", pageLabel);
        return "startpage";
    }

}
