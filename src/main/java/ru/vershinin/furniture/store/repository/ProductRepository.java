package ru.vershinin.furniture.store.repository;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Repository;
import ru.vershinin.furniture.store.model.Product;

@Repository
public interface ProductRepository extends CrudRepository<Product, Long> {
}
