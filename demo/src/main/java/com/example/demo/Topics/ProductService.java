package com.example.demo.Topics;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Comparator;
import java.util.List;
import java.util.stream.Collectors;

@Service
public class ProductService {
    @Autowired
    ProductRepository productRepository;
    public ProductService() throws ParseException {
    }

    List<ProductEntity> strList = new ArrayList<>(Arrays.asList(
            new ProductEntity("Prod2", "Trousers", "Each", new SimpleDateFormat("yyyy-MM-dd").parse("2022-02-19")),
            (new ProductEntity("Prod1", "Shirts", "Each", new SimpleDateFormat("yyyy-MM-dd").parse("2022-02-21"))),
            (new ProductEntity("Prod3", "Tie", "Each", new SimpleDateFormat("yyyy-MM-dd").parse("2022-02-22"))),
            (new ProductEntity("Prod4", "Tie", "Each", new SimpleDateFormat("yyyy-MM-dd").parse("2022-02-24")))));

    public List<ProductEntity> getProductList() {


        List<ProductEntity> sortedProductListAsc = strList
                .stream()
                .sorted(Comparator.comparing(ProductEntity::getLaunchDate))
                .collect(Collectors.toList());
        System.out.println("\n\nAscending-order sorting on the basis of Created Date :- \n");
        sortedProductListAsc.stream().forEach(prod -> System.out.println(prod));
        return sortedProductListAsc;
    }
    public void setProductList(ProductEntity productEntity){
        productRepository.save(productEntity);

    }
}

