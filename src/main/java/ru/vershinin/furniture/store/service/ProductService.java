package ru.vershinin.furniture.store.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import ru.vershinin.furniture.store.model.Product;
import ru.vershinin.furniture.store.repository.ProductRepository;

import java.util.ArrayList;
import java.util.List;

@Service
public class ProductService {

    @Autowired
    private ProductRepository productRepository;

    public void generateProducts(int count) {

        List<Product> products = new ArrayList<Product>();

        for (int i = 0; i < count; i++) {
            products.add(
                    Product.builder().name("name " + i).description("description " + i).build()
            );
        }

        productRepository.saveAll(products);
    }

    public Iterable<Product> getAllProducts(){
        Iterable<Product> all = productRepository.findAll();
        return all;
    }

    public void deleteAll(){
        productRepository.deleteAll();
    }



}
