///*
// * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
// * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
// */
//import java.util.Set;
//import lombok.extern.slf4j.Slf4j;
//import org.springframework.beans.factory.annotation.Autowired;
//import org.springframework.stereotype.Controller;
//import org.springframework.web.bind.annotation.GetMapping;
//import org.springframework.web.bind.annotation.PostMapping;
//import org.springframework.web.bind.annotation.RequestMapping;
//
///**
// *
// * @author andre
// */
//@Controller
//@Slf4j
//@RequestMapping("/consultas")
//
//public class ConsultasController {
//    
// @Autowired
//    private ProductoService productoService;
//     @GetMapping("/productos")
//    public ResponseEntity<Set<Product>> getProducts(@RequestParam(value = "category", defaultValue = "") String category) {
//        Set<Producto> productos = null;
//        if (category.equals(""))
//            productos = productoService.findAll();
//        else
//            productos = productoService.findByCategory(category);
// 
//        return new ResponseEntity<>(productos, HttpStatus.OK);
//    }
// 
//    @GetMapping("/producto/{id}")
//    public ResponseEntity<Product> getProduct(@PathVariable long id) {
//        Product product = productService.findById(id)
//                .orElseThrow(() -> new ProductNotFoundException(id));
// 
//        return new ResponseEntity<>(product, HttpStatus.OK);
//    }
// 
//    @PostMapping("/productos")
//    public ResponseEntity<Product> addProduct(@RequestBody Product product) {
//        Product addedProduct = productService.addProduct(product);
//        return new ResponseEntity<>(addedProduct, HttpStatus.OK);
//    }
// 
//    @PutMapping("/productos/{id}")
//    public ResponseEntity<Product> modifyProduct(@PathVariable long id, @RequestBody Product newProduct) {
//        Product product = productService.modifyProduct(id, newProduct);
//        return new ResponseEntity<>(product, HttpStatus.OK);
//    }
// 
//    @DeleteMapping("/productos/{id}")
//    public ResponseEntity<Response> deleteProduct(@PathVariable long id) {
//        productService.deleteProduct(id);
//        return ResponseEntity.noContent().build();
//    }
// 
//    @ExceptionHandler(ProductNotFoundException.class)
//    @ResponseBody
//    @ResponseStatus(HttpStatus.NOT_FOUND)
//    public ResponseEntity<Response> handleException(ProductNotFoundException pnfe) {
//        Response response = Response.errorResonse(NOT_FOUND, pnfe.getMessage());
//        return new ResponseEntity<>(response, HttpStatus.NOT_FOUND);
//    }
//}
//}
//
//    
//}
