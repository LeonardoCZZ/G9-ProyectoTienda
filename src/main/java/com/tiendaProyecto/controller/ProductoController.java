/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.tiendaProyecto.controller;

import com.tiendaProyecto.domain.Categoria;
import com.tiendaProyecto.domain.Producto;
import com.tiendaProyecto.service.CategoriaService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import com.tiendaProyecto.service.ProductoService;
import com.tiendaProyecto.service.impl.FirebaseStorageServiceImpl;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.multipart.MultipartFile;

@Controller
@RequestMapping("/producto")
public class ProductoController {
    @Autowired
    private ProductoService productoService;
    @Autowired
    private CategoriaService categoriaService;

    @GetMapping("/listado")
    public String listado(Model model) {
        var productos = productoService.getProductos(false);
        var categorias = categoriaService.getCategorias(false);
        model.addAttribute("productos", productos);
        model.addAttribute("totalProductos", productos.size());
        model.addAttribute("categorias", categorias);
        return "/producto/listado";
    }

    @GetMapping("/listado/{idCategoria}")
    public String listado(Model model, Categoria categoria) {
        var productos = categoriaService.getCategoria(categoria).getProductos();
        var categorias = categoriaService.getCategorias(false);
        model.addAttribute("productos", productos);
        model.addAttribute("totalProductos", productos.size());
        model.addAttribute("categorias", categorias);
        return "/producto/listado";
    }
    
     @GetMapping("/nuevo")
    public String productoNuevo(Producto producto){
        return "/producto/modifica";
    }
    
    @Autowired
    private FirebaseStorageServiceImpl firebaseStorageService;
    
    @PostMapping ("/guardar")
    public String productoGuardar(Producto producto,
            @RequestParam("imagenFile")MultipartFile imagenFile){
        if (!imagenFile.isEmpty()){
            productoService.save(producto);
            producto.setRutaImagen(
            firebaseStorageService.cargaImagen(
                    imagenFile,
                    "producto",
                    producto.getIdProducto()));
        }
        productoService.save(producto);
        return "redirect:/producto/listado";
    }
    
    
    @GetMapping("/eliminar/{idProducto}")
    public String productoEliminar(Producto producto){
        productoService.delete(producto);
        return "redirect:/producto/listado";
    }
    
    @GetMapping("/modificar/{idProducto}")
    public String productoModificar(Producto producto, Model model){
        producto = productoService.getProducto(producto);
        model.addAttribute("producto", producto);
        return "/producto/modifica";
    }

}