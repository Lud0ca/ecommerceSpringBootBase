package com.EcomJava.ecommerceSpringBootBase.controller;

import com.EcomJava.ecommerceSpringBootBase.model.DetalleOrden;
import com.EcomJava.ecommerceSpringBootBase.model.Orden;
import com.EcomJava.ecommerceSpringBootBase.model.Producto;
import com.EcomJava.ecommerceSpringBootBase.service.DetalleOrdenService;
import com.EcomJava.ecommerceSpringBootBase.service.OrdenService;
import com.EcomJava.ecommerceSpringBootBase.service.ProductoService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;
import java.util.*;

@Controller
@RequestMapping("/")
public class HomeController {
    @Autowired
    private ProductoService productoService;
    @Autowired
    private OrdenService ordenService;
    @Autowired
    private DetalleOrdenService detalleOrdenService;

    Orden orden = new Orden();
    List<DetalleOrden> detalles = new ArrayList<DetalleOrden>();

    @GetMapping("")
    public String home(Model model) {
        List<Producto> productos = productoService.findAll();
        model.addAttribute("productos", productos);
        return "home";
    }

    @GetMapping("producto/{id}")
    public String productoHome(@PathVariable Integer id, Model model) {
        Producto producto;
        Optional<Producto> optionalProducto = productoService.get(id);
        producto= optionalProducto.get();
        model.addAttribute("producto", producto);
        return "pages/itemdetail";
    }

    @GetMapping("producto")
    public String itemdetail() {
        return "pages/itemdetail";
    }

    @GetMapping("/carrito")
    public String getCart() {
        return "pages/cart";
    }

    @PostMapping("/carrito")
    public String getCart(@RequestParam Integer id, @RequestParam Integer cantidad, Model model) {
        DetalleOrden detalleOrden = new DetalleOrden();
        Producto producto;
        double sumaTotal=0;
        Optional<Producto> productoOptional = productoService.get(id);
        producto = productoOptional.get();
        detalleOrden.setCantidad(cantidad);
        detalleOrden.setProducto(producto);
        detalleOrden.setPrecio(producto.getPrecio());
        detalleOrden.setTotal(cantidad * producto.getPrecio());
        detalleOrden.setProducto(producto);

        // Verificar si el producto no exista dos veces en el carrito
        Integer idProducto = producto.getId();
        boolean ingresado = detalles.stream().anyMatch(p -> p.getProducto().getId()==idProducto);
        if(!ingresado){
            detalles.add(detalleOrden);
        }
        sumaTotal = detalles.stream().mapToDouble(dt -> dt.getTotal()).sum();
        orden.setTotal(sumaTotal);
        model.addAttribute("cart", detalles);
        model.addAttribute("orden", orden);
        return "pages/cart";
    }

    @GetMapping("/orden")
    public String orderdetail() {
        return "pages/orderdetail";
    }

    @GetMapping("/guardarorden")
    public String saveOrder() {
        return "redirect:/";
    }

}
