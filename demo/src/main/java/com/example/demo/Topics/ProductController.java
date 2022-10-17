package com.example.demo.Topics;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/Items")
public class ProductController {
    @Autowired
    ProductService productService;
    @RequestMapping("/List")
    @GetMapping
public List<ProductEntity>getProductList(){
    return productService.getProductList();
}
@RequestMapping(method = RequestMethod.POST, value = "/sortProducts")
public void setProductList(ProductEntity productEntity){
        productService.setProductList(productEntity);
}
}
